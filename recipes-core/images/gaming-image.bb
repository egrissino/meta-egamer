SUMMARY = "Gaming-focused desktop image with Wayland"
inherit core-image
IMAGE_INSTALL = "\
  weston \
  mesa \
  networkmanager \
  openssh \
"
IMAGE_FSTYPES = "tar.bz2 wic"