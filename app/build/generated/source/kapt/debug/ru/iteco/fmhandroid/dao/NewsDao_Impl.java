package ru.iteco.fmhandroid.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
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
import ru.iteco.fmhandroid.dto.News;
import ru.iteco.fmhandroid.dto.NewsWithCategory;
import ru.iteco.fmhandroid.entity.NewsEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsEntity> __insertionAdapterOfNewsEntity;

  private final SharedSQLiteStatement __preparedStmtOfRemoveNewsItemById;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsEntity = new EntityInsertionAdapter<NewsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NewsEntity` (`id`,`newsCategoryId`,`title`,`description`,`creatorId`,`creatorName`,`createDate`,`publishDate`,`publishEnabled`,`isOpen`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindLong(2, value.getNewsCategoryId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getCreatorId());
        if (value.getCreatorName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCreatorName());
        }
        stmt.bindLong(7, value.getCreateDate());
        stmt.bindLong(8, value.getPublishDate());
        final int _tmp = value.getPublishEnabled() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        final int _tmp_1 = value.isOpen() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
      }
    };
    this.__preparedStmtOfRemoveNewsItemById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NewsEntity WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final NewsEntity newsItem, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsEntity.insert(newsItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object insert(final List<NewsEntity> news, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsEntity.insert(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object removeNewsItemById(final int id, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveNewsItemById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfRemoveNewsItemById.release(_stmt);
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<NewsWithCategory>> getAllNews(final Boolean publishEnabled,
      final Long publishDateBefore, final Integer newsCategoryId, final Long dateStart,
      final Long dateEnd, final Boolean status) {
    final String _sql = "SELECT * FROM NewsEntity\n"
            + "            WHERE (? IS NULL OR ? = publishEnabled)\n"
            + "            AND (? IS NULL OR publishDate <= ?)\n"
            + "            AND (? IS NULL OR ? = newsCategoryId)\n"
            + "            AND (? IS NULL OR publishDate >= ?)\n"
            + "            AND (? IS NULL OR publishDate <= ?)\n"
            + "            AND (? IS NULL OR ? = publishEnabled)\n"
            + "            ORDER BY publishDate DESC\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 12);
    int _argIndex = 1;
    final Integer _tmp = publishEnabled == null ? null : (publishEnabled ? 1 : 0);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Integer _tmp_1 = publishEnabled == null ? null : (publishEnabled ? 1 : 0);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 3;
    if (publishDateBefore == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, publishDateBefore);
    }
    _argIndex = 4;
    if (publishDateBefore == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, publishDateBefore);
    }
    _argIndex = 5;
    if (newsCategoryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, newsCategoryId);
    }
    _argIndex = 6;
    if (newsCategoryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, newsCategoryId);
    }
    _argIndex = 7;
    if (dateStart == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, dateStart);
    }
    _argIndex = 8;
    if (dateStart == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, dateStart);
    }
    _argIndex = 9;
    if (dateEnd == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, dateEnd);
    }
    _argIndex = 10;
    if (dateEnd == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, dateEnd);
    }
    _argIndex = 11;
    final Integer _tmp_2 = status == null ? null : (status ? 1 : 0);
    if (_tmp_2 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_2);
    }
    _argIndex = 12;
    final Integer _tmp_3 = status == null ? null : (status ? 1 : 0);
    if (_tmp_3 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_3);
    }
    return CoroutinesRoom.createFlow(__db, true, new String[]{"NewsCategoryEntity","NewsEntity"}, new Callable<List<NewsWithCategory>>() {
      @Override
      public List<NewsWithCategory> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfNewsCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "newsCategoryId");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorId");
            final int _cursorIndexOfCreatorName = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorName");
            final int _cursorIndexOfCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createDate");
            final int _cursorIndexOfPublishDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publishDate");
            final int _cursorIndexOfPublishEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "publishEnabled");
            final int _cursorIndexOfIsOpen = CursorUtil.getColumnIndexOrThrow(_cursor, "isOpen");
            final LongSparseArray<News.Category> _collectionCategory = new LongSparseArray<News.Category>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfNewsCategoryId);
              _collectionCategory.put(_tmpKey, null);
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipNewsCategoryEntityAsruItecoFmhandroidDtoNewsCategory(_collectionCategory);
            final List<NewsWithCategory> _result = new ArrayList<NewsWithCategory>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final NewsWithCategory _item;
              final News _tmpNewsItem;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfNewsCategoryId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfCreatorId) && _cursor.isNull(_cursorIndexOfCreatorName) && _cursor.isNull(_cursorIndexOfCreateDate) && _cursor.isNull(_cursorIndexOfPublishDate) && _cursor.isNull(_cursorIndexOfPublishEnabled) && _cursor.isNull(_cursorIndexOfIsOpen))) {
                final Integer _tmpId;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmpId = null;
                } else {
                  _tmpId = _cursor.getInt(_cursorIndexOfId);
                }
                final int _tmpNewsCategoryId;
                _tmpNewsCategoryId = _cursor.getInt(_cursorIndexOfNewsCategoryId);
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
                final long _tmpCreateDate;
                _tmpCreateDate = _cursor.getLong(_cursorIndexOfCreateDate);
                final long _tmpPublishDate;
                _tmpPublishDate = _cursor.getLong(_cursorIndexOfPublishDate);
                final boolean _tmpPublishEnabled;
                final int _tmp_4;
                _tmp_4 = _cursor.getInt(_cursorIndexOfPublishEnabled);
                _tmpPublishEnabled = _tmp_4 != 0;
                final boolean _tmpIsOpen;
                final int _tmp_5;
                _tmp_5 = _cursor.getInt(_cursorIndexOfIsOpen);
                _tmpIsOpen = _tmp_5 != 0;
                _tmpNewsItem = new News(_tmpId,_tmpNewsCategoryId,_tmpTitle,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpCreateDate,_tmpPublishDate,_tmpPublishEnabled,_tmpIsOpen);
              }  else  {
                _tmpNewsItem = null;
              }
              News.Category _tmpCategory = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfNewsCategoryId);
              _tmpCategory = _collectionCategory.get(_tmpKey_1);
              _item = new NewsWithCategory(_tmpNewsItem,_tmpCategory);
              _result.add(_item);
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
  public Object getAllNewsList(final Continuation<? super List<NewsWithCategory>> arg0) {
    final String _sql = "SELECT * FROM NewsEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<NewsWithCategory>>() {
      @Override
      public List<NewsWithCategory> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfNewsCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "newsCategoryId");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorId");
            final int _cursorIndexOfCreatorName = CursorUtil.getColumnIndexOrThrow(_cursor, "creatorName");
            final int _cursorIndexOfCreateDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createDate");
            final int _cursorIndexOfPublishDate = CursorUtil.getColumnIndexOrThrow(_cursor, "publishDate");
            final int _cursorIndexOfPublishEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "publishEnabled");
            final int _cursorIndexOfIsOpen = CursorUtil.getColumnIndexOrThrow(_cursor, "isOpen");
            final LongSparseArray<News.Category> _collectionCategory = new LongSparseArray<News.Category>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfNewsCategoryId);
              _collectionCategory.put(_tmpKey, null);
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipNewsCategoryEntityAsruItecoFmhandroidDtoNewsCategory(_collectionCategory);
            final List<NewsWithCategory> _result = new ArrayList<NewsWithCategory>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final NewsWithCategory _item;
              final News _tmpNewsItem;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfNewsCategoryId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfCreatorId) && _cursor.isNull(_cursorIndexOfCreatorName) && _cursor.isNull(_cursorIndexOfCreateDate) && _cursor.isNull(_cursorIndexOfPublishDate) && _cursor.isNull(_cursorIndexOfPublishEnabled) && _cursor.isNull(_cursorIndexOfIsOpen))) {
                final Integer _tmpId;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmpId = null;
                } else {
                  _tmpId = _cursor.getInt(_cursorIndexOfId);
                }
                final int _tmpNewsCategoryId;
                _tmpNewsCategoryId = _cursor.getInt(_cursorIndexOfNewsCategoryId);
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
                final long _tmpCreateDate;
                _tmpCreateDate = _cursor.getLong(_cursorIndexOfCreateDate);
                final long _tmpPublishDate;
                _tmpPublishDate = _cursor.getLong(_cursorIndexOfPublishDate);
                final boolean _tmpPublishEnabled;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfPublishEnabled);
                _tmpPublishEnabled = _tmp != 0;
                final boolean _tmpIsOpen;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfIsOpen);
                _tmpIsOpen = _tmp_1 != 0;
                _tmpNewsItem = new News(_tmpId,_tmpNewsCategoryId,_tmpTitle,_tmpDescription,_tmpCreatorId,_tmpCreatorName,_tmpCreateDate,_tmpPublishDate,_tmpPublishEnabled,_tmpIsOpen);
              }  else  {
                _tmpNewsItem = null;
              }
              News.Category _tmpCategory = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfNewsCategoryId);
              _tmpCategory = _collectionCategory.get(_tmpKey_1);
              _item = new NewsWithCategory(_tmpNewsItem,_tmpCategory);
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
  public Object removeNewsItemsByIdList(final List<Integer> idList,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("DELETE FROM NewsEntity WHERE id IN (");
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

  private void __fetchRelationshipNewsCategoryEntityAsruItecoFmhandroidDtoNewsCategory(
      final LongSparseArray<News.Category> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<News.Category> _tmpInnerMap = new LongSparseArray<News.Category>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipNewsCategoryEntityAsruItecoFmhandroidDtoNewsCategory(_tmpInnerMap);
          _map.putAll(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<News.Category>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipNewsCategoryEntityAsruItecoFmhandroidDtoNewsCategory(_tmpInnerMap);
        _map.putAll(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`name`,`deleted` FROM `NewsCategoryEntity` WHERE `id` IN (");
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
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfName = 1;
      final int _cursorIndexOfDeleted = 2;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        if (_map.containsKey(_tmpKey)) {
          final News.Category _item_1;
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final boolean _tmpDeleted;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfDeleted);
          _tmpDeleted = _tmp != 0;
          _item_1 = new News.Category(_tmpId,_tmpName,_tmpDeleted);
          _map.put(_tmpKey, _item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
