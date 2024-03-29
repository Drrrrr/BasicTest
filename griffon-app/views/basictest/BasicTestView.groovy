package basictest

actions{
  action( id: 'magic',
          enabled: true,
          name: 'magic',
          closure: controller.doMagic )
}

application(title: 'BasicTest',
  preferredSize: [320, 240],
  pack: true,
  //location: [50,50],
  locationByPlatform: true,
  iconImage:   imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    // add content here
    
    hbox{
      button magic
      panel( id: 'mainPanel' )
    }
}

