// Copyright (c) 2002 Graz University of Technology. All rights reserved.
// 
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
// 
// 1. Redistributions of source code must retain the above copyright notice, this
//    list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
// 
// 3. The end-user documentation included with the redistribution, if any, must
//    include the following acknowledgment:
// 
//    "This product includes software developed by IAIK of Graz University of
//     Technology."
// 
//    Alternately, this acknowledgment may appear in the software itself, if and
//    wherever such third-party acknowledgments normally appear.
// 
// 4. The names "Graz University of Technology" and "IAIK of Graz University of
//    Technology" must not be used to endorse or promote products derived from this
//    software without prior written permission.
// 
// 5. Products derived from this software may not be called "IAIK PKCS Wrapper",
//    nor may "IAIK" appear in their name, without prior written permission of
//    Graz University of Technology.
// 
// THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE LICENSOR BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
// OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
// OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
// ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
// OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGE.

package iaik.pkcs.pkcs11.wrapper;

/**
 * class CK_MECHANISM specifies a particular mechanism and any parameters it
 * requires.<p>
 * <B>PKCS#11 structure:</B>
 * <PRE>
 *  typedef struct CK_MECHANISM {&nbsp;&nbsp;
 *    CK_MECHANISM_TYPE mechanism;&nbsp;&nbsp;
 *    CK_VOID_PTR pParameter;&nbsp;&nbsp;
 *    CK_ULONG ulParameterLen;&nbsp;&nbsp;
 *  } CK_MECHANISM;
 * </PRE>
 *
 * @author Karl Scheibelhofer <Karl.Scheibelhofer@iaik.at>
 * @author Martin Schläffer <schlaeff@sbox.tugraz.at>
 */
public class CK_MECHANISM {

	/**
	 * <B>PKCS#11:</B>
	 * <PRE>
	 *   CK_MECHANISM_TYPE mechanism;
	 * </PRE>
	 */
	public long mechanism;

	/**
	 * <B>PKCS#11:</B>
	 * <PRE>
	 *   CK_VOID_PTR pParameter;
	 *   CK_ULONG ulParameterLen;
	 * </PRE>
	 */
	public Object pParameter;

	/* ulParameterLen was changed from CK_USHORT to CK_ULONG for
	 * v2.0 */
	//CK_ULONG ulParameterLen;  /* in bytes */
	// public long ulParameterLen;  /* in bytes */

	/**
	 * Returns the string representation of CK_MECHANISM.
	 *
	 * @return the string representation of CK_MECHANISM
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(Constants.INDENT);
		buffer.append("mechanism: ");
		buffer.append(mechanism);
		buffer.append(Constants.NEWLINE);

		buffer.append(Constants.INDENT);
		buffer.append("pParameter: ");
		buffer.append(pParameter.toString());
		buffer.append(Constants.NEWLINE);

		buffer.append(Constants.INDENT);
		buffer.append("ulParameterLen: ??");
		//buffer.append(pParameter.length);
		//buffer.append(Constants.NEWLINE);

		return buffer.toString();
	}

}
