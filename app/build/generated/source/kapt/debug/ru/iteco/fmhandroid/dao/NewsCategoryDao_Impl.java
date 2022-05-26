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
import ru.iteco.fmhandroid.entity.NewsCategoryEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsCategoryDao_Impl implements NewsCategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsCategoryEntity> __insertionAdapterOfNewsCategoryEntity;

  public NewsCategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsCategoryEntity = new EntityInsertionAdapter<NewsCategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NewsCategoryEntity` (`id`,`name`,`deleted`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsCategoryEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp = value.getDeleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
      }
    };
  }

  @Override
  public Object insert(final List<NewsCategoryEntity> categories,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsCategoryEntity.insert(categories);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object insert(final NewsCategoryEntity category, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsCategoryEntity.insert(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<NewsCategoryEntity>> getAllNewsCategories() {
    final String _sql = "SELECT * FROM NewsCategoryEntity ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"NewsCategoryEntity"}, new Callable<List<NewsCategoryEntity>>() {
      @Override
      public List<NewsCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
          final List<NewsCategoryEntity> _result = new ArrayList<NewsCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NewsCategoryEntity _item;
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
            _item = new NewsCategoryEntity(_tmpId,_tmpName,_tmpDeleted);
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

  @Override
  public List<NewsCategoryEntity> getNewsCategoryList() {
    final String _sql = "SELECT * FROM NewsCategoryEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
      final List<NewsCategoryEntity> _result = new ArrayList<NewsCategoryEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NewsCategoryEntity _item;
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
        _item = new NewsCategoryEntity(_tmpId,_tmpName,_tmpDeleted);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
