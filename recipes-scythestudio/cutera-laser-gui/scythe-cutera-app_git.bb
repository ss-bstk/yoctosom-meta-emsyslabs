LICENSE = "CLOSED"

DEPENDS = "qtdeclarative qtdeclarative-native qtserialport"
RDEPENDS:${PN} = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland', '', d)}"

SRC_URI = "git://git@github.com:cuteraeng/scythe-cutera-app.git;branch=main;protocol=ssh"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit qt6-cmake
