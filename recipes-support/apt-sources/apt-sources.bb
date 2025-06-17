SUMMARY = "Debian Bookworm archive key"
LICENSE = "CLOSED"

do_install() {
    install -Dm0644 ${WORKDIR}/sources.list \
        ${D}${sysconfdir}/apt/sources.list
}
