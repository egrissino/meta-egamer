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
  htop \
  nano \
  systemd \
  kernel-module-igc \
  linux-firmware \
  gnupg \
  wget \
  ca-certificates \
  tar \
"

IMAGE_FSTYPES = "tar.bz2 wic"