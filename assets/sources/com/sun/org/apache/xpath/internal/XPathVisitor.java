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
<a class="file-line-num diff-line-num" data-line-number="142" href="#L142" id="L142">
142
</a>
<a class="file-line-num diff-line-num" data-line-number="143" href="#L143" id="L143">
143
</a>
<a class="file-line-num diff-line-num" data-line-number="144" href="#L144" id="L144">
144
</a>
<a class="file-line-num diff-line-num" data-line-number="145" href="#L145" id="L145">
145
</a>
<a class="file-line-num diff-line-num" data-line-number="146" href="#L146" id="L146">
146
</a>
<a class="file-line-num diff-line-num" data-line-number="147" href="#L147" id="L147">
147
</a>
<a class="file-line-num diff-line-num" data-line-number="148" href="#L148" id="L148">
148
</a>
<a class="file-line-num diff-line-num" data-line-number="149" href="#L149" id="L149">
149
</a>
<a class="file-line-num diff-line-num" data-line-number="150" href="#L150" id="L150">
150
</a>
<a class="file-line-num diff-line-num" data-line-number="151" href="#L151" id="L151">
151
</a>
<a class="file-line-num diff-line-num" data-line-number="152" href="#L152" id="L152">
152
</a>
<a class="file-line-num diff-line-num" data-line-number="153" href="#L153" id="L153">
153
</a>
<a class="file-line-num diff-line-num" data-line-number="154" href="#L154" id="L154">
154
</a>
<a class="file-line-num diff-line-num" data-line-number="155" href="#L155" id="L155">
155
</a>
<a class="file-line-num diff-line-num" data-line-number="156" href="#L156" id="L156">
156
</a>
<a class="file-line-num diff-line-num" data-line-number="157" href="#L157" id="L157">
157
</a>
<a class="file-line-num diff-line-num" data-line-number="158" href="#L158" id="L158">
158
</a>
<a class="file-line-num diff-line-num" data-line-number="159" href="#L159" id="L159">
159
</a>
<a class="file-line-num diff-line-num" data-line-number="160" href="#L160" id="L160">
160
</a>
<a class="file-line-num diff-line-num" data-line-number="161" href="#L161" id="L161">
161
</a>
<a class="file-line-num diff-line-num" data-line-number="162" href="#L162" id="L162">
162
</a>
<a class="file-line-num diff-line-num" data-line-number="163" href="#L163" id="L163">
163
</a>
<a class="file-line-num diff-line-num" data-line-number="164" href="#L164" id="L164">
164
</a>
<a class="file-line-num diff-line-num" data-line-number="165" href="#L165" id="L165">
165
</a>
<a class="file-line-num diff-line-num" data-line-number="166" href="#L166" id="L166">
166
</a>
<a class="file-line-num diff-line-num" data-line-number="167" href="#L167" id="L167">
167
</a>
<a class="file-line-num diff-line-num" data-line-number="168" href="#L168" id="L168">
168
</a>
<a class="file-line-num diff-line-num" data-line-number="169" href="#L169" id="L169">
169
</a>
<a class="file-line-num diff-line-num" data-line-number="170" href="#L170" id="L170">
170
</a>
<a class="file-line-num diff-line-num" data-line-number="171" href="#L171" id="L171">
171
</a>
<a class="file-line-num diff-line-num" data-line-number="172" href="#L172" id="L172">
172
</a>
<a class="file-line-num diff-line-num" data-line-number="173" href="#L173" id="L173">
173
</a>
<a class="file-line-num diff-line-num" data-line-number="174" href="#L174" id="L174">
174
</a>
<a class="file-line-num diff-line-num" data-line-number="175" href="#L175" id="L175">
175
</a>
<a class="file-line-num diff-line-num" data-line-number="176" href="#L176" id="L176">
176
</a>
<a class="file-line-num diff-line-num" data-line-number="177" href="#L177" id="L177">
177
</a>
<a class="file-line-num diff-line-num" data-line-number="178" href="#L178" id="L178">
178
</a>
<a class="file-line-num diff-line-num" data-line-number="179" href="#L179" id="L179">
179
</a>
<a class="file-line-num diff-line-num" data-line-number="180" href="#L180" id="L180">
180
</a>
<a class="file-line-num diff-line-num" data-line-number="181" href="#L181" id="L181">
181
</a>
<a class="file-line-num diff-line-num" data-line-number="182" href="#L182" id="L182">
182
</a>
<a class="file-line-num diff-line-num" data-line-number="183" href="#L183" id="L183">
183
</a>
<a class="file-line-num diff-line-num" data-line-number="184" href="#L184" id="L184">
184
</a>
<a class="file-line-num diff-line-num" data-line-number="185" href="#L185" id="L185">
185
</a>
<a class="file-line-num diff-line-num" data-line-number="186" href="#L186" id="L186">
186
</a>
<a class="file-line-num diff-line-num" data-line-number="187" href="#L187" id="L187">
187
</a>
<a class="file-line-num diff-line-num" data-line-number="188" href="#L188" id="L188">
188
</a>
<a class="file-line-num diff-line-num" data-line-number="189" href="#L189" id="L189">
189
</a>
<a class="file-line-num diff-line-num" data-line-number="190" href="#L190" id="L190">
190
</a>
<a class="file-line-num diff-line-num" data-line-number="191" href="#L191" id="L191">
191
</a>
<a class="file-line-num diff-line-num" data-line-number="192" href="#L192" id="L192">
192
</a>
<a class="file-line-num diff-line-num" data-line-number="193" href="#L193" id="L193">
193
</a>
<a class="file-line-num diff-line-num" data-line-number="194" href="#L194" id="L194">
194
</a>
<a class="file-line-num diff-line-num" data-line-number="195" href="#L195" id="L195">
195
</a>
<a class="file-line-num diff-line-num" data-line-number="196" href="#L196" id="L196">
196
</a>
<a class="file-line-num diff-line-num" data-line-number="197" href="#L197" id="L197">
197
</a>
<a class="file-line-num diff-line-num" data-line-number="198" href="#L198" id="L198">
198
</a>
<a class="file-line-num diff-line-num" data-line-number="199" href="#L199" id="L199">
199
</a>
<a class="file-line-num diff-line-num" data-line-number="200" href="#L200" id="L200">
200
</a>
<a class="file-line-num diff-line-num" data-line-number="201" href="#L201" id="L201">
201
</a>
<a class="file-line-num diff-line-num" data-line-number="202" href="#L202" id="L202">
202
</a>
<a class="file-line-num diff-line-num" data-line-number="203" href="#L203" id="L203">
203
</a>
<a class="file-line-num diff-line-num" data-line-number="204" href="#L204" id="L204">
204
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2007, 2018, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC5" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> * Copyright 2002-2004 The Apache Software Foundation.</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> * Licensed under the Apache License, Version 2.0 (the "License");</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> * you may not use this file except in compliance with the License.</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> * You may obtain a copy of the License at</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *     http://www.apache.org/licenses/LICENSE-2.0</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> * distributed under the License is distributed on an "AS IS" BASIS,</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> * See the License for the specific language governing permissions and</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> * limitations under the License.</span></span>
<span id="LC19" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC20" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> * $Id: XPathVisitor.java,v 1.1.2.1 2005/08/01 01:30:11 jeffsuttor Exp $</span></span>
<span id="LC22" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC23" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.org.apache.xpath.internal</span><span class="o">;</span></span>
<span id="LC24" class="line" lang="java"></span>
<span id="LC25" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.axes.LocPathIterator</span><span class="o">;</span></span>
<span id="LC26" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.axes.UnionPathIterator</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.functions.Function</span><span class="o">;</span></span>
<span id="LC28" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.objects.XNumber</span><span class="o">;</span></span>
<span id="LC29" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.objects.XString</span><span class="o">;</span></span>
<span id="LC30" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.operations.Operation</span><span class="o">;</span></span>
<span id="LC31" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.operations.UnaryOperation</span><span class="o">;</span></span>
<span id="LC32" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.operations.Variable</span><span class="o">;</span></span>
<span id="LC33" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.patterns.NodeTest</span><span class="o">;</span></span>
<span id="LC34" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.patterns.StepPattern</span><span class="o">;</span></span>
<span id="LC35" class="line" lang="java"><span class="kn">import</span> <span class="nn">com.sun.org.apache.xpath.internal.patterns.UnionPattern</span><span class="o">;</span></span>
<span id="LC36" class="line" lang="java"></span>
<span id="LC37" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * A derivation from this class can be passed to a class that implements</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> * the XPathVisitable interface, to have the appropriate method called</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * for each component of the XPath.  Aside from possible other uses, the</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * main intention is to provide a reasonable means to perform expression</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> * rewriting.</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> * &lt;p&gt;Each method has the form</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * &lt;code&gt;boolean visitComponentType(ExpressionOwner owner, ComponentType compType)&lt;/code&gt;.</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> * The ExpressionOwner argument is the owner of the component, and can</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> * be used to reset the expression for rewriting.  If a method returns</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * false, the sub hierarchy will not be traversed.&lt;/p&gt;</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * &lt;p&gt;This class is meant to be a base class that will be derived by concrete classes,</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * and doesn't much except return true for each method.&lt;/p&gt;</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC53" class="line" lang="java"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">XPathVisitor</span></span>
<span id="LC54" class="line" lang="java"><span class="o">{</span></span>
<span id="LC55" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC56" class="line" lang="java"><span class="cm">         * Visit a LocationPath.</span></span>
<span id="LC57" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC58" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC59" class="line" lang="java"><span class="cm">         * @param path The LocationPath object.</span></span>
<span id="LC60" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC61" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC62" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitLocationPath</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">LocPathIterator</span> <span class="n">path</span><span class="o">)</span></span>
<span id="LC63" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC64" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC65" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC66" class="line" lang="java"></span>
<span id="LC67" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC68" class="line" lang="java"><span class="cm">         * Visit a UnionPath.</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC71" class="line" lang="java"><span class="cm">         * @param path The UnionPath object.</span></span>
<span id="LC72" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC73" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC74" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitUnionPath</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">UnionPathIterator</span> <span class="n">path</span><span class="o">)</span></span>
<span id="LC75" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC76" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC77" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC78" class="line" lang="java"></span>
<span id="LC79" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC80" class="line" lang="java"><span class="cm">         * Visit a step within a location path.</span></span>
<span id="LC81" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC82" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC83" class="line" lang="java"><span class="cm">         * @param step The Step object.</span></span>
<span id="LC84" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC85" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC86" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitStep</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">NodeTest</span> <span class="n">step</span><span class="o">)</span></span>
<span id="LC87" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC88" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC89" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC90" class="line" lang="java"></span>
<span id="LC91" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC92" class="line" lang="java"><span class="cm">         * Visit a predicate within a location path.  Note that there isn't a</span></span>
<span id="LC93" class="line" lang="java"><span class="cm">         * proper unique component for predicates, and that the expression will</span></span>
<span id="LC94" class="line" lang="java"><span class="cm">         * be called also for whatever type Expression is.</span></span>
<span id="LC95" class="line" lang="java"><span class="cm">         *</span></span>
<span id="LC96" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC97" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC98" class="line" lang="java"><span class="cm">         * @param pred The predicate object.</span></span>
<span id="LC99" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC100" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC101" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitPredicate</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">Expression</span> <span class="n">pred</span><span class="o">)</span></span>
<span id="LC102" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC103" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC104" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC105" class="line" lang="java"></span>
<span id="LC106" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC107" class="line" lang="java"><span class="cm">         * Visit a binary operation.</span></span>
<span id="LC108" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC109" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC110" class="line" lang="java"><span class="cm">         * @param op The operation object.</span></span>
<span id="LC111" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC112" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC113" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitBinaryOperation</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">Operation</span> <span class="n">op</span><span class="o">)</span></span>
<span id="LC114" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC115" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC116" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC117" class="line" lang="java"></span>
<span id="LC118" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC119" class="line" lang="java"><span class="cm">         * Visit a unary operation.</span></span>
<span id="LC120" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC121" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC122" class="line" lang="java"><span class="cm">         * @param op The operation object.</span></span>
<span id="LC123" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC124" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC125" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitUnaryOperation</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">UnaryOperation</span> <span class="n">op</span><span class="o">)</span></span>
<span id="LC126" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC127" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC128" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC129" class="line" lang="java"></span>
<span id="LC130" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC131" class="line" lang="java"><span class="cm">         * Visit a variable reference.</span></span>
<span id="LC132" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC133" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC134" class="line" lang="java"><span class="cm">         * @param var The variable reference object.</span></span>
<span id="LC135" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC136" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC137" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitVariableRef</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">Variable</span> <span class="kt">var</span><span class="o">)</span></span>
<span id="LC138" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC139" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC140" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC141" class="line" lang="java"></span>
<span id="LC142" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC143" class="line" lang="java"><span class="cm">         * Visit a function.</span></span>
<span id="LC144" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC145" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC146" class="line" lang="java"><span class="cm">         * @param func The function reference object.</span></span>
<span id="LC147" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC148" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC149" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitFunction</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">Function</span> <span class="n">func</span><span class="o">)</span></span>
<span id="LC150" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC151" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC152" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC153" class="line" lang="java"></span>
<span id="LC154" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC155" class="line" lang="java"><span class="cm">         * Visit a match pattern.</span></span>
<span id="LC156" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC157" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC158" class="line" lang="java"><span class="cm">         * @param pattern The match pattern object.</span></span>
<span id="LC159" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC160" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC161" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitMatchPattern</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">StepPattern</span> <span class="n">pattern</span><span class="o">)</span></span>
<span id="LC162" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC163" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC164" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC165" class="line" lang="java"></span>
<span id="LC166" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC167" class="line" lang="java"><span class="cm">         * Visit a union pattern.</span></span>
<span id="LC168" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC169" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC170" class="line" lang="java"><span class="cm">         * @param pattern The union pattern object.</span></span>
<span id="LC171" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC172" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC173" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitUnionPattern</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">UnionPattern</span> <span class="n">pattern</span><span class="o">)</span></span>
<span id="LC174" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC175" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC176" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC177" class="line" lang="java"></span>
<span id="LC178" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC179" class="line" lang="java"><span class="cm">         * Visit a string literal.</span></span>
<span id="LC180" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC181" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC182" class="line" lang="java"><span class="cm">         * @param str The string literal object.</span></span>
<span id="LC183" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC184" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC185" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitStringLiteral</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">XString</span> <span class="n">str</span><span class="o">)</span></span>
<span id="LC186" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC187" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC188" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC189" class="line" lang="java"></span>
<span id="LC190" class="line" lang="java"></span>
<span id="LC191" class="line" lang="java">        <span class="cm">/**</span></span>
<span id="LC192" class="line" lang="java"><span class="cm">         * Visit a number literal.</span></span>
<span id="LC193" class="line" lang="java"><span class="cm">         * @param owner The owner of the expression, to which the expression can</span></span>
<span id="LC194" class="line" lang="java"><span class="cm">         *              be reset if rewriting takes place.</span></span>
<span id="LC195" class="line" lang="java"><span class="cm">         * @param num The number literal object.</span></span>
<span id="LC196" class="line" lang="java"><span class="cm">         * @return true if the sub expressions should be traversed.</span></span>
<span id="LC197" class="line" lang="java"><span class="cm">         */</span></span>
<span id="LC198" class="line" lang="java">        <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">visitNumberLiteral</span><span class="o">(</span><span class="nc">ExpressionOwner</span> <span class="n">owner</span><span class="o">,</span> <span class="nc">XNumber</span> <span class="n">num</span><span class="o">)</span></span>
<span id="LC199" class="line" lang="java">        <span class="o">{</span></span>
<span id="LC200" class="line" lang="java">                <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC201" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC202" class="line" lang="java"></span>
<span id="LC203" class="line" lang="java"></span>
<span id="LC204" class="line" lang="java"><span class="o">}</span></span>
