package addressbook

application(title: 'addressbook',
  pack: true,
  resizable: true,
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    menuBar {
        menu('Contacts') {
            menuItem(newAction)
            menuItem(saveAction)
            menuItem(deleteAction)
            menuItem(dumpAction)
        }
    }
    migLayout(layoutConstraints: 'fill')
    scrollPane(constraints: 'west') {
        list()
    }
    panel(constraints: 'center, grow', border: titledBorder(title: 'Contact')) {
        label('content')
    }
    panel(constraints: 'east, grow', border: titledBorder(title: 'Actions')) {
        migLayout()
        button(newAction,    constraints: 'growx, wrap')
        button(saveAction,   constraints: 'growx, wrap')
        button(deleteAction, constraints: 'growx, wrap')
        button(dumpAction,   constraints: 'growx, wrap')
    }
}
