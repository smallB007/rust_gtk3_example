# Auto-Generated by cargo-bitbake 0.3.16-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get rust_gtk3_example could be as easy as but default to a git checkout:
SRC_URI += "git://git@github.com/smallB007/rust_gtk3_example.git;protocol=https;nobranch=1;branch=main"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+08b3485996"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/anyhow/1.0.56 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/cfg-expr/0.10.2 \
    crate://crates.io/field-offset/0.3.4 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-macro/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/libc/0.2.121 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/once_cell/1.10.0 \
    crate://crates.io/pest/2.1.3 \
    crate://crates.io/pin-project-lite/0.2.8 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.24 \
    crate://crates.io/proc-macro-crate/1.1.3 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.36 \
    crate://crates.io/quote/1.0.17 \
    crate://crates.io/rustc_version/0.3.3 \
    crate://crates.io/semver-parser/0.10.2 \
    crate://crates.io/semver/0.11.0 \
    crate://crates.io/serde/1.0.136 \
    crate://crates.io/slab/0.4.5 \
    crate://crates.io/smallvec/1.8.0 \
    crate://crates.io/syn/1.0.90 \
    crate://crates.io/system-deps/6.0.2 \
    crate://crates.io/thiserror-impl/1.0.30 \
    crate://crates.io/thiserror/1.0.30 \
    crate://crates.io/toml/0.5.8 \
    crate://crates.io/ucd-trie/0.1.3 \
    crate://crates.io/unicode-xid/0.2.2 \
    crate://crates.io/version-compare/0.1.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=cairo-rs;destsuffix=cairo-rs \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=cairo-sys-rs;destsuffix=cairo-sys-rs \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=gdk-pixbuf-sys;destsuffix=gdk-pixbuf-sys \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=gdk-pixbuf;destsuffix=gdk-pixbuf \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=gio-sys;destsuffix=gio-sys \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=gio;destsuffix=gio \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=glib-macros;destsuffix=glib-macros \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=glib-sys;destsuffix=glib-sys \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=glib;destsuffix=glib \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=gobject-sys;destsuffix=gobject-sys \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=pango-sys;destsuffix=pango-sys \
    git://github.com/gtk-rs/gtk-rs-core;protocol=https;nobranch=1;name=pango;destsuffix=pango \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=atk-sys;destsuffix=atk-sys \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=atk;destsuffix=atk \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=gdk-sys;destsuffix=gdk-sys \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=gdk;destsuffix=gdk \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=gtk-sys;destsuffix=gtk-sys \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=gtk3-macros;destsuffix=gtk3-macros \
    git://github.com/gtk-rs/gtk3-rs.git;protocol=https;nobranch=1;name=gtk;destsuffix=gtk \
"

SRCREV_FORMAT .= "_atk"
SRCREV_atk = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/atk"
SRCREV_FORMAT .= "_atk-sys"
SRCREV_atk-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/atk-sys"
SRCREV_FORMAT .= "_cairo-rs"
SRCREV_cairo-rs = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/cairo-rs"
SRCREV_FORMAT .= "_cairo-sys-rs"
SRCREV_cairo-sys-rs = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/cairo-sys-rs"
SRCREV_FORMAT .= "_gdk"
SRCREV_gdk = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gdk"
SRCREV_FORMAT .= "_gdk-pixbuf"
SRCREV_gdk-pixbuf = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gdk-pixbuf"
SRCREV_FORMAT .= "_gdk-pixbuf-sys"
SRCREV_gdk-pixbuf-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gdk-pixbuf-sys"
SRCREV_FORMAT .= "_gdk-sys"
SRCREV_gdk-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gdk-sys"
SRCREV_FORMAT .= "_gio"
SRCREV_gio = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gio"
SRCREV_FORMAT .= "_gio-sys"
SRCREV_gio-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gio-sys"
SRCREV_FORMAT .= "_glib"
SRCREV_glib = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/glib"
SRCREV_FORMAT .= "_glib-macros"
SRCREV_glib-macros = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/glib-macros"
SRCREV_FORMAT .= "_glib-sys"
SRCREV_glib-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/glib-sys"
SRCREV_FORMAT .= "_gobject-sys"
SRCREV_gobject-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gobject-sys"
SRCREV_FORMAT .= "_gtk"
SRCREV_gtk = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gtk"
SRCREV_FORMAT .= "_gtk-sys"
SRCREV_gtk-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gtk-sys"
SRCREV_FORMAT .= "_gtk3-macros"
SRCREV_gtk3-macros = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gtk3-macros"
SRCREV_FORMAT .= "_pango"
SRCREV_pango = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/pango"
SRCREV_FORMAT .= "_pango-sys"
SRCREV_pango-sys = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/pango-sys"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "rust_gtk3_example"
HOMEPAGE = "https://github.com/smallB007/rust_gtk3_example.git"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include rust_gtk3_example-${PV}.inc
include rust_gtk3_example.inc
