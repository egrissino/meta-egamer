SUMMARY = "Debian Bookworm archive key"
LICENSE = "CLOSED"

inherit allarch

do_install() {
    install -Dm0644 ${WORKDIR}/debian-archive-bookworm.gpg \
        ${D}${sysconfdir}/apt/trusted.gpg.d/debian-archive-bookworm.gpg
}

RDEPENDS_${PN} = "apt"
