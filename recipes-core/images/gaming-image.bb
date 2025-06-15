SUMMARY = "Gaming-focused desktop image with Wayland"
inherit core-image
IMAGE_INSTALL = "\
  weston \
  mesa \
  vulkan-loader \
  vulkan-validation-layers \
  drm-intel \
  nvidia-driver-native \
  steam launcher \
  retroarch \
  networkmanager \
  openssh \
"
IMAGE_FSTYPES = "tar.bz2 wic"
