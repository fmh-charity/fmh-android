package ru.iteco.fmhandroid.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import ru.iteco.fmhandroid.dto.ClaimComment;
import ru.iteco.fmhandroid.entity.ClaimCommentEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ClaimCommentDao_Impl implements ClaimCommentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ClaimCommentEntity> __insertionAdapterOfClaimCommentEntity;

  public ClaimCommentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClaimCommentEntity = new EntityInsertionAdapter<ClaimCommentEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ClaimCommentEntity` (`id`,`claimId`,`description`,`creatorId`,`creatorName`,`createDate`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ClaimCommentEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindLong(2, value.getClaimId());
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
        stmt.bindLong(6, value.getCreateDate());
      }
    };
  }

  @Override
  public Object insertComments(final List<ClaimCommentEntity> comments,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClaimCommentEntity.insert(comments);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object insertComment(final ClaimCommentEntity comment,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClaimCommentEntity.insert(comment);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<ClaimComment>> getClaimComments(final int claimId) {
    final String _sql = "SELECT * FROM ClaimCommentEntity WHERE claimId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, claimId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"ClaimCommentEntity"}, new Callable<List<ClaimComment>>() {
      @Override
      public List<ClaimComment> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfClaimId = CursorUtil.getColumnIndexOrThrow(_cursor, "claimId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorId");
          final int _cursorIndexOfCreatorName = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorName");
          final int _cursorIndexOfCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createDate");
          final List<ClaimComment> _result = new ArrayList<ClaimComment>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ClaimComment _item;
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
            _item = new ClaimComment(_tmpId,_tmpClaimId,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpCreateDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
