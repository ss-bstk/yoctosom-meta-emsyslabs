FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://weston_cutera.ini"

do_install:append:spacesom-8mplus-cb() {
    install -m 0644 ${WORKDIR}/weston_cutera.ini ${D}${sysconfdir}/xdg/weston/weston.ini
}
