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
<a class="file-line-num diff-line-num" data-line-number="76" href="#L76" id="L76">
76
</a>
<a class="file-line-num diff-line-num" data-line-number="77" href="#L77" id="L77">
77
</a>
<a class="file-line-num diff-line-num" data-line-number="78" href="#L78" id="L78">
78
</a>
<a class="file-line-num diff-line-num" data-line-number="79" href="#L79" id="L79">
79
</a>
<a class="file-line-num diff-line-num" data-line-number="80" href="#L80" id="L80">
80
</a>
<a class="file-line-num diff-line-num" data-line-number="81" href="#L81" id="L81">
81
</a>
<a class="file-line-num diff-line-num" data-line-number="82" href="#L82" id="L82">
82
</a>
<a class="file-line-num diff-line-num" data-line-number="83" href="#L83" id="L83">
83
</a>
<a class="file-line-num diff-line-num" data-line-number="84" href="#L84" id="L84">
84
</a>
<a class="file-line-num diff-line-num" data-line-number="85" href="#L85" id="L85">
85
</a>
<a class="file-line-num diff-line-num" data-line-number="86" href="#L86" id="L86">
86
</a>
<a class="file-line-num diff-line-num" data-line-number="87" href="#L87" id="L87">
87
</a>
<a class="file-line-num diff-line-num" data-line-number="88" href="#L88" id="L88">
88
</a>
<a class="file-line-num diff-line-num" data-line-number="89" href="#L89" id="L89">
89
</a>
<a class="file-line-num diff-line-num" data-line-number="90" href="#L90" id="L90">
90
</a>
<a class="file-line-num diff-line-num" data-line-number="91" href="#L91" id="L91">
91
</a>
<a class="file-line-num diff-line-num" data-line-number="92" href="#L92" id="L92">
92
</a>
<a class="file-line-num diff-line-num" data-line-number="93" href="#L93" id="L93">
93
</a>
<a class="file-line-num diff-line-num" data-line-number="94" href="#L94" id="L94">
94
</a>
<a class="file-line-num diff-line-num" data-line-number="95" href="#L95" id="L95">
95
</a>
<a class="file-line-num diff-line-num" data-line-number="96" href="#L96" id="L96">
96
</a>
<a class="file-line-num diff-line-num" data-line-number="97" href="#L97" id="L97">
97
</a>
<a class="file-line-num diff-line-num" data-line-number="98" href="#L98" id="L98">
98
</a>
<a class="file-line-num diff-line-num" data-line-number="99" href="#L99" id="L99">
99
</a>
<a class="file-line-num diff-line-num" data-line-number="100" href="#L100" id="L100">
100
</a>
<a class="file-line-num diff-line-num" data-line-number="101" href="#L101" id="L101">
101
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="kn">package</span> <span class="nn">org.omg.DynamicAny</span><span class="o">;</span></span>
<span id="LC2" class="line" lang="java"></span>
<span id="LC3" class="line" lang="java"></span>
<span id="LC4" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC5" class="line" lang="java"><span class="cm">* org/omg/DynamicAny/DynUnionOperations.java .</span></span>
<span id="LC6" class="line" lang="java"><span class="cm">* Generated by the IDL-to-Java compiler (portable), version "3.2"</span></span>
<span id="LC7" class="line" lang="java"><span class="cm">* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u202/12319/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl</span></span>
<span id="LC8" class="line" lang="java"><span class="cm">* Saturday, December 15, 2018 12:40:35 PM PST</span></span>
<span id="LC9" class="line" lang="java"><span class="cm">*/</span></span>
<span id="LC10" class="line" lang="java"></span>
<span id="LC11" class="line" lang="java"></span>
<span id="LC12" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC13" class="line" lang="java"><span class="cm">    * DynUnion objects support the manipulation of IDL unions.</span></span>
<span id="LC14" class="line" lang="java"><span class="cm">    * A union can have only two valid current positions:</span></span>
<span id="LC15" class="line" lang="java"><span class="cm">    * &lt;UL&gt;</span></span>
<span id="LC16" class="line" lang="java"><span class="cm">    * &lt;LI&gt;zero, which denotes the discriminator</span></span>
<span id="LC17" class="line" lang="java"><span class="cm">    * &lt;LI&gt;one, which denotes the active member</span></span>
<span id="LC18" class="line" lang="java"><span class="cm">    * &lt;/UL&gt;</span></span>
<span id="LC19" class="line" lang="java"><span class="cm">    * The component_count value for a union depends on the current discriminator:</span></span>
<span id="LC20" class="line" lang="java"><span class="cm">    * it is 2 for a union whose discriminator indicates a named member, and 1 otherwise.</span></span>
<span id="LC21" class="line" lang="java"><span class="cm">    */</span></span>
<span id="LC22" class="line" lang="java"><span class="kd">public</span> <span class="kd">interface</span> <span class="nc">DynUnionOperations</span>  <span class="kd">extends</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyOperations</span></span>
<span id="LC23" class="line" lang="java"><span class="o">{</span></span>
<span id="LC24" class="line" lang="java"></span>
<span id="LC25" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC26" class="line" lang="java"><span class="cm">          * Returns the current discriminator value.</span></span>
<span id="LC27" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC28" class="line" lang="java">  <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAny</span> <span class="nf">get_discriminator</span> <span class="o">();</span></span>
<span id="LC29" class="line" lang="java"></span>
<span id="LC30" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC31" class="line" lang="java"><span class="cm">          * Sets the discriminator of the DynUnion to the specified value.</span></span>
<span id="LC32" class="line" lang="java"><span class="cm">          * Setting the discriminator to a value that is consistent with the currently active union member</span></span>
<span id="LC33" class="line" lang="java"><span class="cm">          * does not affect the currently active member. Setting the discriminator to a value that is inconsistent</span></span>
<span id="LC34" class="line" lang="java"><span class="cm">          * with the currently active member deactivates the member and activates the member that is consistent</span></span>
<span id="LC35" class="line" lang="java"><span class="cm">          * with the new discriminator value (if there is a member for that value) by initializing the member</span></span>
<span id="LC36" class="line" lang="java"><span class="cm">          * to its default value.</span></span>
<span id="LC37" class="line" lang="java"><span class="cm">          * Setting the discriminator of a union sets the current position to 0 if the discriminator value</span></span>
<span id="LC38" class="line" lang="java"><span class="cm">          * indicates a non-existent union member (has_no_active_member returns true in this case).</span></span>
<span id="LC39" class="line" lang="java"><span class="cm">          * Otherwise, if the discriminator value indicates a named union member, the current position is set to 1</span></span>
<span id="LC40" class="line" lang="java"><span class="cm">          * (has_no_active_member returns false and component_count returns 2 in this case).</span></span>
<span id="LC41" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC42" class="line" lang="java"><span class="cm">          * @exception TypeMismatch if the TypeCode of the parameter is not equivalent to the TypeCode</span></span>
<span id="LC43" class="line" lang="java"><span class="cm">          *            of the union's discriminator</span></span>
<span id="LC44" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC45" class="line" lang="java">  <span class="kt">void</span> <span class="nf">set_discriminator</span> <span class="o">(</span><span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAny</span> <span class="n">d</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyPackage</span><span class="o">.</span><span class="na">TypeMismatch</span><span class="o">;</span></span>
<span id="LC46" class="line" lang="java"></span>
<span id="LC47" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC48" class="line" lang="java"><span class="cm">          * Sets the discriminator to a value that is consistent with the value of the default case of a union.</span></span>
<span id="LC49" class="line" lang="java"><span class="cm">          * It sets the current position to zero and causes component_count to return 2.</span></span>
<span id="LC50" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC51" class="line" lang="java"><span class="cm">          * @exception TypeMismatch if the union does not have an explicit default case</span></span>
<span id="LC52" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC53" class="line" lang="java">  <span class="kt">void</span> <span class="nf">set_to_default_member</span> <span class="o">()</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyPackage</span><span class="o">.</span><span class="na">TypeMismatch</span><span class="o">;</span></span>
<span id="LC54" class="line" lang="java"></span>
<span id="LC55" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC56" class="line" lang="java"><span class="cm">          * Sets the discriminator to a value that does not correspond to any of the unions case labels.</span></span>
<span id="LC57" class="line" lang="java"><span class="cm">          * It sets the current position to zero and causes component_count to return 1.</span></span>
<span id="LC58" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC59" class="line" lang="java"><span class="cm">          * @exception TypeMismatch if the union has an explicit default case or if it uses the entire range</span></span>
<span id="LC60" class="line" lang="java"><span class="cm">          *            of discriminator values for explicit case labels</span></span>
<span id="LC61" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC62" class="line" lang="java">  <span class="kt">void</span> <span class="nf">set_to_no_active_member</span> <span class="o">()</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyPackage</span><span class="o">.</span><span class="na">TypeMismatch</span><span class="o">;</span></span>
<span id="LC63" class="line" lang="java"></span>
<span id="LC64" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC65" class="line" lang="java"><span class="cm">          * Returns true if the union has no active member, that is, the unions value consists solely</span></span>
<span id="LC66" class="line" lang="java"><span class="cm">          * of its discriminator because the discriminator has a value that is not listed as an explicit case label.</span></span>
<span id="LC67" class="line" lang="java"><span class="cm">          * Calling this operation on a union that has a default case returns false.</span></span>
<span id="LC68" class="line" lang="java"><span class="cm">          * Calling this operation on a union that uses the entire range of discriminator values</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">          * for explicit case labels returns false.</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC71" class="line" lang="java">  <span class="kt">boolean</span> <span class="nf">has_no_active_member</span> <span class="o">();</span></span>
<span id="LC72" class="line" lang="java"></span>
<span id="LC73" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC74" class="line" lang="java"><span class="cm">          * Returns the TCKind value of the discriminators TypeCode.</span></span>
<span id="LC75" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC76" class="line" lang="java">  <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">TCKind</span> <span class="nf">discriminator_kind</span> <span class="o">();</span></span>
<span id="LC77" class="line" lang="java"></span>
<span id="LC78" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC79" class="line" lang="java"><span class="cm">          * Returns the TCKind value of the currently active members TypeCode. </span></span>
<span id="LC80" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC81" class="line" lang="java"><span class="cm">          * @exception InvalidValue if the union does not have a currently active member</span></span>
<span id="LC82" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC83" class="line" lang="java">  <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">TCKind</span> <span class="nf">member_kind</span> <span class="o">()</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyPackage</span><span class="o">.</span><span class="na">InvalidValue</span><span class="o">;</span></span>
<span id="LC84" class="line" lang="java"></span>
<span id="LC85" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC86" class="line" lang="java"><span class="cm">          * Returns the currently active member. Note that the returned reference remains valid only</span></span>
<span id="LC87" class="line" lang="java"><span class="cm">          * for as long as the currently active member does not change. Using the returned reference</span></span>
<span id="LC88" class="line" lang="java"><span class="cm">          * beyond the life time of the currently active member raises OBJECT_NOT_EXIST. </span></span>
<span id="LC89" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC90" class="line" lang="java"><span class="cm">          * @exception InvalidValue if the union has no active member</span></span>
<span id="LC91" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC92" class="line" lang="java">  <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAny</span> <span class="nf">member</span> <span class="o">()</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyPackage</span><span class="o">.</span><span class="na">InvalidValue</span><span class="o">;</span></span>
<span id="LC93" class="line" lang="java"></span>
<span id="LC94" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC95" class="line" lang="java"><span class="cm">          * Returns the name of the currently active member. If the unions TypeCode does not contain</span></span>
<span id="LC96" class="line" lang="java"><span class="cm">          * a member name for the currently active member, the operation returns an empty string.</span></span>
<span id="LC97" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC98" class="line" lang="java"><span class="cm">          * @exception InvalidValue if the union has no active member</span></span>
<span id="LC99" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC100" class="line" lang="java">  <span class="nc">String</span> <span class="nf">member_name</span> <span class="o">()</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyPackage</span><span class="o">.</span><span class="na">InvalidValue</span><span class="o">;</span></span>
<span id="LC101" class="line" lang="java"><span class="o">}</span> <span class="c1">// interface DynUnionOperations</span></span>
