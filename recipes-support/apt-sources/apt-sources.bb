SUMMARY = "Debian Bookworm archive key"
LICENSE = "CLOSED"

SRC_URI += " file://sources.list "

do_install_append() {
    install -Dm0644 ${WORKDIR}/sources.list \
        ${D}${sysconfdir}/apt/sources.list
}
