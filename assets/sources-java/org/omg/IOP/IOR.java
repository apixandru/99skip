package org.omg.IOP;


/**
* org/omg/IOP/IOR.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u202/12319/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, December 15, 2018 12:40:35 PM PST
*/

public final class IOR implements org.omg.CORBA.portable.IDLEntity
{

  /** The type id, represented as a String. */
  public String type_id = null;

  /** 
  	 * An array of tagged profiles associated with this 
  	 * object reference. 
  	 */
  public org.omg.IOP.TaggedProfile profiles[] = null;

  public IOR ()
  {
  } // ctor

  public IOR (String _type_id, org.omg.IOP.TaggedProfile[] _profiles)
  {
    type_id = _type_id;
    profiles = _profiles;
  } // ctor

} // class IOR
