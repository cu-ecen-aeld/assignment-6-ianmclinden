# See https://git.yoctoproject.org/poky/tree/meta/files/common-licenses
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/cu-ecen-aeld/assignments-3-and-later-ianmclinden.git;protocol=ssh;branch=main"
PV = "1.0+git${SRCPV}"
SRCREV = "f87adf7e99b762c4788d210f657828cd33197541"

S = "${WORKDIR}/git/server"

# CMake project - no need to override any additional build steps
inherit cmake

inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
# This was renamed for busybox, too lazy to change it back
INITSCRIPT_NAME:${PN} = "S99aesdsocket"