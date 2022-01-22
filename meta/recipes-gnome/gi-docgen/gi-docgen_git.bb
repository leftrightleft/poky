SUMMARY = "Documentation tool for GObject-based libraries"
DESCRIPTION = "GI-DocGen is a document generator for GObject-based libraries. GObject is \
the base type system of the GNOME project. GI-Docgen reuses the \
introspection data generated by GObject-based libraries to generate the API \
reference of these libraries, as well as other ancillary documentation."
HOMEPAGE = "https://gnome.pages.gitlab.gnome.org/gi-docgen/"

LICENSE = "GPLv3+ & Apache-2.0"
LIC_FILES_CHKSUM = "file://gi-docgen.py;beginline=1;endline=5;md5=2dc0f1f01202478cfe813c0e7f80b326"

SRC_URI = "git://gitlab.gnome.org/GNOME/gi-docgen.git;protocol=https;branch=main"

PV = "2021.8"
SRCREV = "a284455af9b3cad179900f6e1f12b59a3d40c06b"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-asyncio python3-core python3-jinja2 python3-json python3-markdown python3-markupsafe python3-pygments python3-toml python3-typogrify python3-xml"

BBCLASSEXTEND = "native"
