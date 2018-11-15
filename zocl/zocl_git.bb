# Xilinx Runtime driver module

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

#SRC_URI = "git://github.com/Xilinx/XRT.git;protocol=https"
SRC_URI = "git://github.com/mamin506/XRT.git;protocol=https;branch=yocto"

# Modify these as desired
PV = "2.2.0+git${SRCPV}"
SRCREV = "5d6d02cf2cad98c070b8b0b6df8c44dedb63a135"

S = "${WORKDIR}/git/src/runtime_src/driver/zynq/drm/zocl"

inherit module

