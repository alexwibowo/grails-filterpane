package org.grails.plugin.filterpane

/**
 */
enum FilterPaneOperationType implements Serializable {

    ILike('ILike'),
    NotILike('NotILike'),
    Like('Like'),
    NotLike('NotLike'),
    Equal('Equal'),
    NotEqual('NotEqual'),
    IsNull('IsNull'),
    IsNotNull('IsNotNull'),
    LessThan('LessThan'),
    LessThanEquals('LessThanEquals'),
    GreaterThan('GreaterThan'),
    GreaterThanEquals('GreaterThanEquals'),
    Between('Between')

    String operation

    def FilterPaneOperationType(String operation) {
        this.operation = operation
    }

    static FilterPaneOperationType getFilterPaneOperationType(String operation) {
        FilterPaneOperationType.values().find { it.operation == operation }
    }
}