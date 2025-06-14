# meta-egamer

This repository provides the Yocto build configuration for the Egamer linux.


## Build Instructions
The build process for this repository is handled through the [egamer-build-container](https://github.com/egrissino/egamer-build-container) repository. This containerized environment includes all necessary dependencies and setup scripts.

To build, follow the instructions provided in the [egamer-build-container](https://github.com/egrissino/egamer-build-container) repository.

## Layers Included
The following Yocto layers are included:
- **poky** - Core Yocto Project build system
- **meta-openembedded** - Additional open-source package support
- **meta-intel** - Support for intel cpus
- **meta-nvidia** - Support for nvidia gpus
- **meta-egamer** - Custom Egamer linux-specific configurations and recipes

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Support
For issues and support, please open an issue in the repository or contact `evanjgrissino@gmail.com`.

