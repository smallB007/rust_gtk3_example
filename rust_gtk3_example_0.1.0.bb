# Auto-Generated by cargo-bitbake 0.3.16-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get rust_gtk3_example could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/rust_gtk3_example/0.1.0"
SRC_URI += "git://git@github.com/smallB007/rust_gtk3_example.git;protocol=https;nobranch=1;branch=main"
SRCREV = "783ca0773004eace5ad143e5f7e2a3303d2dfef6"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+783ca07730"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/anyhow/1.0.56 \
    crate://crates.io/atk-sys/0.15.1 \
    crate://crates.io/atk/0.15.1 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/cairo-rs/0.15.10 \
    crate://crates.io/cairo-sys-rs/0.15.1 \
    crate://crates.io/cfg-expr/0.10.2 \
    crate://crates.io/field-offset/0.3.4 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-executor/0.3.21 \
    crate://crates.io/futures-io/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/gdk-pixbuf-sys/0.15.10 \
    crate://crates.io/gdk-pixbuf/0.15.10 \
    crate://crates.io/gdk-sys/0.15.1 \
    crate://crates.io/gdk/0.15.4 \
    crate://crates.io/gio-sys/0.15.10 \
    crate://crates.io/gio/0.15.10 \
    crate://crates.io/glib-macros/0.15.10 \
    crate://crates.io/glib-sys/0.15.10 \
    crate://crates.io/glib/0.15.10 \
    crate://crates.io/gobject-sys/0.15.10 \
    crate://crates.io/gtk-sys/0.15.3 \
    crate://crates.io/gtk/0.15.4 \
    crate://crates.io/gtk3-macros/0.15.4 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/libc/0.2.121 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/once_cell/1.10.0 \
    crate://crates.io/pango-sys/0.15.10 \
    crate://crates.io/pango/0.15.10 \
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
"



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
