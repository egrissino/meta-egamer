SUMMARY = "Debian Bookworm archive key"
LICENSE = "CLOSED"

SRC_URI = "file://archive-key-12.asc"

inherit allarch

do_install() {
    install -Dm0644 ${WORKDIR}/archive-key-12.asc \
        ${D}${sysconfdir}/apt/trusted.gpg.d/debian-archive-bookworm.gpg
}

RDEPENDS_${PN} = "apt"
