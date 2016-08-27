Ext.namespace('Banquito');
Ext.application({
    name: 'Banquito',
    appFolder: 'resources/app',
    
    controllers: [
                  'Users'
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