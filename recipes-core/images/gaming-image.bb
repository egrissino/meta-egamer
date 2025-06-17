SUMMARY = "Gaming-focused desktop image with Wayland"
inherit core-image
IMAGE_INSTALL = "\
  weston \
  mesa \
  networkmanager \
  openssh \
  iproute2 \
  net-tools \
  iputils \
  ethtool \
  dnsutils \
  network-manager \
"
IMAGE_FSTYPES = "tar.bz2 wic"