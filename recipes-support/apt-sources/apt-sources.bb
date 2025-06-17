SUMMARY = "Debian Bookworm archive key"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install() {
    install -Dm0644 ${WORKDIR}/sources.list ${D}${sysconfdir}/apt/sources.list
}
