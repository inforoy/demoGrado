Ext.namespace('Banquito');
Ext.application({
    name: 'Banquito',
    appFolder: 'resources/app',
    
    controllers: [
                  'UserController'
              ],
 
    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype: 'userlist'
            }
        });
    }
});