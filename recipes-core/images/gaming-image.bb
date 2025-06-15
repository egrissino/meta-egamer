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

DEFAULTTUNE_virtclass-multilib-lib32 = "x86_64"
ABI_LIB32 = "lib32"

IMAGE_INSTALL:append = " lib32-glibc libgcc libstdc++"

DISTRO_FEATURES_append = " wayland dri opengl vulkan alsa sound"
IMAGE_INSTALL_append = " mesa libvulkan1 vulkan-loader weston"
