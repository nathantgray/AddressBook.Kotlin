package com.addressbook.android.greendao.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "ADDRESS_BOOK".
*/
public class AddressBookDao extends AbstractDao<AddressBook, Long> {

    public static final String TABLENAME = "ADDRESS_BOOK";

    /**
     * Properties of entity AddressBook.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Email = new Property(2, String.class, "email", false, "EMAIL");
        public final static Property Contact_number = new Property(3, String.class, "contact_number", false, "CONTACT_NUMBER");
        public final static Property Isactive = new Property(4, Boolean.class, "isactive", false, "ISACTIVE");
    }


    public AddressBookDao(DaoConfig config) {
        super(config);
    }
    
    public AddressBookDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ADDRESS_BOOK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"EMAIL\" TEXT," + // 2: email
                "\"CONTACT_NUMBER\" TEXT," + // 3: contact_number
                "\"ISACTIVE\" INTEGER);"); // 4: isactive
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ADDRESS_BOOK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AddressBook entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(3, email);
        }
 
        String contact_number = entity.getContact_number();
        if (contact_number != null) {
            stmt.bindString(4, contact_number);
        }
 
        Boolean isactive = entity.getIsactive();
        if (isactive != null) {
            stmt.bindLong(5, isactive ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AddressBook entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(3, email);
        }
 
        String contact_number = entity.getContact_number();
        if (contact_number != null) {
            stmt.bindString(4, contact_number);
        }
 
        Boolean isactive = entity.getIsactive();
        if (isactive != null) {
            stmt.bindLong(5, isactive ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public AddressBook readEntity(Cursor cursor, int offset) {
        AddressBook entity = new AddressBook( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // email
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // contact_number
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0 // isactive
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AddressBook entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setEmail(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setContact_number(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIsactive(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AddressBook entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AddressBook entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AddressBook entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
