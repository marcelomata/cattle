/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.DeploymentUnitRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeploymentUnitTable extends TableImpl<DeploymentUnitRecord> {

    private static final long serialVersionUID = -2105243344;

    /**
     * The reference instance of <code>cattle.deployment_unit</code>
     */
    public static final DeploymentUnitTable DEPLOYMENT_UNIT = new DeploymentUnitTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeploymentUnitRecord> getRecordType() {
        return DeploymentUnitRecord.class;
    }

    /**
     * The column <code>cattle.deployment_unit.id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.deployment_unit.name</code>.
     */
    public final TableField<DeploymentUnitRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.deployment_unit.account_id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.deployment_unit.kind</code>.
     */
    public final TableField<DeploymentUnitRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.deployment_unit.uuid</code>.
     */
    public final TableField<DeploymentUnitRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.deployment_unit.description</code>.
     */
    public final TableField<DeploymentUnitRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.deployment_unit.state</code>.
     */
    public final TableField<DeploymentUnitRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.deployment_unit.created</code>.
     */
    public final TableField<DeploymentUnitRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.deployment_unit.removed</code>.
     */
    public final TableField<DeploymentUnitRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.deployment_unit.remove_time</code>.
     */
    public final TableField<DeploymentUnitRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.deployment_unit.data</code>.
     */
    public final TableField<DeploymentUnitRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.deployment_unit.service_index</code>.
     */
    public final TableField<DeploymentUnitRecord, String> SERVICE_INDEX = createField("service_index", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.deployment_unit.service_id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.deployment_unit.environment_id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.deployment_unit.health_state</code>.
     */
    public final TableField<DeploymentUnitRecord, String> HEALTH_STATE = createField("health_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.deployment_unit.host_id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.deployment_unit.requested_revision_id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> REQUESTED_REVISION_ID = createField("requested_revision_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.deployment_unit.revision_id</code>.
     */
    public final TableField<DeploymentUnitRecord, Long> REVISION_ID = createField("revision_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.deployment_unit</code> table reference
     */
    public DeploymentUnitTable() {
        this("deployment_unit", null);
    }

    /**
     * Create an aliased <code>cattle.deployment_unit</code> table reference
     */
    public DeploymentUnitTable(String alias) {
        this(alias, DEPLOYMENT_UNIT);
    }

    private DeploymentUnitTable(String alias, Table<DeploymentUnitRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeploymentUnitTable(String alias, Table<DeploymentUnitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DeploymentUnitRecord, Long> getIdentity() {
        return Keys.IDENTITY_DEPLOYMENT_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DeploymentUnitRecord> getPrimaryKey() {
        return Keys.KEY_DEPLOYMENT_UNIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DeploymentUnitRecord>> getKeys() {
        return Arrays.<UniqueKey<DeploymentUnitRecord>>asList(Keys.KEY_DEPLOYMENT_UNIT_PRIMARY, Keys.KEY_DEPLOYMENT_UNIT_IDX_DEPLOYMENT_UNIT_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DeploymentUnitRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DeploymentUnitRecord, ?>>asList(Keys.FK_DEPLOYMENT_UNIT__ACCOUNT_ID, Keys.FK_DEPLOYMENT_UNIT__SERVICE_ID, Keys.FK_DEPLOYMENT_UNIT__ENVIRONMENT_ID, Keys.FK_DEPLOYMENT_UNIT__HOST_ID, Keys.FK_DEPLOYMENT_UNIT_REQUESTED_REVISION_ID, Keys.FK_DEPLOYMENT_UNIT__REVISION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitTable as(String alias) {
        return new DeploymentUnitTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeploymentUnitTable rename(String name) {
        return new DeploymentUnitTable(name, null);
    }
}
