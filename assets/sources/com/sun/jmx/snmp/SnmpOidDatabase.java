<div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple" data-url="/redhat/centos-stream/src/apache-commons-lang3/-/blob/c8s-stream-3.6/src/main/java/org/apache/commons/lang3/StringUtils.java?format=json&amp;viewer=simple" data-loaded="true"><div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple">
<div class="file-content code js-syntax-highlight white" id="blob-content">
<div class="line-numbers">
<a class="file-line-num diff-line-num" data-line-number="1" href="#L1" id="L1">
1
</a>
<a class="file-line-num diff-line-num" data-line-number="2" href="#L2" id="L2">
2
</a>
<a class="file-line-num diff-line-num" data-line-number="3" href="#L3" id="L3">
3
</a>
<a class="file-line-num diff-line-num" data-line-number="4" href="#L4" id="L4">
4
</a>
<a class="file-line-num diff-line-num" data-line-number="5" href="#L5" id="L5">
5
</a>
<a class="file-line-num diff-line-num" data-line-number="6" href="#L6" id="L6">
6
</a>
<a class="file-line-num diff-line-num" data-line-number="7" href="#L7" id="L7">
7
</a>
<a class="file-line-num diff-line-num" data-line-number="8" href="#L8" id="L8">
8
</a>
<a class="file-line-num diff-line-num" data-line-number="9" href="#L9" id="L9">
9
</a>
<a class="file-line-num diff-line-num" data-line-number="10" href="#L10" id="L10">
10
</a>
<a class="file-line-num diff-line-num" data-line-number="11" href="#L11" id="L11">
11
</a>
<a class="file-line-num diff-line-num" data-line-number="12" href="#L12" id="L12">
12
</a>
<a class="file-line-num diff-line-num" data-line-number="13" href="#L13" id="L13">
13
</a>
<a class="file-line-num diff-line-num" data-line-number="14" href="#L14" id="L14">
14
</a>
<a class="file-line-num diff-line-num" data-line-number="15" href="#L15" id="L15">
15
</a>
<a class="file-line-num diff-line-num" data-line-number="16" href="#L16" id="L16">
16
</a>
<a class="file-line-num diff-line-num" data-line-number="17" href="#L17" id="L17">
17
</a>
<a class="file-line-num diff-line-num" data-line-number="18" href="#L18" id="L18">
18
</a>
<a class="file-line-num diff-line-num" data-line-number="19" href="#L19" id="L19">
19
</a>
<a class="file-line-num diff-line-num" data-line-number="20" href="#L20" id="L20">
20
</a>
<a class="file-line-num diff-line-num" data-line-number="21" href="#L21" id="L21">
21
</a>
<a class="file-line-num diff-line-num" data-line-number="22" href="#L22" id="L22">
22
</a>
<a class="file-line-num diff-line-num" data-line-number="23" href="#L23" id="L23">
23
</a>
<a class="file-line-num diff-line-num" data-line-number="24" href="#L24" id="L24">
24
</a>
<a class="file-line-num diff-line-num" data-line-number="25" href="#L25" id="L25">
25
</a>
<a class="file-line-num diff-line-num" data-line-number="26" href="#L26" id="L26">
26
</a>
<a class="file-line-num diff-line-num" data-line-number="27" href="#L27" id="L27">
27
</a>
<a class="file-line-num diff-line-num" data-line-number="28" href="#L28" id="L28">
28
</a>
<a class="file-line-num diff-line-num" data-line-number="29" href="#L29" id="L29">
29
</a>
<a class="file-line-num diff-line-num" data-line-number="30" href="#L30" id="L30">
30
</a>
<a class="file-line-num diff-line-num" data-line-number="31" href="#L31" id="L31">
31
</a>
<a class="file-line-num diff-line-num" data-line-number="32" href="#L32" id="L32">
32
</a>
<a class="file-line-num diff-line-num" data-line-number="33" href="#L33" id="L33">
33
</a>
<a class="file-line-num diff-line-num" data-line-number="34" href="#L34" id="L34">
34
</a>
<a class="file-line-num diff-line-num" data-line-number="35" href="#L35" id="L35">
35
</a>
<a class="file-line-num diff-line-num" data-line-number="36" href="#L36" id="L36">
36
</a>
<a class="file-line-num diff-line-num" data-line-number="37" href="#L37" id="L37">
37
</a>
<a class="file-line-num diff-line-num" data-line-number="38" href="#L38" id="L38">
38
</a>
<a class="file-line-num diff-line-num" data-line-number="39" href="#L39" id="L39">
39
</a>
<a class="file-line-num diff-line-num" data-line-number="40" href="#L40" id="L40">
40
</a>
<a class="file-line-num diff-line-num" data-line-number="41" href="#L41" id="L41">
41
</a>
<a class="file-line-num diff-line-num" data-line-number="42" href="#L42" id="L42">
42
</a>
<a class="file-line-num diff-line-num" data-line-number="43" href="#L43" id="L43">
43
</a>
<a class="file-line-num diff-line-num" data-line-number="44" href="#L44" id="L44">
44
</a>
<a class="file-line-num diff-line-num" data-line-number="45" href="#L45" id="L45">
45
</a>
<a class="file-line-num diff-line-num" data-line-number="46" href="#L46" id="L46">
46
</a>
<a class="file-line-num diff-line-num" data-line-number="47" href="#L47" id="L47">
47
</a>
<a class="file-line-num diff-line-num" data-line-number="48" href="#L48" id="L48">
48
</a>
<a class="file-line-num diff-line-num" data-line-number="49" href="#L49" id="L49">
49
</a>
<a class="file-line-num diff-line-num" data-line-number="50" href="#L50" id="L50">
50
</a>
<a class="file-line-num diff-line-num" data-line-number="51" href="#L51" id="L51">
51
</a>
<a class="file-line-num diff-line-num" data-line-number="52" href="#L52" id="L52">
52
</a>
<a class="file-line-num diff-line-num" data-line-number="53" href="#L53" id="L53">
53
</a>
<a class="file-line-num diff-line-num" data-line-number="54" href="#L54" id="L54">
54
</a>
<a class="file-line-num diff-line-num" data-line-number="55" href="#L55" id="L55">
55
</a>
<a class="file-line-num diff-line-num" data-line-number="56" href="#L56" id="L56">
56
</a>
<a class="file-line-num diff-line-num" data-line-number="57" href="#L57" id="L57">
57
</a>
<a class="file-line-num diff-line-num" data-line-number="58" href="#L58" id="L58">
58
</a>
<a class="file-line-num diff-line-num" data-line-number="59" href="#L59" id="L59">
59
</a>
<a class="file-line-num diff-line-num" data-line-number="60" href="#L60" id="L60">
60
</a>
<a class="file-line-num diff-line-num" data-line-number="61" href="#L61" id="L61">
61
</a>
<a class="file-line-num diff-line-num" data-line-number="62" href="#L62" id="L62">
62
</a>
<a class="file-line-num diff-line-num" data-line-number="63" href="#L63" id="L63">
63
</a>
<a class="file-line-num diff-line-num" data-line-number="64" href="#L64" id="L64">
64
</a>
<a class="file-line-num diff-line-num" data-line-number="65" href="#L65" id="L65">
65
</a>
<a class="file-line-num diff-line-num" data-line-number="66" href="#L66" id="L66">
66
</a>
<a class="file-line-num diff-line-num" data-line-number="67" href="#L67" id="L67">
67
</a>
<a class="file-line-num diff-line-num" data-line-number="68" href="#L68" id="L68">
68
</a>
<a class="file-line-num diff-line-num" data-line-number="69" href="#L69" id="L69">
69
</a>
<a class="file-line-num diff-line-num" data-line-number="70" href="#L70" id="L70">
70
</a>
<a class="file-line-num diff-line-num" data-line-number="71" href="#L71" id="L71">
71
</a>
<a class="file-line-num diff-line-num" data-line-number="72" href="#L72" id="L72">
72
</a>
<a class="file-line-num diff-line-num" data-line-number="73" href="#L73" id="L73">
73
</a>
<a class="file-line-num diff-line-num" data-line-number="74" href="#L74" id="L74">
74
</a>
<a class="file-line-num diff-line-num" data-line-number="75" href="#L75" id="L75">
75
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * Copyright (c) 2007, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC6" class="line" lang="java"><span class="c1">// Copyright (c) 1995-96 by Cisco Systems, Inc.</span></span>
<span id="LC7" class="line" lang="java"></span>
<span id="LC8" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.jmx.snmp</span><span class="o">;</span></span>
<span id="LC9" class="line" lang="java"></span>
<span id="LC10" class="line" lang="java"><span class="c1">// java import</span></span>
<span id="LC11" class="line" lang="java"><span class="c1">//</span></span>
<span id="LC12" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.Vector</span><span class="o">;</span></span>
<span id="LC13" class="line" lang="java"></span>
<span id="LC14" class="line" lang="java"><span class="c1">// jmx import</span></span>
<span id="LC15" class="line" lang="java"><span class="c1">//</span></span>
<span id="LC16" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.jmx.snmp.SnmpOidTable</span><span class="o">;</span></span>
<span id="LC17" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.jmx.snmp.SnmpOidRecord</span><span class="o">;</span></span>
<span id="LC18" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.jmx.snmp.SnmpStatusException</span><span class="o">;</span></span>
<span id="LC19" class="line" lang="java"></span>
<span id="LC20" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> * Defines the minimal functionality that should be provided by</span></span>
<span id="LC22" class="line" lang="java"><span class="cm"> * a class containing a set of &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; objects containing metadata definitions for MIB variables.</span></span>
<span id="LC23" class="line" lang="java"><span class="cm"> * Each &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; should contain information on variables of one MIB.</span></span>
<span id="LC24" class="line" lang="java"><span class="cm"> * The &lt;CODE&gt;SnmpOidDatabase&lt;/CODE&gt; is a "repository" of &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt;.</span></span>
<span id="LC25" class="line" lang="java"><span class="cm"> * It extends the &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; interface in order to provide resolution of the MIB variables.</span></span>
<span id="LC26" class="line" lang="java"><span class="cm"> * &lt;P&gt;</span></span>
<span id="LC27" class="line" lang="java"><span class="cm"> * &lt;p&gt;&lt;b&gt;This API is a Sun Microsystems internal API  and is subject</span></span>
<span id="LC28" class="line" lang="java"><span class="cm"> * to change without notice.&lt;/b&gt;&lt;/p&gt;</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> * @see com.sun.jmx.snmp.SnmpOidTable</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC31" class="line" lang="java"></span>
<span id="LC32" class="line" lang="java"><span class="kd">public</span> <span class="kd">interface</span> <span class="nc">SnmpOidDatabase</span> <span class="kd">extends</span> <span class="nc">SnmpOidTable</span> <span class="o">{</span></span>
<span id="LC33" class="line" lang="java"></span>
<span id="LC34" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC35" class="line" lang="java"><span class="cm">     * Adds an &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; object in this &lt;CODE&gt;SnmpOidDatabase&lt;/CODE&gt;.</span></span>
<span id="LC36" class="line" lang="java"><span class="cm">     * @param table The table to add.</span></span>
<span id="LC37" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC38" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">add</span><span class="o">(</span><span class="nc">SnmpOidTable</span> <span class="n">table</span><span class="o">);</span></span>
<span id="LC39" class="line" lang="java"></span>
<span id="LC40" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC41" class="line" lang="java"><span class="cm">     * Removes an &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; object from this &lt;CODE&gt;SnmpOidDatabase&lt;/CODE&gt;.</span></span>
<span id="LC42" class="line" lang="java"><span class="cm">     * @param table The table to be removed.</span></span>
<span id="LC43" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC44" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">remove</span><span class="o">(</span><span class="nc">SnmpOidTable</span> <span class="n">table</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">SnmpStatusException</span><span class="o">;</span></span>
<span id="LC45" class="line" lang="java"></span>
<span id="LC46" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC47" class="line" lang="java"><span class="cm">     * Removes all the &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; objects from this &lt;CODE&gt;SnmpOidDatabase&lt;/CODE&gt;.</span></span>
<span id="LC48" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC49" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">removeAll</span><span class="o">();</span></span>
<span id="LC50" class="line" lang="java"></span>
<span id="LC51" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC52" class="line" lang="java"><span class="cm">     * Searches for a MIB variable given its logical name and returns an &lt;CODE&gt;SnmpOidRecord&lt;/CODE&gt;</span></span>
<span id="LC53" class="line" lang="java"><span class="cm">     * object containing information on the variable.</span></span>
<span id="LC54" class="line" lang="java"><span class="cm">     * @param name The name of the MIB variable.</span></span>
<span id="LC55" class="line" lang="java"><span class="cm">     * @return The &lt;CODE&gt;SnmpOidRecord&lt;/CODE&gt; object containing information on the variable.</span></span>
<span id="LC56" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC57" class="line" lang="java">    <span class="kd">public</span> <span class="nc">SnmpOidRecord</span> <span class="nf">resolveVarName</span><span class="o">(</span><span class="nc">String</span> <span class="n">name</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">SnmpStatusException</span> <span class="o">;</span></span>
<span id="LC58" class="line" lang="java"></span>
<span id="LC59" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC60" class="line" lang="java"><span class="cm">     * Searches for a MIB variable given its OID and returns an &lt;CODE&gt;SnmpOidRecord&lt;/CODE&gt; object containing</span></span>
<span id="LC61" class="line" lang="java"><span class="cm">     * information on the variable.</span></span>
<span id="LC62" class="line" lang="java"><span class="cm">     * @param oid The OID of the MIB variable.</span></span>
<span id="LC63" class="line" lang="java"><span class="cm">     * @return The &lt;CODE&gt;SnmpOidRecord&lt;/CODE&gt; object containing information on the variable.</span></span>
<span id="LC64" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC65" class="line" lang="java">    <span class="kd">public</span> <span class="nc">SnmpOidRecord</span> <span class="nf">resolveVarOid</span><span class="o">(</span><span class="nc">String</span> <span class="n">oid</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">SnmpStatusException</span><span class="o">;</span></span>
<span id="LC66" class="line" lang="java"></span>
<span id="LC67" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC68" class="line" lang="java"><span class="cm">     * Returns a list that can be used to traverse all the entries of the &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; objects</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">     * of this &lt;CODE&gt;SnmpOidDatabase&lt;/CODE&gt;.</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">     * @return A vector of &lt;CODE&gt;SnmpOidTable&lt;/CODE&gt; objects containing all the elements of this &lt;CODE&gt;SnmpOidDatabase&lt;/CODE&gt;.</span></span>
<span id="LC71" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC72" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Vector</span><span class="o">&lt;?&gt;</span> <span class="n">getAllEntries</span><span class="o">()</span> <span class="o">;</span></span>
<span id="LC73" class="line" lang="java">    <span class="c1">// We can't specify Vector&lt;SnmpOidTable&gt; because the subinterface SnmpOidTable</span></span>
<span id="LC74" class="line" lang="java">    <span class="c1">// overrides this method to return Vector&lt;SnmpOidRecord&gt;</span></span>
<span id="LC75" class="line" lang="java"><span class="o">}</span></span>
