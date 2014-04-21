package basictest

actions{
    action( id: 'changeText',
          enabled: true,
          name: 'Change!',
          closure: controller.changeText )
}

panel( mainPanel ){
  hbox{
    label( text: bind{model.testData} )
    button changeText
  }
}