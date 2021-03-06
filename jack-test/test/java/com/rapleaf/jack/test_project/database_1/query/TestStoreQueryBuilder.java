/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.query;

import java.util.Collection;

import com.rapleaf.jack.queries.AbstractQueryBuilder;
import com.rapleaf.jack.queries.Column;
import com.rapleaf.jack.queries.FieldSelector;
import com.rapleaf.jack.queries.where_operators.IWhereOperator;
import com.rapleaf.jack.queries.where_operators.JackMatchers;
import com.rapleaf.jack.queries.WhereConstraint;
import com.rapleaf.jack.queries.QueryOrder;
import com.rapleaf.jack.queries.OrderCriterion;
import com.rapleaf.jack.queries.LimitCriterion;
import com.rapleaf.jack.test_project.database_1.iface.ITestStorePersistence;
import com.rapleaf.jack.test_project.database_1.models.TestStore;


public class TestStoreQueryBuilder extends AbstractQueryBuilder<TestStore> {

  public TestStoreQueryBuilder(ITestStorePersistence caller) {
    super(caller);
  }

  public TestStoreQueryBuilder select(TestStore._Fields... fields) {
    for (TestStore._Fields field : fields){
      addSelectedField(new FieldSelector(field));
    }
    return this;
  }

  public TestStoreQueryBuilder selectAgg(FieldSelector... aggregatedFields) {
    addSelectedFields(aggregatedFields);
    return this;
  }

  public TestStoreQueryBuilder id(Long value) {
    addId(value);
    return this;
  }

  public TestStoreQueryBuilder idIn(Collection<Long> values) {
    addIds(values);
    return this;
  }

  public TestStoreQueryBuilder whereId(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<>(Column.fromId(null), operator, null));
    return this;
  }

  public TestStoreQueryBuilder limit(int offset, int nResults) {
    setLimit(new LimitCriterion(offset, nResults));
    return this;
  }

  public TestStoreQueryBuilder limit(int nResults) {
    setLimit(new LimitCriterion(nResults));
    return this;
  }

  public TestStoreQueryBuilder groupBy(TestStore._Fields... fields) {
    addGroupByFields(fields);
    return this;
  }

  public TestStoreQueryBuilder order() {
    this.addOrder(new OrderCriterion(QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder order(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(queryOrder));
    return this;
  }

  public TestStoreQueryBuilder orderById() {
    this.addOrder(new OrderCriterion(QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderById(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(queryOrder));
    return this;
  }

  public TestStoreQueryBuilder entryType(Integer value) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_type, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreQueryBuilder whereEntryType(IWhereOperator<Integer> operator) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_type, operator));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryType() {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_type, QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryType(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_type, queryOrder));
    return this;
  }

  public TestStoreQueryBuilder entryScope(Long value) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_scope, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreQueryBuilder whereEntryScope(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_scope, operator));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryScope() {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_scope, QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryScope(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_scope, queryOrder));
    return this;
  }

  public TestStoreQueryBuilder entryKey(String value) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_key, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreQueryBuilder whereEntryKey(IWhereOperator<String> operator) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_key, operator));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryKey() {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_key, QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryKey(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_key, queryOrder));
    return this;
  }

  public TestStoreQueryBuilder entryValue(String value) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_value, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreQueryBuilder whereEntryValue(IWhereOperator<String> operator) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.entry_value, operator));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryValue() {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_value, QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderByEntryValue(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(TestStore._Fields.entry_value, queryOrder));
    return this;
  }

  public TestStoreQueryBuilder createdAt(Long value) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.created_at, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreQueryBuilder whereCreatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.created_at, operator));
    return this;
  }

  public TestStoreQueryBuilder orderByCreatedAt() {
    this.addOrder(new OrderCriterion(TestStore._Fields.created_at, QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderByCreatedAt(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(TestStore._Fields.created_at, queryOrder));
    return this;
  }

  public TestStoreQueryBuilder updatedAt(Long value) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.updated_at, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreQueryBuilder whereUpdatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<>(TestStore._Fields.updated_at, operator));
    return this;
  }

  public TestStoreQueryBuilder orderByUpdatedAt() {
    this.addOrder(new OrderCriterion(TestStore._Fields.updated_at, QueryOrder.ASC));
    return this;
  }

  public TestStoreQueryBuilder orderByUpdatedAt(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(TestStore._Fields.updated_at, queryOrder));
    return this;
  }
}
