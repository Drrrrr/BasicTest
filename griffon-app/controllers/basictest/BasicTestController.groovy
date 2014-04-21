package basictest

class BasicTestController {
    // these will be injected by Griffon
    def model
    def view

    

    def doMagic = {
        String mvcId = 'Panel' + System.currentTimeMillis()

        createMVCGroup( 'testPanel', mvcId, [mainPanel: view.mainPanel, mvcId: mvcId] )
    }

}