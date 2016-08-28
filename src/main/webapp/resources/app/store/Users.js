Ext.define('Banquito.store.Users', {
    extend: 'Ext.data.Store',
    model: 'Banquito.model.User',
    data: [
        {name: 'Ed 1',    email: 'ed@sencha.com'},
        {name: 'Tommy 1', email: 'tommy@sencha.com'}
    ]
});