#http://bec-systems.com/site/1128/best-practices-for-using-cmake-in-openembeddedyocto

SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


inherit cmake 
SRCREV = "${AUTOREV}"
#PV = "1.1+gitr${SRCPV}"
#Working SRC_URI = "git://github.com/lz4/lz4.git;branch=release;protocol=https"
SRC_URI = "git://github.com/smallB007/my_app.git;branch=main;protocol=https"

S = "${WORKDIR}/git"
BBCLASSEXTEND = "native"


DEPENDS += "gtk+3"
DEPENDS += "gtkmm3"
#############
#SRC_URI copied from output from bitbake
#SRC_URI[sha256sum] = "fd3577769f549d7627667a9f8f2efea7f025635fba8bfda2798f6cf980e0767b"
#BB_STRICT_CHECKSUM = "0"
#SRCREV = "${AUTOREV}"
#SRCREV = "main"
#SRCREV = "92807b7a799d01fb9a886829cbd6db28635f5f8c"
#SRC_URI = "git://github.com/smallB007/my_app.git;protocol=https;branch=main"
#Where to keep downloaded source files
#S = "${WORKDIR}/src"
#S = "/home/artie/Downloads/my_app"



