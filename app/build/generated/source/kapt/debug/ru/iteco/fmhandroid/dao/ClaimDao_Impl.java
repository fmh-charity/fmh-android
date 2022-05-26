package ru.iteco.fmhandroid.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import ru.iteco.fmhandroid.dto.Claim;
import ru.iteco.fmhandroid.dto.ClaimComment;
import ru.iteco.fmhandroid.dto.FullClaim;
import ru.iteco.fmhandroid.entity.ClaimEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ClaimDao_Impl implements ClaimDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ClaimEntity> __insertionAdapterOfClaimEntity;

  private final ClaimClaimStatusConverter __claimClaimStatusConverter = new ClaimClaimStatusConverter();

  public ClaimDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClaimEntity = new EntityInsertionAdapter<ClaimEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ClaimEntity` (`id`,`title`,`description`,`creatorId`,`creatorName`,`executorId`,`executorName`,`createDate`,`planExecuteDate`,`factExecuteDate`,`status`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ClaimEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getCreatorId());
        if (value.getCreatorName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreatorName());
        }
        if (value.getExecutorId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getExecutorId());
        }
        if (value.getExecutorName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getExecutorName());
        }
        stmt.bindLong(8, value.getCreateDate());
        stmt.bindLong(9, value.getPlanExecuteDate());
        if (value.getFactExecuteDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getFactExecuteDate());
        }
        final String _tmp = __claimClaimStatusConverter.fromClaimStatus(value.getStatus());
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp);
        }
      }
    };
  }

  @Override
  public Object insertClaim(final ClaimEntity claim, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClaimEntity.insert(claim);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object insertClaim(final List<ClaimEntity> claims, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClaimEntity.insert(claims);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object getAllClaims(final Continuation<? super List<FullClaim>> arg0) {
    final String _sql = "SELECT * FROM ClaimEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<FullClaim>>() {
      @Override
      public List<FullClaim> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorId");
            final int _cursorIndexOfCreatorName = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorName");
            final int _cursorIndexOfExecutorId = CursorUtil.getColumnIndexOrThrow(_cursor, "executorId");
            final int _cursorIndexOfExecutorName = CursorUtil.getColumnIndexOrThrow(_cursor, "executorName");
            final int _cursorIndexOfCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createDate");
            final int _cursorIndexOfPlanExecuteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "planExecuteDate");
            final int _cursorIndexOfFactExecuteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "factExecuteDate");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final LongSparseArray<ArrayList<ClaimComment>> _collectionComments = new LongSparseArray<ArrayList<ClaimComment>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
                ArrayList<ClaimComment> _tmpCommentsCollection = _collectionComments.get(_tmpKey);
                if (_tmpCommentsCollection == null) {
                  _tmpCommentsCollection = new ArrayList<ClaimComment>();
                  _collectionComments.put(_tmpKey, _tmpCommentsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipClaimCommentEntityAsruItecoFmhandroidDtoClaimComment(_collectionComments);
            final List<FullClaim> _result = new ArrayList<FullClaim>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final FullClaim _item;
              final Claim _tmpClaim;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfCreatorId) && _cursor.isNull(_cursorIndexOfCreatorName) && _cursor.isNull(_cursorIndexOfExecutorId) && _cursor.isNull(_cursorIndexOfExecutorName) && _cursor.isNull(_cursorIndexOfCreateDate) && _cursor.isNull(_cursorIndexOfPlanExecuteDate) && _cursor.isNull(_cursorIndexOfFactExecuteDate) && _cursor.isNull(_cursorIndexOfStatus))) {
                final Integer _tmpId;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmpId = null;
                } else {
                  _tmpId = _cursor.getInt(_cursorIndexOfId);
                }
                final String _tmpTitle;
                if (_cursor.isNull(_cursorIndexOfTitle)) {
                  _tmpTitle = null;
                } else {
                  _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                }
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final int _tmpCreatorId;
                _tmpCreatorId = _cursor.getInt(_cursorIndexOfCreatorId);
                final String _tmpCreatorName;
                if (_cursor.isNull(_cursorIndexOfCreatorName)) {
                  _tmpCreatorName = null;
                } else {
                  _tmpCreatorName = _cursor.getString(_cursorIndexOfCreatorName);
                }
                final Integer _tmpExecutorId;
                if (_cursor.isNull(_cursorIndexOfExecutorId)) {
                  _tmpExecutorId = null;
                } else {
                  _tmpExecutorId = _cursor.getInt(_cursorIndexOfExecutorId);
                }
                final String _tmpExecutorName;
                if (_cursor.isNull(_cursorIndexOfExecutorName)) {
                  _tmpExecutorName = null;
                } else {
                  _tmpExecutorName = _cursor.getString(_cursorIndexOfExecutorName);
                }
                final long _tmpCreateDate;
                _tmpCreateDate = _cursor.getLong(_cursorIndexOfCreateDate);
                final long _tmpPlanExecuteDate;
                _tmpPlanExecuteDate = _cursor.getLong(_cursorIndexOfPlanExecuteDate);
                final Long _tmpFactExecuteDate;
                if (_cursor.isNull(_cursorIndexOfFactExecuteDate)) {
                  _tmpFactExecuteDate = null;
                } else {
                  _tmpFactExecuteDate = _cursor.getLong(_cursorIndexOfFactExecuteDate);
                }
                final Claim.Status _tmpStatus;
                final String _tmp;
                if (_cursor.isNull(_cursorIndexOfStatus)) {
                  _tmp = null;
                } else {
                  _tmp = _cursor.getString(_cursorIndexOfStatus);
                }
                _tmpStatus = __claimClaimStatusConverter.toClaimStatus(_tmp);
                _tmpClaim = new Claim(_tmpId,_tmpTitle,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpExecutorId,_tmpExecutorName,_tmpCreateDate,_tmpPlanExecuteDate,_tmpFactExecuteDate,_tmpStatus);
              }  else  {
                _tmpClaim = null;
              }
              ArrayList<ClaimComment> _tmpCommentsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
                _tmpCommentsCollection_1 = _collectionComments.get(_tmpKey_1);
              }
              if (_tmpCommentsCollection_1 == null) {
                _tmpCommentsCollection_1 = new ArrayList<ClaimComment>();
              }
              _item = new FullClaim(_tmpClaim,_tmpCommentsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, arg0);
  }

  @Override
  public Flow<List<FullClaim>> getClaimsByStatus(final List<? extends Claim.Status> listStatuses) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("\n");
    _stringBuilder.append("       SELECT * FROM ClaimEntity");
    _stringBuilder.append("\n");
    _stringBuilder.append("       WHERE (status IN (");
    final int _inputSize = listStatuses.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append("))");
    _stringBuilder.append("\n");
    _stringBuilder.append("       ORDER BY planExecuteDate ASC, createDate DESC");
    _stringBuilder.append("\n");
    _stringBuilder.append("    ");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Claim.Status _item : listStatuses) {
      final String _tmp = __claimClaimStatusConverter.fromClaimStatus(_item);
      if (_tmp == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _tmp);
      }
      _argIndex ++;
    }
    return CoroutinesRoom.createFlow(__db, true, new String[]{"ClaimCommentEntity","ClaimEntity"}, new Callable<List<FullClaim>>() {
      @Override
      public List<FullClaim> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorId");
            final int _cursorIndexOfCreatorName = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorName");
            final int _cursorIndexOfExecutorId = CursorUtil.getColumnIndexOrThrow(_cursor, "executorId");
            final int _cursorIndexOfExecutorName = CursorUtil.getColumnIndexOrThrow(_cursor, "executorName");
            final int _cursorIndexOfCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createDate");
            final int _cursorIndexOfPlanExecuteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "planExecuteDate");
            final int _cursorIndexOfFactExecuteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "factExecuteDate");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final LongSparseArray<ArrayList<ClaimComment>> _collectionComments = new LongSparseArray<ArrayList<ClaimComment>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
                ArrayList<ClaimComment> _tmpCommentsCollection = _collectionComments.get(_tmpKey);
                if (_tmpCommentsCollection == null) {
                  _tmpCommentsCollection = new ArrayList<ClaimComment>();
                  _collectionComments.put(_tmpKey, _tmpCommentsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipClaimCommentEntityAsruItecoFmhandroidDtoClaimComment(_collectionComments);
            final List<FullClaim> _result = new ArrayList<FullClaim>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final FullClaim _item_1;
              final Claim _tmpClaim;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfCreatorId) && _cursor.isNull(_cursorIndexOfCreatorName) && _cursor.isNull(_cursorIndexOfExecutorId) && _cursor.isNull(_cursorIndexOfExecutorName) && _cursor.isNull(_cursorIndexOfCreateDate) && _cursor.isNull(_cursorIndexOfPlanExecuteDate) && _cursor.isNull(_cursorIndexOfFactExecuteDate) && _cursor.isNull(_cursorIndexOfStatus))) {
                final Integer _tmpId;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmpId = null;
                } else {
                  _tmpId = _cursor.getInt(_cursorIndexOfId);
                }
                final String _tmpTitle;
                if (_cursor.isNull(_cursorIndexOfTitle)) {
                  _tmpTitle = null;
                } else {
                  _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                }
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final int _tmpCreatorId;
                _tmpCreatorId = _cursor.getInt(_cursorIndexOfCreatorId);
                final String _tmpCreatorName;
                if (_cursor.isNull(_cursorIndexOfCreatorName)) {
                  _tmpCreatorName = null;
                } else {
                  _tmpCreatorName = _cursor.getString(_cursorIndexOfCreatorName);
                }
                final Integer _tmpExecutorId;
                if (_cursor.isNull(_cursorIndexOfExecutorId)) {
                  _tmpExecutorId = null;
                } else {
                  _tmpExecutorId = _cursor.getInt(_cursorIndexOfExecutorId);
                }
                final String _tmpExecutorName;
                if (_cursor.isNull(_cursorIndexOfExecutorName)) {
                  _tmpExecutorName = null;
                } else {
                  _tmpExecutorName = _cursor.getString(_cursorIndexOfExecutorName);
                }
                final long _tmpCreateDate;
                _tmpCreateDate = _cursor.getLong(_cursorIndexOfCreateDate);
                final long _tmpPlanExecuteDate;
                _tmpPlanExecuteDate = _cursor.getLong(_cursorIndexOfPlanExecuteDate);
                final Long _tmpFactExecuteDate;
                if (_cursor.isNull(_cursorIndexOfFactExecuteDate)) {
                  _tmpFactExecuteDate = null;
                } else {
                  _tmpFactExecuteDate = _cursor.getLong(_cursorIndexOfFactExecuteDate);
                }
                final Claim.Status _tmpStatus;
                final String _tmp_1;
                if (_cursor.isNull(_cursorIndexOfStatus)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = _cursor.getString(_cursorIndexOfStatus);
                }
                _tmpStatus = __claimClaimStatusConverter.toClaimStatus(_tmp_1);
                _tmpClaim = new Claim(_tmpId,_tmpTitle,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpExecutorId,_tmpExecutorName,_tmpCreateDate,_tmpPlanExecuteDate,_tmpFactExecuteDate,_tmpStatus);
              }  else  {
                _tmpClaim = null;
              }
              ArrayList<ClaimComment> _tmpCommentsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
                _tmpCommentsCollection_1 = _collectionComments.get(_tmpKey_1);
              }
              if (_tmpCommentsCollection_1 == null) {
                _tmpCommentsCollection_1 = new ArrayList<ClaimComment>();
              }
              _item_1 = new FullClaim(_tmpClaim,_tmpCommentsCollection_1);
              _result.add(_item_1);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<FullClaim> getClaimById(final int id) {
    final String _sql = "SELECT * FROM ClaimEntity WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"ClaimCommentEntity","ClaimEntity"}, new Callable<FullClaim>() {
      @Override
      public FullClaim call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorId");
            final int _cursorIndexOfCreatorName = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorName");
            final int _cursorIndexOfExecutorId = CursorUtil.getColumnIndexOrThrow(_cursor, "executorId");
            final int _cursorIndexOfExecutorName = CursorUtil.getColumnIndexOrThrow(_cursor, "executorName");
            final int _cursorIndexOfCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createDate");
            final int _cursorIndexOfPlanExecuteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "planExecuteDate");
            final int _cursorIndexOfFactExecuteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "factExecuteDate");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final LongSparseArray<ArrayList<ClaimComment>> _collectionComments = new LongSparseArray<ArrayList<ClaimComment>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
                ArrayList<ClaimComment> _tmpCommentsCollection = _collectionComments.get(_tmpKey);
                if (_tmpCommentsCollection == null) {
                  _tmpCommentsCollection = new ArrayList<ClaimComment>();
                  _collectionComments.put(_tmpKey, _tmpCommentsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipClaimCommentEntityAsruItecoFmhandroidDtoClaimComment(_collectionComments);
            final FullClaim _result;
            if(_cursor.moveToFirst()) {
              final Claim _tmpClaim;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfCreatorId) && _cursor.isNull(_cursorIndexOfCreatorName) && _cursor.isNull(_cursorIndexOfExecutorId) && _cursor.isNull(_cursorIndexOfExecutorName) && _cursor.isNull(_cursorIndexOfCreateDate) && _cursor.isNull(_cursorIndexOfPlanExecuteDate) && _cursor.isNull(_cursorIndexOfFactExecuteDate) && _cursor.isNull(_cursorIndexOfStatus))) {
                final Integer _tmpId;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmpId = null;
                } else {
                  _tmpId = _cursor.getInt(_cursorIndexOfId);
                }
                final String _tmpTitle;
                if (_cursor.isNull(_cursorIndexOfTitle)) {
                  _tmpTitle = null;
                } else {
                  _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                }
                final String _tmpDescription;
                if (_cursor.isNull(_cursorIndexOfDescription)) {
                  _tmpDescription = null;
                } else {
                  _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                }
                final int _tmpCreatorId;
                _tmpCreatorId = _cursor.getInt(_cursorIndexOfCreatorId);
                final String _tmpCreatorName;
                if (_cursor.isNull(_cursorIndexOfCreatorName)) {
                  _tmpCreatorName = null;
                } else {
                  _tmpCreatorName = _cursor.getString(_cursorIndexOfCreatorName);
                }
                final Integer _tmpExecutorId;
                if (_cursor.isNull(_cursorIndexOfExecutorId)) {
                  _tmpExecutorId = null;
                } else {
                  _tmpExecutorId = _cursor.getInt(_cursorIndexOfExecutorId);
                }
                final String _tmpExecutorName;
                if (_cursor.isNull(_cursorIndexOfExecutorName)) {
                  _tmpExecutorName = null;
                } else {
                  _tmpExecutorName = _cursor.getString(_cursorIndexOfExecutorName);
                }
                final long _tmpCreateDate;
                _tmpCreateDate = _cursor.getLong(_cursorIndexOfCreateDate);
                final long _tmpPlanExecuteDate;
                _tmpPlanExecuteDate = _cursor.getLong(_cursorIndexOfPlanExecuteDate);
                final Long _tmpFactExecuteDate;
                if (_cursor.isNull(_cursorIndexOfFactExecuteDate)) {
                  _tmpFactExecuteDate = null;
                } else {
                  _tmpFactExecuteDate = _cursor.getLong(_cursorIndexOfFactExecuteDate);
                }
                final Claim.Status _tmpStatus;
                final String _tmp;
                if (_cursor.isNull(_cursorIndexOfStatus)) {
                  _tmp = null;
                } else {
                  _tmp = _cursor.getString(_cursorIndexOfStatus);
                }
                _tmpStatus = __claimClaimStatusConverter.toClaimStatus(_tmp);
                _tmpClaim = new Claim(_tmpId,_tmpTitle,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpExecutorId,_tmpExecutorName,_tmpCreateDate,_tmpPlanExecuteDate,_tmpFactExecuteDate,_tmpStatus);
              }  else  {
                _tmpClaim = null;
              }
              ArrayList<ClaimComment> _tmpCommentsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
                _tmpCommentsCollection_1 = _collectionComments.get(_tmpKey_1);
              }
              if (_tmpCommentsCollection_1 == null) {
                _tmpCommentsCollection_1 = new ArrayList<ClaimComment>();
              }
              _result = new FullClaim(_tmpClaim,_tmpCommentsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object removeClaimsItemsByIdList(final List<Integer> idList,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("DELETE FROM ClaimEntity WHERE id IN (");
        final int _inputSize = idList.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        final String _sql = _stringBuilder.toString();
        final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
        int _argIndex = 1;
        for (Integer _item : idList) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindLong(_argIndex, _item);
          }
          _argIndex ++;
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipClaimCommentEntityAsruItecoFmhandroidDtoClaimComment(
      final LongSparseArray<ArrayList<ClaimComment>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<ClaimComment>> _tmpInnerMap = new LongSparseArray<ArrayList<ClaimComment>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipClaimCommentEntityAsruItecoFmhandroidDtoClaimComment(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<ClaimComment>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipClaimCommentEntityAsruItecoFmhandroidDtoClaimComment(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`claimId`,`description`,`creatorId`,`creatorName`,`createDate` FROM `ClaimCommentEntity` WHERE `claimId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "claimId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfClaimId = 1;
      final int _cursorIndexOfDescription = 2;
      final int _cursorIndexOfCreatorId = 3;
      final int _cursorIndexOfCreatorName = 4;
      final int _cursorIndexOfCreateDate = 5;
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final long _tmpKey = _cursor.getLong(_itemKeyIndex);
          ArrayList<ClaimComment> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final ClaimComment _item_1;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final int _tmpClaimId;
            _tmpClaimId = _cursor.getInt(_cursorIndexOfClaimId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final int _tmpCreatorId;
            _tmpCreatorId = _cursor.getInt(_cursorIndexOfCreatorId);
            final String _tmpCreatorName;
            if (_cursor.isNull(_cursorIndexOfCreatorName)) {
              _tmpCreatorName = null;
            } else {
              _tmpCreatorName = _cursor.getString(_cursorIndexOfCreatorName);
            }
            final long _tmpCreateDate;
            _tmpCreateDate = _cursor.getLong(_cursorIndexOfCreateDate);
            _item_1 = new ClaimComment(_tmpId,_tmpClaimId,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpCreateDate);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
