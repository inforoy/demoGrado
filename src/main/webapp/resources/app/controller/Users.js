Ext.define('Banquito.controller.Users', {
	extend: 'Ext.app.Controller',
	views: [
	        'user.List'
	    ],
    init: function() {
        this.control({
            'algunEvento': {
                render: this.onPanelRendered
            }
        });
    },
 
    onPanelRendered: function() {
        console.log('The panel was rendered');
    }
    
});