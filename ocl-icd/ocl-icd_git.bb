# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=232257bbf7320320725ca9529d3782ab"

SRC_URI = "git://github.com/OCL-dev/ocl-icd.git;protocol=https"

# Modify these as desired
PV = "2.2.12+git${SRCPV}"
SRCREV = "8bf11fd50d447511d1d54717b58813b18e92368e"

S = "${WORKDIR}/git"

# NOTE: the following prog dependencies are unknown, ignoring: xmlto asciidoc a2x
DEPENDS = "ruby-native"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

