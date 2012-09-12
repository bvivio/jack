
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.models;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.test_project.database_1.IDatabase1;

import com.rapleaf.jack.ModelWithId;
import com.rapleaf.jack.BelongsToAssociation;
import com.rapleaf.jack.HasManyAssociation;
import com.rapleaf.jack.HasOneAssociation;

import com.rapleaf.jack.test_project.IDatabases;

public class Post extends ModelWithId<Post, IDatabases> {
  
  public static final long serialVersionUID = -452436965662476312L;
  
  // Fields
  private String __title;
  private Long __posted_at_millis;
  private Integer __user_id;
  private Long __updated_at;

  // Associations
  private transient BelongsToAssociation<User> __assoc_user;
  private transient HasManyAssociation<Comment> __assoc_comments;

  public enum _Fields {
    title,
    posted_at_millis,
    user_id,
    updated_at,
  }

  public Post(long id, final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at, IDatabases databases) {
    super(id);
    this.__title = title;
    this.__posted_at_millis = posted_at_millis;
    this.__user_id = user_id;
    this.__updated_at = updated_at;
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), __user_id == null ? null : __user_id.longValue());
    this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commented_on_id", getId());
  }

  public Post(long id, final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at) {
    super(id);
    this.__title = title;
    this.__posted_at_millis = posted_at_millis;
    this.__user_id = user_id;
    this.__updated_at = updated_at;
  }

  public Post(long id, Map<Enum, Object> fieldsMap) {
    super(id);
    String title = (String) fieldsMap.get(Post._Fields.title);
    Long posted_at_millis = (Long) fieldsMap.get(Post._Fields.posted_at_millis);
    Integer user_id = (Integer) fieldsMap.get(Post._Fields.user_id);
    Long updated_at = (Long) fieldsMap.get(Post._Fields.updated_at);
    this.__title = title;
    this.__posted_at_millis = posted_at_millis;
    this.__user_id = user_id;
    this.__updated_at = updated_at;
  }

  public Post (Post other) {
    this(other, (IDatabases)null);
  }

  public Post (Post other, IDatabases databases) {
    super(other.getId());
    this.__title = other.getTitle();
    this.__posted_at_millis = other.getPostedAtMillis();
    this.__user_id = other.getUserId();
    this.__updated_at = other.getUpdatedAt();

    if (databases != null) {
      this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), __user_id == null ? null : __user_id.longValue());
      this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commented_on_id", getId());
    }
  }

  public String getTitle(){
    return __title;
  }

  public void setTitle(String newval){
    this.__title = newval;
    cachedHashCode = 0;
  }

  public Long getPostedAtMillis(){
    return __posted_at_millis;
  }

  public void setPostedAtMillis(Long newval){
    this.__posted_at_millis = newval;
    cachedHashCode = 0;
  }

  public Integer getUserId(){
    return __user_id;
  }

  public void setUserId(Integer newval){
    this.__user_id = newval;
    if(__assoc_user != null){
      this.__assoc_user.setOwnerId(newval);
    }
    cachedHashCode = 0;
  }

  public Long getUpdatedAt(){
    return __updated_at;
  }

  public void setUpdatedAt(Long newval){
    this.__updated_at = newval;
    cachedHashCode = 0;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case title:
        setTitle((String) value);
        break;
      case posted_at_millis:
        setPostedAtMillis((Long) value);
        break;
      case user_id:
        setUserId((Integer) value);
        break;
      case updated_at:
        setUpdatedAt((Long) value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }
  }
  
  public void setField(String fieldName, Object value) {
    if (fieldName.equals("title")) {
      setTitle((String)  value);
      return;
    }
    if (fieldName.equals("posted_at_millis")) {
      setPostedAtMillis((Long)  value);
      return;
    }
    if (fieldName.equals("user_id")) {
      setUserId((Integer)  value);
      return;
    }
    if (fieldName.equals("updated_at")) {
      setUpdatedAt((Long)  value);
      return;
    }
    throw new IllegalStateException("Invalid field: " + fieldName);
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case title:
        return String.class;
      case posted_at_millis:
        return Long.class;
      case user_id:
        return Integer.class;
      case updated_at:
        return Long.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("title")) {
      return String.class;
    }
    if (fieldName.equals("posted_at_millis")) {
      return Long.class;
    }
    if (fieldName.equals("user_id")) {
      return Integer.class;
    }
    if (fieldName.equals("updated_at")) {
      return Long.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public User getUser() throws IOException {
    return __assoc_user.get();
  }

  public Set<Comment> getComments() throws IOException {
    return __assoc_comments.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("title")) {
      return getTitle();
    }
    if (fieldName.equals("posted_at_millis")) {
      return getPostedAtMillis();
    }
    if (fieldName.equals("user_id")) {
      return getUserId();
    }
    if (fieldName.equals("updated_at")) {
      return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case title:
        return getTitle();
      case posted_at_millis:
        return getPostedAtMillis();
      case user_id:
        return getUserId();
      case updated_at:
        return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }
  
   public boolean hasField(String fieldName) {
    if (fieldName.equals("id")) {
      return true;
    }
    if (fieldName.equals("title")) {
      return true;
    }
    if (fieldName.equals("posted_at_millis")) {
      return true;
    }
    if (fieldName.equals("user_id")) {
      return true;
    }
    if (fieldName.equals("updated_at")) {
      return true;
    }
    return false;
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case title:
        return null;
      case posted_at_millis:
        return null;
      case user_id:
        return null;
      case updated_at:
        return null;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  @Override
  public Set<Enum> getFieldSet() {
    Set set = EnumSet.allOf(_Fields.class);
    return set;
  }

  @Override
  public Post getCopy() {
    return new Post(this);
  }

  public Post getCopy(IDatabases databases) {
    return new Post(this, databases);
  }

  public String toString() {
    return "<Post"
      + " title: " + __title
      + " posted_at_millis: " + __posted_at_millis
      + " user_id: " + __user_id
      + " updated_at: " + __updated_at
      + ">";
  }
}
