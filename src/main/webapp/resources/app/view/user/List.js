Ext.define('Banquito.view.user.List' ,{
    extend: 'Ext.grid.Panel',
    alias : 'widget.userlist',
 
    title : 'All Users',
 
    initComponent: function() {
        this.store = {
            fields: ['name', 'email', 'active'],
            data  : [
                {name: 'Ed',    email: 'ed@sencha.com', active: 'Si' },
                {name: 'Tommy', email: 'tommy@sencha.com', active: 'No' },
                {name: 'Roy',   email: 'roy@sencha.com', active: 'Si' }
            ]
        };
 
        this.columns = [
            {header: 'Name',  dataIndex: 'name',  flex: 1},
            {header: 'Email', dataIndex: 'email', flex: 1},
            {header: 'Activo', dataIndex: 'active', flex: 1}
        ];
 
        this.callParent(arguments);
    }
});