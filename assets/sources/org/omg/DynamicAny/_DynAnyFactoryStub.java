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
<a class="file-line-num diff-line-num" data-line-number="102" href="#L102" id="L102">
102
</a>
<a class="file-line-num diff-line-num" data-line-number="103" href="#L103" id="L103">
103
</a>
<a class="file-line-num diff-line-num" data-line-number="104" href="#L104" id="L104">
104
</a>
<a class="file-line-num diff-line-num" data-line-number="105" href="#L105" id="L105">
105
</a>
<a class="file-line-num diff-line-num" data-line-number="106" href="#L106" id="L106">
106
</a>
<a class="file-line-num diff-line-num" data-line-number="107" href="#L107" id="L107">
107
</a>
<a class="file-line-num diff-line-num" data-line-number="108" href="#L108" id="L108">
108
</a>
<a class="file-line-num diff-line-num" data-line-number="109" href="#L109" id="L109">
109
</a>
<a class="file-line-num diff-line-num" data-line-number="110" href="#L110" id="L110">
110
</a>
<a class="file-line-num diff-line-num" data-line-number="111" href="#L111" id="L111">
111
</a>
<a class="file-line-num diff-line-num" data-line-number="112" href="#L112" id="L112">
112
</a>
<a class="file-line-num diff-line-num" data-line-number="113" href="#L113" id="L113">
113
</a>
<a class="file-line-num diff-line-num" data-line-number="114" href="#L114" id="L114">
114
</a>
<a class="file-line-num diff-line-num" data-line-number="115" href="#L115" id="L115">
115
</a>
<a class="file-line-num diff-line-num" data-line-number="116" href="#L116" id="L116">
116
</a>
<a class="file-line-num diff-line-num" data-line-number="117" href="#L117" id="L117">
117
</a>
<a class="file-line-num diff-line-num" data-line-number="118" href="#L118" id="L118">
118
</a>
<a class="file-line-num diff-line-num" data-line-number="119" href="#L119" id="L119">
119
</a>
<a class="file-line-num diff-line-num" data-line-number="120" href="#L120" id="L120">
120
</a>
<a class="file-line-num diff-line-num" data-line-number="121" href="#L121" id="L121">
121
</a>
<a class="file-line-num diff-line-num" data-line-number="122" href="#L122" id="L122">
122
</a>
<a class="file-line-num diff-line-num" data-line-number="123" href="#L123" id="L123">
123
</a>
<a class="file-line-num diff-line-num" data-line-number="124" href="#L124" id="L124">
124
</a>
<a class="file-line-num diff-line-num" data-line-number="125" href="#L125" id="L125">
125
</a>
<a class="file-line-num diff-line-num" data-line-number="126" href="#L126" id="L126">
126
</a>
<a class="file-line-num diff-line-num" data-line-number="127" href="#L127" id="L127">
127
</a>
<a class="file-line-num diff-line-num" data-line-number="128" href="#L128" id="L128">
128
</a>
<a class="file-line-num diff-line-num" data-line-number="129" href="#L129" id="L129">
129
</a>
<a class="file-line-num diff-line-num" data-line-number="130" href="#L130" id="L130">
130
</a>
<a class="file-line-num diff-line-num" data-line-number="131" href="#L131" id="L131">
131
</a>
<a class="file-line-num diff-line-num" data-line-number="132" href="#L132" id="L132">
132
</a>
<a class="file-line-num diff-line-num" data-line-number="133" href="#L133" id="L133">
133
</a>
<a class="file-line-num diff-line-num" data-line-number="134" href="#L134" id="L134">
134
</a>
<a class="file-line-num diff-line-num" data-line-number="135" href="#L135" id="L135">
135
</a>
<a class="file-line-num diff-line-num" data-line-number="136" href="#L136" id="L136">
136
</a>
<a class="file-line-num diff-line-num" data-line-number="137" href="#L137" id="L137">
137
</a>
<a class="file-line-num diff-line-num" data-line-number="138" href="#L138" id="L138">
138
</a>
<a class="file-line-num diff-line-num" data-line-number="139" href="#L139" id="L139">
139
</a>
<a class="file-line-num diff-line-num" data-line-number="140" href="#L140" id="L140">
140
</a>
<a class="file-line-num diff-line-num" data-line-number="141" href="#L141" id="L141">
141
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="kn">package</span> <span class="nn">org.omg.DynamicAny</span><span class="o">;</span></span>
<span id="LC2" class="line" lang="java"></span>
<span id="LC3" class="line" lang="java"></span>
<span id="LC4" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC5" class="line" lang="java"><span class="cm">* org/omg/DynamicAny/_DynAnyFactoryStub.java .</span></span>
<span id="LC6" class="line" lang="java"><span class="cm">* Generated by the IDL-to-Java compiler (portable), version "3.2"</span></span>
<span id="LC7" class="line" lang="java"><span class="cm">* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u202/12319/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl</span></span>
<span id="LC8" class="line" lang="java"><span class="cm">* Saturday, December 15, 2018 12:40:35 PM PST</span></span>
<span id="LC9" class="line" lang="java"><span class="cm">*/</span></span>
<span id="LC10" class="line" lang="java"></span>
<span id="LC11" class="line" lang="java"></span>
<span id="LC12" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC13" class="line" lang="java"><span class="cm">    * DynAny objects can be created by invoking operations on the DynAnyFactory object.</span></span>
<span id="LC14" class="line" lang="java"><span class="cm">    * Generally there are only two ways to create a DynAny object:</span></span>
<span id="LC15" class="line" lang="java"><span class="cm">    * &lt;UL&gt;</span></span>
<span id="LC16" class="line" lang="java"><span class="cm">    * &lt;LI&gt;invoking an operation on an existing DynAny object</span></span>
<span id="LC17" class="line" lang="java"><span class="cm">    * &lt;LI&gt;invoking an operation on a DynAnyFactory object</span></span>
<span id="LC18" class="line" lang="java"><span class="cm">    * &lt;/UL&gt;</span></span>
<span id="LC19" class="line" lang="java"><span class="cm">    * A constructed DynAny object supports operations that enable the creation of new DynAny</span></span>
<span id="LC20" class="line" lang="java"><span class="cm">    * objects encapsulating access to the value of some constituent.</span></span>
<span id="LC21" class="line" lang="java"><span class="cm">    * DynAny objects also support the copy operation for creating new DynAny objects.</span></span>
<span id="LC22" class="line" lang="java"><span class="cm">    * A reference to the DynAnyFactory object is obtained by calling ORB.resolve_initial_references()</span></span>
<span id="LC23" class="line" lang="java"><span class="cm">    * with the identifier parameter set to the string constant "DynAnyFactory".</span></span>
<span id="LC24" class="line" lang="java"><span class="cm">    * &lt;P&gt;Dynamic interpretation of an any usually involves creating a DynAny object using create_dyn_any()</span></span>
<span id="LC25" class="line" lang="java"><span class="cm">    * as the first step. Depending on the type of the any, the resulting DynAny object reference can be narrowed</span></span>
<span id="LC26" class="line" lang="java"><span class="cm">    * to a DynFixed, DynStruct, DynSequence, DynArray, DynUnion, DynEnum, or DynValue object reference.</span></span>
<span id="LC27" class="line" lang="java"><span class="cm">    * &lt;P&gt;Dynamic creation of an any involves creating a DynAny object using create_dyn_any_from_type_code(),</span></span>
<span id="LC28" class="line" lang="java"><span class="cm">    * passing the TypeCode associated with the value to be created. The returned reference is narrowed to one of</span></span>
<span id="LC29" class="line" lang="java"><span class="cm">    * the complex types, such as DynStruct, if appropriate. Then, the value can be initialized by means of</span></span>
<span id="LC30" class="line" lang="java"><span class="cm">    * invoking operations on the resulting object. Finally, the to_any operation can be invoked</span></span>
<span id="LC31" class="line" lang="java"><span class="cm">    * to create an any value from the constructed DynAny.</span></span>
<span id="LC32" class="line" lang="java"><span class="cm">    */</span></span>
<span id="LC33" class="line" lang="java"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">_DynAnyFactoryStub</span> <span class="kd">extends</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">portable</span><span class="o">.</span><span class="na">ObjectImpl</span> <span class="kd">implements</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyFactory</span></span>
<span id="LC34" class="line" lang="java"><span class="o">{</span></span>
<span id="LC35" class="line" lang="java">  <span class="kd">final</span> <span class="kd">public</span> <span class="kd">static</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">Class</span> <span class="n">_opsClass</span> <span class="o">=</span> <span class="nc">DynAnyFactoryOperations</span><span class="o">.</span><span class="na">class</span><span class="o">;</span></span>
<span id="LC36" class="line" lang="java"></span>
<span id="LC37" class="line" lang="java"></span>
<span id="LC38" class="line" lang="java"></span>
<span id="LC39" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC40" class="line" lang="java"><span class="cm">          * Creates a new DynAny object from an any value.</span></span>
<span id="LC41" class="line" lang="java"><span class="cm">          * A copy of the TypeCode associated with the any value is assigned to the resulting DynAny object.</span></span>
<span id="LC42" class="line" lang="java"><span class="cm">          * The value associated with the DynAny object is a copy of the value in the original any.</span></span>
<span id="LC43" class="line" lang="java"><span class="cm">          * The current position of the created DynAny is set to zero if the passed value has components,</span></span>
<span id="LC44" class="line" lang="java"><span class="cm">          * to -1 otherwise</span></span>
<span id="LC45" class="line" lang="java"><span class="cm">          *</span></span>
<span id="LC46" class="line" lang="java"><span class="cm">          * @exception InconsistentTypeCode if value has a TypeCode with a TCKind of tk_Principal,</span></span>
<span id="LC47" class="line" lang="java"><span class="cm">          * tk_native, or tk_abstract_interface</span></span>
<span id="LC48" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC49" class="line" lang="java">  <span class="kd">public</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAny</span> <span class="nf">create_dyn_any</span> <span class="o">(</span><span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">Any</span> <span class="n">value</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyFactoryPackage</span><span class="o">.</span><span class="na">InconsistentTypeCode</span></span>
<span id="LC50" class="line" lang="java">  <span class="o">{</span></span>
<span id="LC51" class="line" lang="java">      <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">portable</span><span class="o">.</span><span class="na">ServantObject</span> <span class="n">$so</span> <span class="o">=</span> <span class="n">_servant_preinvoke</span> <span class="o">(</span><span class="s">"create_dyn_any"</span><span class="o">,</span> <span class="n">_opsClass</span><span class="o">);</span></span>
<span id="LC52" class="line" lang="java">      <span class="nc">DynAnyFactoryOperations</span>  <span class="n">$self</span> <span class="o">=</span> <span class="o">(</span><span class="nc">DynAnyFactoryOperations</span><span class="o">)</span> <span class="n">$so</span><span class="o">.</span><span class="na">servant</span><span class="o">;</span></span>
<span id="LC53" class="line" lang="java"></span>
<span id="LC54" class="line" lang="java">      <span class="k">try</span> <span class="o">{</span></span>
<span id="LC55" class="line" lang="java">         <span class="k">return</span> <span class="n">$self</span><span class="o">.</span><span class="na">create_dyn_any</span> <span class="o">(</span><span class="n">value</span><span class="o">);</span></span>
<span id="LC56" class="line" lang="java">      <span class="o">}</span> <span class="k">finally</span> <span class="o">{</span></span>
<span id="LC57" class="line" lang="java">          <span class="n">_servant_postinvoke</span> <span class="o">(</span><span class="n">$so</span><span class="o">);</span></span>
<span id="LC58" class="line" lang="java">      <span class="o">}</span></span>
<span id="LC59" class="line" lang="java">  <span class="o">}</span> <span class="c1">// create_dyn_any</span></span>
<span id="LC60" class="line" lang="java"></span>
<span id="LC61" class="line" lang="java"></span>
<span id="LC62" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC63" class="line" lang="java"><span class="cm">          * Creates a DynAny from a TypeCode. Depending on the TypeCode, the created object may be of type DynAny,</span></span>
<span id="LC64" class="line" lang="java"><span class="cm">          * or one of its derived types, such as DynStruct. The returned reference can be narrowed to the derived type.</span></span>
<span id="LC65" class="line" lang="java"><span class="cm">          * In all cases, a DynAny constructed from a TypeCode has an initial default value.</span></span>
<span id="LC66" class="line" lang="java"><span class="cm">          * The default values of basic types are:</span></span>
<span id="LC67" class="line" lang="java"><span class="cm">          * &lt;UL&gt;</span></span>
<span id="LC68" class="line" lang="java"><span class="cm">          * &lt;LI&gt;false for boolean</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">          * &lt;LI&gt;zero for numeric types</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">          * &lt;LI&gt;zero for types octet, char, and wchar</span></span>
<span id="LC71" class="line" lang="java"><span class="cm">          * &lt;LI&gt;the empty string for string and wstring</span></span>
<span id="LC72" class="line" lang="java"><span class="cm">          * &lt;LI&gt;null for object references</span></span>
<span id="LC73" class="line" lang="java"><span class="cm">          * &lt;LI&gt;a type code with a TCKind value of tk_null for type codes</span></span>
<span id="LC74" class="line" lang="java"><span class="cm">          * &lt;LI&gt;for any values, an any containing a type code with a TCKind value of tk_null type and no value</span></span>
<span id="LC75" class="line" lang="java"><span class="cm">          * &lt;/UL&gt;</span></span>
<span id="LC76" class="line" lang="java"><span class="cm">          * For complex types, creation of the corresponding DynAny assigns a default value as follows:</span></span>
<span id="LC77" class="line" lang="java"><span class="cm">          * &lt;UL&gt;</span></span>
<span id="LC78" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynSequence it sets the current position to -1 and creates an empty sequence.</span></span>
<span id="LC79" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynEnum it sets the current position to -1 and sets the value of the enumerator</span></span>
<span id="LC80" class="line" lang="java"><span class="cm">          *     to the first enumerator value indicated by the TypeCode.</span></span>
<span id="LC81" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynFixed it sets the current position to -1 and sets the value zero.</span></span>
<span id="LC82" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynStruct it sets the current position to -1 for empty exceptions</span></span>
<span id="LC83" class="line" lang="java"><span class="cm">          *     and to zero for all other TypeCodes. The members (if any) are (recursively) initialized</span></span>
<span id="LC84" class="line" lang="java"><span class="cm">          *     to their default values.</span></span>
<span id="LC85" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynArray sets the current position to zero and (recursively) initializes elements</span></span>
<span id="LC86" class="line" lang="java"><span class="cm">          *     to their default value.</span></span>
<span id="LC87" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynUnion sets the current position to zero. The discriminator value is set</span></span>
<span id="LC88" class="line" lang="java"><span class="cm">          *     to a value consistent with the first named member of the union. That member is activated and (recursively)</span></span>
<span id="LC89" class="line" lang="java"><span class="cm">          *     initialized to its default value.</span></span>
<span id="LC90" class="line" lang="java"><span class="cm">          * &lt;LI&gt;For DynValue and DynValueBox it initializes to a null value.</span></span>
<span id="LC91" class="line" lang="java"><span class="cm">          * &lt;/UL&gt;</span></span>
<span id="LC92" class="line" lang="java"><span class="cm">          */</span></span>
<span id="LC93" class="line" lang="java">  <span class="kd">public</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAny</span> <span class="nf">create_dyn_any_from_type_code</span> <span class="o">(</span><span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">TypeCode</span> <span class="n">type</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">DynamicAny</span><span class="o">.</span><span class="na">DynAnyFactoryPackage</span><span class="o">.</span><span class="na">InconsistentTypeCode</span></span>
<span id="LC94" class="line" lang="java">  <span class="o">{</span></span>
<span id="LC95" class="line" lang="java">      <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">portable</span><span class="o">.</span><span class="na">ServantObject</span> <span class="n">$so</span> <span class="o">=</span> <span class="n">_servant_preinvoke</span> <span class="o">(</span><span class="s">"create_dyn_any_from_type_code"</span><span class="o">,</span> <span class="n">_opsClass</span><span class="o">);</span></span>
<span id="LC96" class="line" lang="java">      <span class="nc">DynAnyFactoryOperations</span>  <span class="n">$self</span> <span class="o">=</span> <span class="o">(</span><span class="nc">DynAnyFactoryOperations</span><span class="o">)</span> <span class="n">$so</span><span class="o">.</span><span class="na">servant</span><span class="o">;</span></span>
<span id="LC97" class="line" lang="java"></span>
<span id="LC98" class="line" lang="java">      <span class="k">try</span> <span class="o">{</span></span>
<span id="LC99" class="line" lang="java">         <span class="k">return</span> <span class="n">$self</span><span class="o">.</span><span class="na">create_dyn_any_from_type_code</span> <span class="o">(</span><span class="n">type</span><span class="o">);</span></span>
<span id="LC100" class="line" lang="java">      <span class="o">}</span> <span class="k">finally</span> <span class="o">{</span></span>
<span id="LC101" class="line" lang="java">          <span class="n">_servant_postinvoke</span> <span class="o">(</span><span class="n">$so</span><span class="o">);</span></span>
<span id="LC102" class="line" lang="java">      <span class="o">}</span></span>
<span id="LC103" class="line" lang="java">  <span class="o">}</span> <span class="c1">// create_dyn_any_from_type_code</span></span>
<span id="LC104" class="line" lang="java"></span>
<span id="LC105" class="line" lang="java">  <span class="c1">// Type-specific CORBA::Object operations</span></span>
<span id="LC106" class="line" lang="java">  <span class="kd">private</span> <span class="kd">static</span> <span class="nc">String</span><span class="o">[]</span> <span class="n">__ids</span> <span class="o">=</span> <span class="o">{</span></span>
<span id="LC107" class="line" lang="java">    <span class="s">"IDL:omg.org/DynamicAny/DynAnyFactory:1.0"</span><span class="o">};</span></span>
<span id="LC108" class="line" lang="java"></span>
<span id="LC109" class="line" lang="java">  <span class="kd">public</span> <span class="nc">String</span><span class="o">[]</span> <span class="nf">_ids</span> <span class="o">()</span></span>
<span id="LC110" class="line" lang="java">  <span class="o">{</span></span>
<span id="LC111" class="line" lang="java">    <span class="k">return</span> <span class="o">(</span><span class="nc">String</span><span class="o">[])</span><span class="n">__ids</span><span class="o">.</span><span class="na">clone</span> <span class="o">();</span></span>
<span id="LC112" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC113" class="line" lang="java"></span>
<span id="LC114" class="line" lang="java">  <span class="kd">private</span> <span class="kt">void</span> <span class="nf">readObject</span> <span class="o">(</span><span class="n">java</span><span class="o">.</span><span class="na">io</span><span class="o">.</span><span class="na">ObjectInputStream</span> <span class="n">s</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">io</span><span class="o">.</span><span class="na">IOException</span></span>
<span id="LC115" class="line" lang="java">  <span class="o">{</span></span>
<span id="LC116" class="line" lang="java">     <span class="nc">String</span> <span class="n">str</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">readUTF</span> <span class="o">();</span></span>
<span id="LC117" class="line" lang="java">     <span class="nc">String</span><span class="o">[]</span> <span class="n">args</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC118" class="line" lang="java">     <span class="n">java</span><span class="o">.</span><span class="na">util</span><span class="o">.</span><span class="na">Properties</span> <span class="n">props</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC119" class="line" lang="java">     <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">ORB</span> <span class="n">orb</span> <span class="o">=</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">ORB</span><span class="o">.</span><span class="na">init</span> <span class="o">(</span><span class="n">args</span><span class="o">,</span> <span class="n">props</span><span class="o">);</span></span>
<span id="LC120" class="line" lang="java">   <span class="k">try</span> <span class="o">{</span></span>
<span id="LC121" class="line" lang="java">     <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">Object</span> <span class="n">obj</span> <span class="o">=</span> <span class="n">orb</span><span class="o">.</span><span class="na">string_to_object</span> <span class="o">(</span><span class="n">str</span><span class="o">);</span></span>
<span id="LC122" class="line" lang="java">     <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">portable</span><span class="o">.</span><span class="na">Delegate</span> <span class="n">delegate</span> <span class="o">=</span> <span class="o">((</span><span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">portable</span><span class="o">.</span><span class="na">ObjectImpl</span><span class="o">)</span> <span class="n">obj</span><span class="o">).</span><span class="na">_get_delegate</span> <span class="o">();</span></span>
<span id="LC123" class="line" lang="java">     <span class="n">_set_delegate</span> <span class="o">(</span><span class="n">delegate</span><span class="o">);</span></span>
<span id="LC124" class="line" lang="java">   <span class="o">}</span> <span class="k">finally</span> <span class="o">{</span></span>
<span id="LC125" class="line" lang="java">     <span class="n">orb</span><span class="o">.</span><span class="na">destroy</span><span class="o">()</span> <span class="o">;</span></span>
<span id="LC126" class="line" lang="java">   <span class="o">}</span></span>
<span id="LC127" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC128" class="line" lang="java"></span>
<span id="LC129" class="line" lang="java">  <span class="kd">private</span> <span class="kt">void</span> <span class="nf">writeObject</span> <span class="o">(</span><span class="n">java</span><span class="o">.</span><span class="na">io</span><span class="o">.</span><span class="na">ObjectOutputStream</span> <span class="n">s</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">java</span><span class="o">.</span><span class="na">io</span><span class="o">.</span><span class="na">IOException</span></span>
<span id="LC130" class="line" lang="java">  <span class="o">{</span></span>
<span id="LC131" class="line" lang="java">     <span class="nc">String</span><span class="o">[]</span> <span class="n">args</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC132" class="line" lang="java">     <span class="n">java</span><span class="o">.</span><span class="na">util</span><span class="o">.</span><span class="na">Properties</span> <span class="n">props</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC133" class="line" lang="java">     <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">ORB</span> <span class="n">orb</span> <span class="o">=</span> <span class="n">org</span><span class="o">.</span><span class="na">omg</span><span class="o">.</span><span class="na">CORBA</span><span class="o">.</span><span class="na">ORB</span><span class="o">.</span><span class="na">init</span> <span class="o">(</span><span class="n">args</span><span class="o">,</span> <span class="n">props</span><span class="o">);</span></span>
<span id="LC134" class="line" lang="java">   <span class="k">try</span> <span class="o">{</span></span>
<span id="LC135" class="line" lang="java">     <span class="nc">String</span> <span class="n">str</span> <span class="o">=</span> <span class="n">orb</span><span class="o">.</span><span class="na">object_to_string</span> <span class="o">(</span><span class="k">this</span><span class="o">);</span></span>
<span id="LC136" class="line" lang="java">     <span class="n">s</span><span class="o">.</span><span class="na">writeUTF</span> <span class="o">(</span><span class="n">str</span><span class="o">);</span></span>
<span id="LC137" class="line" lang="java">   <span class="o">}</span> <span class="k">finally</span> <span class="o">{</span></span>
<span id="LC138" class="line" lang="java">     <span class="n">orb</span><span class="o">.</span><span class="na">destroy</span><span class="o">()</span> <span class="o">;</span></span>
<span id="LC139" class="line" lang="java">   <span class="o">}</span></span>
<span id="LC140" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC141" class="line" lang="java"><span class="o">}</span> <span class="c1">// class _DynAnyFactoryStub</span></span>