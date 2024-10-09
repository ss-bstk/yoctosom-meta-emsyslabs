LICENSE = "CLOSED"

DEPENDS = "qtdeclarative qtdeclarative-native qtserialport qtmultimedia"
RDEPENDS:${PN} = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland', '', d)}"

SRC_URI = "git://git@gitlab.com/scythestudio/commercial/cutera-laser-gui.git;branch=main;protocol=ssh"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit qt6-cmake
