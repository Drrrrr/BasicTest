package basictest
import table.BasicArg
import table.BasicTable

class TestPanelController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        BasicTable t = new BasicTable()

        model.mvcId = args.mvcId
        model.testData = t.somearg.data
    }
    

    def changeText = {
        model.testData = "AHAHAHAHA!"
    }
}
