application {
    title = 'BasicTest'
    startupGroups = ['basicTest']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "testPanel"
    'testPanel' {
        model      = 'basictest.TestPanelModel'
        view       = 'basictest.TestPanelView'
        controller = 'basictest.TestPanelController'
    }

    // MVC Group for "basicTest"
    'basicTest' {
        model      = 'basictest.BasicTestModel'
        view       = 'basictest.BasicTestView'
        controller = 'basictest.BasicTestController'
    }

}
