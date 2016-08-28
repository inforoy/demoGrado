Ext.namespace('Banquito');
Ext.Loader.setConfig({enabled:true});
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