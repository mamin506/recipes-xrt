# Xilinx Runtime (XRT) recipes

LICENSE = "GPLv2 & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa343562af4b9b922b8d7fe7b0b6d000 \
                    file://src/runtime_src/driver/xclng/drm/xocl/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://src/runtime_src/driver/xclng/xrt/user_gem/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/runtime_src/driver/xclng/tools/xbutil/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

#SRC_URI = "git://git@github.com/Xilinx/XRT.git;protocol=ssh;branch=master"
SRC_URI = "git://git@github.com/mamin506/XRT.git;protocol=https;branch=yocto"

PV = "2.1.0+git${SRCPV}"
SRCREV = "fb020c4a501697bbc074e682442193cb66a847f9"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

# util-linux is for libuuid-dev.
DEPENDS = "libdrm opencl-headers ocl-icd boost util-linux"
RDEPENDS_${PN} = "bash ocl-icd boost"

FILES_${PN}-dev += "opt/xilinx/xrt/include/* opt/xilinx/xrt/lib/*.so"
FILES_${PN} += "opt/*"

# Avoid "no GNU_HASH" error
TARGET_CC_ARCH += "${LDFLAGS}"

# libxdp.so and liboclxdp.so have no symlink
INSANE_SKIP_${PN}-dev = "dev-elf"

# TODO Add pkgconfig setting here

MODULES_INSTALL_TARGET = "install"
EXTRA_OECMAKE += " \
		-DCMAKE_BUILD_TYPE=Release \
		-DCMAKE_EXPORT_COMPILE_COMANDS=ON \
		"

OECMAKE_SOURCEPATH = "${S}/src"

