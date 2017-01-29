# pkcs11j

## Overview
The pkcs11j project gives Java users a Java based PKCS#11 API to any PKCS#11 standards compliant Hardware Security Module (HSM) or software API.  The PKCS#11 API is a vendor-neutral, open standards API governed by the OASIS standards body.  It provides a standard programmatic interface to Hardware Security Modules (HSMs) and HSM PaaS solutions such as Amazon's CloudHSM.

## History
This project is a fork from the IAIK pkcs11wrapper project found at https://github.com/mikma/pkcs11wrapper.  This fork strips the code base down to the bare minimum required for PKCS#11 operations.  It also includes the native JNI code which can be compiled on the target platform using make.  See /src/native for the native binary files.

## Tested HSMs
The pkcs11j project has been tested to work with the following HSM devices and software based testbed HSMs.
- SafeNet / Gemalto Luna PCIe K5/K6
- Utimaco Security Server Simulator (SMOS Ver. 3.1.2.3)
- OpenDNSSEC SoftHSM 2.2.0