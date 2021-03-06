Ext.define('Banquito.view.user.Edit', {
    extend: 'Ext.window.Window',
    alias : 'widget.useredit',
 
    title : 'Editar Usuario',
    layout: 'fit',
    autoShow: true,
 
    initComponent: function() {
        this.items = [
            {
                xtype: 'form',
                items: [
                    {
                        xtype: 'textfield',
                        name : 'name',
                        fieldLabel: 'Nombres'
                    },
                    {
                        xtype: 'textfield',
                        name : 'email',
                        fieldLabel: 'Correo'
                    }
                ]
            }
        ];
 
        this.buttons = [
            {
                text: 'Save',
                action: 'save'
            },
            {
                text: 'Cancel',
                scope: this,
                handler: this.close
            }
        ];
 
        this.callParent(arguments);
    }
});