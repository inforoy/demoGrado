Ext.define('Banquito.store.Users', {
    extend: 'Ext.data.Store',
    model: 'Banquito.model.User',
    autoLoad: true,
    data: [
        {name: 'Ed 1',    email: 'ed@sencha.com'},
        {name: 'Tommy 1', email: 'tommy@sencha.com'}
    ],


	proxy: {
		actionMethods: {
            create: 'POST',
            read: 'POST',
            update: 'POST'
        },
	    type: 'ajax',
	    url: 'saveUser.htm',
	    reader: {
	        type: 'json',
	        root: 'users',
	        successProperty: 'success'
	    }
	}

/**
     proxy: {
        actionMethods: {
            create: 'POST',
            read: 'POST',
            update: 'POST'
        },
        type: 'ajax',
        url: 'showListAgencyActivesComboBox.htm',
         extraParams: {
             propertyOrder: 'description'
         },
        reader: {
            type: 'json',
            root: 'data',
            successProperty: 'success'
        }
    }
 **/
    
});