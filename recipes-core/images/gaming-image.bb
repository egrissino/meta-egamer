SUMMARY = "Gaming-focused desktop image with Wayland"
inherit core-image
IMAGE_INSTALL = "\
  weston \
  mesa \
  vulkan-loader \
  vulkan-validation-layers \
  steam launcher \
  retroarch \
  networkmanager \
  openssh \
"
IMAGE_FSTYPES = "tar.bz2 wic"