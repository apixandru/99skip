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
<a class="file-line-num diff-line-num" data-line-number="205" href="#L205" id="L205">
205
</a>
<a class="file-line-num diff-line-num" data-line-number="206" href="#L206" id="L206">
206
</a>
<a class="file-line-num diff-line-num" data-line-number="207" href="#L207" id="L207">
207
</a>
<a class="file-line-num diff-line-num" data-line-number="208" href="#L208" id="L208">
208
</a>
<a class="file-line-num diff-line-num" data-line-number="209" href="#L209" id="L209">
209
</a>
<a class="file-line-num diff-line-num" data-line-number="210" href="#L210" id="L210">
210
</a>
<a class="file-line-num diff-line-num" data-line-number="211" href="#L211" id="L211">
211
</a>
<a class="file-line-num diff-line-num" data-line-number="212" href="#L212" id="L212">
212
</a>
<a class="file-line-num diff-line-num" data-line-number="213" href="#L213" id="L213">
213
</a>
<a class="file-line-num diff-line-num" data-line-number="214" href="#L214" id="L214">
214
</a>
<a class="file-line-num diff-line-num" data-line-number="215" href="#L215" id="L215">
215
</a>
<a class="file-line-num diff-line-num" data-line-number="216" href="#L216" id="L216">
216
</a>
<a class="file-line-num diff-line-num" data-line-number="217" href="#L217" id="L217">
217
</a>
<a class="file-line-num diff-line-num" data-line-number="218" href="#L218" id="L218">
218
</a>
<a class="file-line-num diff-line-num" data-line-number="219" href="#L219" id="L219">
219
</a>
<a class="file-line-num diff-line-num" data-line-number="220" href="#L220" id="L220">
220
</a>
<a class="file-line-num diff-line-num" data-line-number="221" href="#L221" id="L221">
221
</a>
<a class="file-line-num diff-line-num" data-line-number="222" href="#L222" id="L222">
222
</a>
<a class="file-line-num diff-line-num" data-line-number="223" href="#L223" id="L223">
223
</a>
<a class="file-line-num diff-line-num" data-line-number="224" href="#L224" id="L224">
224
</a>
<a class="file-line-num diff-line-num" data-line-number="225" href="#L225" id="L225">
225
</a>
<a class="file-line-num diff-line-num" data-line-number="226" href="#L226" id="L226">
226
</a>
<a class="file-line-num diff-line-num" data-line-number="227" href="#L227" id="L227">
227
</a>
<a class="file-line-num diff-line-num" data-line-number="228" href="#L228" id="L228">
228
</a>
<a class="file-line-num diff-line-num" data-line-number="229" href="#L229" id="L229">
229
</a>
<a class="file-line-num diff-line-num" data-line-number="230" href="#L230" id="L230">
230
</a>
<a class="file-line-num diff-line-num" data-line-number="231" href="#L231" id="L231">
231
</a>
<a class="file-line-num diff-line-num" data-line-number="232" href="#L232" id="L232">
232
</a>
<a class="file-line-num diff-line-num" data-line-number="233" href="#L233" id="L233">
233
</a>
<a class="file-line-num diff-line-num" data-line-number="234" href="#L234" id="L234">
234
</a>
<a class="file-line-num diff-line-num" data-line-number="235" href="#L235" id="L235">
235
</a>
<a class="file-line-num diff-line-num" data-line-number="236" href="#L236" id="L236">
236
</a>
<a class="file-line-num diff-line-num" data-line-number="237" href="#L237" id="L237">
237
</a>
<a class="file-line-num diff-line-num" data-line-number="238" href="#L238" id="L238">
238
</a>
<a class="file-line-num diff-line-num" data-line-number="239" href="#L239" id="L239">
239
</a>
<a class="file-line-num diff-line-num" data-line-number="240" href="#L240" id="L240">
240
</a>
<a class="file-line-num diff-line-num" data-line-number="241" href="#L241" id="L241">
241
</a>
<a class="file-line-num diff-line-num" data-line-number="242" href="#L242" id="L242">
242
</a>
<a class="file-line-num diff-line-num" data-line-number="243" href="#L243" id="L243">
243
</a>
<a class="file-line-num diff-line-num" data-line-number="244" href="#L244" id="L244">
244
</a>
<a class="file-line-num diff-line-num" data-line-number="245" href="#L245" id="L245">
245
</a>
<a class="file-line-num diff-line-num" data-line-number="246" href="#L246" id="L246">
246
</a>
<a class="file-line-num diff-line-num" data-line-number="247" href="#L247" id="L247">
247
</a>
<a class="file-line-num diff-line-num" data-line-number="248" href="#L248" id="L248">
248
</a>
<a class="file-line-num diff-line-num" data-line-number="249" href="#L249" id="L249">
249
</a>
<a class="file-line-num diff-line-num" data-line-number="250" href="#L250" id="L250">
250
</a>
<a class="file-line-num diff-line-num" data-line-number="251" href="#L251" id="L251">
251
</a>
<a class="file-line-num diff-line-num" data-line-number="252" href="#L252" id="L252">
252
</a>
<a class="file-line-num diff-line-num" data-line-number="253" href="#L253" id="L253">
253
</a>
<a class="file-line-num diff-line-num" data-line-number="254" href="#L254" id="L254">
254
</a>
<a class="file-line-num diff-line-num" data-line-number="255" href="#L255" id="L255">
255
</a>
<a class="file-line-num diff-line-num" data-line-number="256" href="#L256" id="L256">
256
</a>
<a class="file-line-num diff-line-num" data-line-number="257" href="#L257" id="L257">
257
</a>
<a class="file-line-num diff-line-num" data-line-number="258" href="#L258" id="L258">
258
</a>
<a class="file-line-num diff-line-num" data-line-number="259" href="#L259" id="L259">
259
</a>
<a class="file-line-num diff-line-num" data-line-number="260" href="#L260" id="L260">
260
</a>
<a class="file-line-num diff-line-num" data-line-number="261" href="#L261" id="L261">
261
</a>
<a class="file-line-num diff-line-num" data-line-number="262" href="#L262" id="L262">
262
</a>
<a class="file-line-num diff-line-num" data-line-number="263" href="#L263" id="L263">
263
</a>
<a class="file-line-num diff-line-num" data-line-number="264" href="#L264" id="L264">
264
</a>
<a class="file-line-num diff-line-num" data-line-number="265" href="#L265" id="L265">
265
</a>
<a class="file-line-num diff-line-num" data-line-number="266" href="#L266" id="L266">
266
</a>
<a class="file-line-num diff-line-num" data-line-number="267" href="#L267" id="L267">
267
</a>
<a class="file-line-num diff-line-num" data-line-number="268" href="#L268" id="L268">
268
</a>
<a class="file-line-num diff-line-num" data-line-number="269" href="#L269" id="L269">
269
</a>
<a class="file-line-num diff-line-num" data-line-number="270" href="#L270" id="L270">
270
</a>
<a class="file-line-num diff-line-num" data-line-number="271" href="#L271" id="L271">
271
</a>
<a class="file-line-num diff-line-num" data-line-number="272" href="#L272" id="L272">
272
</a>
<a class="file-line-num diff-line-num" data-line-number="273" href="#L273" id="L273">
273
</a>
<a class="file-line-num diff-line-num" data-line-number="274" href="#L274" id="L274">
274
</a>
<a class="file-line-num diff-line-num" data-line-number="275" href="#L275" id="L275">
275
</a>
<a class="file-line-num diff-line-num" data-line-number="276" href="#L276" id="L276">
276
</a>
<a class="file-line-num diff-line-num" data-line-number="277" href="#L277" id="L277">
277
</a>
<a class="file-line-num diff-line-num" data-line-number="278" href="#L278" id="L278">
278
</a>
<a class="file-line-num diff-line-num" data-line-number="279" href="#L279" id="L279">
279
</a>
<a class="file-line-num diff-line-num" data-line-number="280" href="#L280" id="L280">
280
</a>
<a class="file-line-num diff-line-num" data-line-number="281" href="#L281" id="L281">
281
</a>
<a class="file-line-num diff-line-num" data-line-number="282" href="#L282" id="L282">
282
</a>
<a class="file-line-num diff-line-num" data-line-number="283" href="#L283" id="L283">
283
</a>
<a class="file-line-num diff-line-num" data-line-number="284" href="#L284" id="L284">
284
</a>
<a class="file-line-num diff-line-num" data-line-number="285" href="#L285" id="L285">
285
</a>
<a class="file-line-num diff-line-num" data-line-number="286" href="#L286" id="L286">
286
</a>
<a class="file-line-num diff-line-num" data-line-number="287" href="#L287" id="L287">
287
</a>
<a class="file-line-num diff-line-num" data-line-number="288" href="#L288" id="L288">
288
</a>
<a class="file-line-num diff-line-num" data-line-number="289" href="#L289" id="L289">
289
</a>
<a class="file-line-num diff-line-num" data-line-number="290" href="#L290" id="L290">
290
</a>
<a class="file-line-num diff-line-num" data-line-number="291" href="#L291" id="L291">
291
</a>
<a class="file-line-num diff-line-num" data-line-number="292" href="#L292" id="L292">
292
</a>
<a class="file-line-num diff-line-num" data-line-number="293" href="#L293" id="L293">
293
</a>
<a class="file-line-num diff-line-num" data-line-number="294" href="#L294" id="L294">
294
</a>
<a class="file-line-num diff-line-num" data-line-number="295" href="#L295" id="L295">
295
</a>
<a class="file-line-num diff-line-num" data-line-number="296" href="#L296" id="L296">
296
</a>
<a class="file-line-num diff-line-num" data-line-number="297" href="#L297" id="L297">
297
</a>
<a class="file-line-num diff-line-num" data-line-number="298" href="#L298" id="L298">
298
</a>
<a class="file-line-num diff-line-num" data-line-number="299" href="#L299" id="L299">
299
</a>
<a class="file-line-num diff-line-num" data-line-number="300" href="#L300" id="L300">
300
</a>
<a class="file-line-num diff-line-num" data-line-number="301" href="#L301" id="L301">
301
</a>
<a class="file-line-num diff-line-num" data-line-number="302" href="#L302" id="L302">
302
</a>
<a class="file-line-num diff-line-num" data-line-number="303" href="#L303" id="L303">
303
</a>
<a class="file-line-num diff-line-num" data-line-number="304" href="#L304" id="L304">
304
</a>
<a class="file-line-num diff-line-num" data-line-number="305" href="#L305" id="L305">
305
</a>
<a class="file-line-num diff-line-num" data-line-number="306" href="#L306" id="L306">
306
</a>
<a class="file-line-num diff-line-num" data-line-number="307" href="#L307" id="L307">
307
</a>
<a class="file-line-num diff-line-num" data-line-number="308" href="#L308" id="L308">
308
</a>
<a class="file-line-num diff-line-num" data-line-number="309" href="#L309" id="L309">
309
</a>
<a class="file-line-num diff-line-num" data-line-number="310" href="#L310" id="L310">
310
</a>
<a class="file-line-num diff-line-num" data-line-number="311" href="#L311" id="L311">
311
</a>
<a class="file-line-num diff-line-num" data-line-number="312" href="#L312" id="L312">
312
</a>
<a class="file-line-num diff-line-num" data-line-number="313" href="#L313" id="L313">
313
</a>
<a class="file-line-num diff-line-num" data-line-number="314" href="#L314" id="L314">
314
</a>
<a class="file-line-num diff-line-num" data-line-number="315" href="#L315" id="L315">
315
</a>
<a class="file-line-num diff-line-num" data-line-number="316" href="#L316" id="L316">
316
</a>
<a class="file-line-num diff-line-num" data-line-number="317" href="#L317" id="L317">
317
</a>
<a class="file-line-num diff-line-num" data-line-number="318" href="#L318" id="L318">
318
</a>
<a class="file-line-num diff-line-num" data-line-number="319" href="#L319" id="L319">
319
</a>
<a class="file-line-num diff-line-num" data-line-number="320" href="#L320" id="L320">
320
</a>
<a class="file-line-num diff-line-num" data-line-number="321" href="#L321" id="L321">
321
</a>
<a class="file-line-num diff-line-num" data-line-number="322" href="#L322" id="L322">
322
</a>
<a class="file-line-num diff-line-num" data-line-number="323" href="#L323" id="L323">
323
</a>
<a class="file-line-num diff-line-num" data-line-number="324" href="#L324" id="L324">
324
</a>
<a class="file-line-num diff-line-num" data-line-number="325" href="#L325" id="L325">
325
</a>
<a class="file-line-num diff-line-num" data-line-number="326" href="#L326" id="L326">
326
</a>
<a class="file-line-num diff-line-num" data-line-number="327" href="#L327" id="L327">
327
</a>
<a class="file-line-num diff-line-num" data-line-number="328" href="#L328" id="L328">
328
</a>
<a class="file-line-num diff-line-num" data-line-number="329" href="#L329" id="L329">
329
</a>
<a class="file-line-num diff-line-num" data-line-number="330" href="#L330" id="L330">
330
</a>
<a class="file-line-num diff-line-num" data-line-number="331" href="#L331" id="L331">
331
</a>
<a class="file-line-num diff-line-num" data-line-number="332" href="#L332" id="L332">
332
</a>
<a class="file-line-num diff-line-num" data-line-number="333" href="#L333" id="L333">
333
</a>
<a class="file-line-num diff-line-num" data-line-number="334" href="#L334" id="L334">
334
</a>
<a class="file-line-num diff-line-num" data-line-number="335" href="#L335" id="L335">
335
</a>
<a class="file-line-num diff-line-num" data-line-number="336" href="#L336" id="L336">
336
</a>
<a class="file-line-num diff-line-num" data-line-number="337" href="#L337" id="L337">
337
</a>
<a class="file-line-num diff-line-num" data-line-number="338" href="#L338" id="L338">
338
</a>
<a class="file-line-num diff-line-num" data-line-number="339" href="#L339" id="L339">
339
</a>
<a class="file-line-num diff-line-num" data-line-number="340" href="#L340" id="L340">
340
</a>
<a class="file-line-num diff-line-num" data-line-number="341" href="#L341" id="L341">
341
</a>
<a class="file-line-num diff-line-num" data-line-number="342" href="#L342" id="L342">
342
</a>
<a class="file-line-num diff-line-num" data-line-number="343" href="#L343" id="L343">
343
</a>
<a class="file-line-num diff-line-num" data-line-number="344" href="#L344" id="L344">
344
</a>
<a class="file-line-num diff-line-num" data-line-number="345" href="#L345" id="L345">
345
</a>
<a class="file-line-num diff-line-num" data-line-number="346" href="#L346" id="L346">
346
</a>
<a class="file-line-num diff-line-num" data-line-number="347" href="#L347" id="L347">
347
</a>
<a class="file-line-num diff-line-num" data-line-number="348" href="#L348" id="L348">
348
</a>
<a class="file-line-num diff-line-num" data-line-number="349" href="#L349" id="L349">
349
</a>
<a class="file-line-num diff-line-num" data-line-number="350" href="#L350" id="L350">
350
</a>
<a class="file-line-num diff-line-num" data-line-number="351" href="#L351" id="L351">
351
</a>
<a class="file-line-num diff-line-num" data-line-number="352" href="#L352" id="L352">
352
</a>
<a class="file-line-num diff-line-num" data-line-number="353" href="#L353" id="L353">
353
</a>
<a class="file-line-num diff-line-num" data-line-number="354" href="#L354" id="L354">
354
</a>
<a class="file-line-num diff-line-num" data-line-number="355" href="#L355" id="L355">
355
</a>
<a class="file-line-num diff-line-num" data-line-number="356" href="#L356" id="L356">
356
</a>
<a class="file-line-num diff-line-num" data-line-number="357" href="#L357" id="L357">
357
</a>
<a class="file-line-num diff-line-num" data-line-number="358" href="#L358" id="L358">
358
</a>
<a class="file-line-num diff-line-num" data-line-number="359" href="#L359" id="L359">
359
</a>
<a class="file-line-num diff-line-num" data-line-number="360" href="#L360" id="L360">
360
</a>
<a class="file-line-num diff-line-num" data-line-number="361" href="#L361" id="L361">
361
</a>
<a class="file-line-num diff-line-num" data-line-number="362" href="#L362" id="L362">
362
</a>
<a class="file-line-num diff-line-num" data-line-number="363" href="#L363" id="L363">
363
</a>
<a class="file-line-num diff-line-num" data-line-number="364" href="#L364" id="L364">
364
</a>
<a class="file-line-num diff-line-num" data-line-number="365" href="#L365" id="L365">
365
</a>
<a class="file-line-num diff-line-num" data-line-number="366" href="#L366" id="L366">
366
</a>
<a class="file-line-num diff-line-num" data-line-number="367" href="#L367" id="L367">
367
</a>
<a class="file-line-num diff-line-num" data-line-number="368" href="#L368" id="L368">
368
</a>
<a class="file-line-num diff-line-num" data-line-number="369" href="#L369" id="L369">
369
</a>
<a class="file-line-num diff-line-num" data-line-number="370" href="#L370" id="L370">
370
</a>
<a class="file-line-num diff-line-num" data-line-number="371" href="#L371" id="L371">
371
</a>
<a class="file-line-num diff-line-num" data-line-number="372" href="#L372" id="L372">
372
</a>
<a class="file-line-num diff-line-num" data-line-number="373" href="#L373" id="L373">
373
</a>
<a class="file-line-num diff-line-num" data-line-number="374" href="#L374" id="L374">
374
</a>
<a class="file-line-num diff-line-num" data-line-number="375" href="#L375" id="L375">
375
</a>
<a class="file-line-num diff-line-num" data-line-number="376" href="#L376" id="L376">
376
</a>
<a class="file-line-num diff-line-num" data-line-number="377" href="#L377" id="L377">
377
</a>
<a class="file-line-num diff-line-num" data-line-number="378" href="#L378" id="L378">
378
</a>
<a class="file-line-num diff-line-num" data-line-number="379" href="#L379" id="L379">
379
</a>
<a class="file-line-num diff-line-num" data-line-number="380" href="#L380" id="L380">
380
</a>
<a class="file-line-num diff-line-num" data-line-number="381" href="#L381" id="L381">
381
</a>
<a class="file-line-num diff-line-num" data-line-number="382" href="#L382" id="L382">
382
</a>
<a class="file-line-num diff-line-num" data-line-number="383" href="#L383" id="L383">
383
</a>
<a class="file-line-num diff-line-num" data-line-number="384" href="#L384" id="L384">
384
</a>
<a class="file-line-num diff-line-num" data-line-number="385" href="#L385" id="L385">
385
</a>
<a class="file-line-num diff-line-num" data-line-number="386" href="#L386" id="L386">
386
</a>
<a class="file-line-num diff-line-num" data-line-number="387" href="#L387" id="L387">
387
</a>
<a class="file-line-num diff-line-num" data-line-number="388" href="#L388" id="L388">
388
</a>
<a class="file-line-num diff-line-num" data-line-number="389" href="#L389" id="L389">
389
</a>
<a class="file-line-num diff-line-num" data-line-number="390" href="#L390" id="L390">
390
</a>
<a class="file-line-num diff-line-num" data-line-number="391" href="#L391" id="L391">
391
</a>
<a class="file-line-num diff-line-num" data-line-number="392" href="#L392" id="L392">
392
</a>
<a class="file-line-num diff-line-num" data-line-number="393" href="#L393" id="L393">
393
</a>
<a class="file-line-num diff-line-num" data-line-number="394" href="#L394" id="L394">
394
</a>
<a class="file-line-num diff-line-num" data-line-number="395" href="#L395" id="L395">
395
</a>
<a class="file-line-num diff-line-num" data-line-number="396" href="#L396" id="L396">
396
</a>
<a class="file-line-num diff-line-num" data-line-number="397" href="#L397" id="L397">
397
</a>
<a class="file-line-num diff-line-num" data-line-number="398" href="#L398" id="L398">
398
</a>
<a class="file-line-num diff-line-num" data-line-number="399" href="#L399" id="L399">
399
</a>
<a class="file-line-num diff-line-num" data-line-number="400" href="#L400" id="L400">
400
</a>
<a class="file-line-num diff-line-num" data-line-number="401" href="#L401" id="L401">
401
</a>
<a class="file-line-num diff-line-num" data-line-number="402" href="#L402" id="L402">
402
</a>
<a class="file-line-num diff-line-num" data-line-number="403" href="#L403" id="L403">
403
</a>
<a class="file-line-num diff-line-num" data-line-number="404" href="#L404" id="L404">
404
</a>
<a class="file-line-num diff-line-num" data-line-number="405" href="#L405" id="L405">
405
</a>
<a class="file-line-num diff-line-num" data-line-number="406" href="#L406" id="L406">
406
</a>
<a class="file-line-num diff-line-num" data-line-number="407" href="#L407" id="L407">
407
</a>
<a class="file-line-num diff-line-num" data-line-number="408" href="#L408" id="L408">
408
</a>
<a class="file-line-num diff-line-num" data-line-number="409" href="#L409" id="L409">
409
</a>
<a class="file-line-num diff-line-num" data-line-number="410" href="#L410" id="L410">
410
</a>
<a class="file-line-num diff-line-num" data-line-number="411" href="#L411" id="L411">
411
</a>
<a class="file-line-num diff-line-num" data-line-number="412" href="#L412" id="L412">
412
</a>
<a class="file-line-num diff-line-num" data-line-number="413" href="#L413" id="L413">
413
</a>
<a class="file-line-num diff-line-num" data-line-number="414" href="#L414" id="L414">
414
</a>
<a class="file-line-num diff-line-num" data-line-number="415" href="#L415" id="L415">
415
</a>
<a class="file-line-num diff-line-num" data-line-number="416" href="#L416" id="L416">
416
</a>
<a class="file-line-num diff-line-num" data-line-number="417" href="#L417" id="L417">
417
</a>
<a class="file-line-num diff-line-num" data-line-number="418" href="#L418" id="L418">
418
</a>
<a class="file-line-num diff-line-num" data-line-number="419" href="#L419" id="L419">
419
</a>
<a class="file-line-num diff-line-num" data-line-number="420" href="#L420" id="L420">
420
</a>
<a class="file-line-num diff-line-num" data-line-number="421" href="#L421" id="L421">
421
</a>
<a class="file-line-num diff-line-num" data-line-number="422" href="#L422" id="L422">
422
</a>
<a class="file-line-num diff-line-num" data-line-number="423" href="#L423" id="L423">
423
</a>
<a class="file-line-num diff-line-num" data-line-number="424" href="#L424" id="L424">
424
</a>
<a class="file-line-num diff-line-num" data-line-number="425" href="#L425" id="L425">
425
</a>
<a class="file-line-num diff-line-num" data-line-number="426" href="#L426" id="L426">
426
</a>
<a class="file-line-num diff-line-num" data-line-number="427" href="#L427" id="L427">
427
</a>
<a class="file-line-num diff-line-num" data-line-number="428" href="#L428" id="L428">
428
</a>
<a class="file-line-num diff-line-num" data-line-number="429" href="#L429" id="L429">
429
</a>
<a class="file-line-num diff-line-num" data-line-number="430" href="#L430" id="L430">
430
</a>
<a class="file-line-num diff-line-num" data-line-number="431" href="#L431" id="L431">
431
</a>
<a class="file-line-num diff-line-num" data-line-number="432" href="#L432" id="L432">
432
</a>
<a class="file-line-num diff-line-num" data-line-number="433" href="#L433" id="L433">
433
</a>
<a class="file-line-num diff-line-num" data-line-number="434" href="#L434" id="L434">
434
</a>
<a class="file-line-num diff-line-num" data-line-number="435" href="#L435" id="L435">
435
</a>
<a class="file-line-num diff-line-num" data-line-number="436" href="#L436" id="L436">
436
</a>
<a class="file-line-num diff-line-num" data-line-number="437" href="#L437" id="L437">
437
</a>
<a class="file-line-num diff-line-num" data-line-number="438" href="#L438" id="L438">
438
</a>
<a class="file-line-num diff-line-num" data-line-number="439" href="#L439" id="L439">
439
</a>
<a class="file-line-num diff-line-num" data-line-number="440" href="#L440" id="L440">
440
</a>
<a class="file-line-num diff-line-num" data-line-number="441" href="#L441" id="L441">
441
</a>
<a class="file-line-num diff-line-num" data-line-number="442" href="#L442" id="L442">
442
</a>
<a class="file-line-num diff-line-num" data-line-number="443" href="#L443" id="L443">
443
</a>
<a class="file-line-num diff-line-num" data-line-number="444" href="#L444" id="L444">
444
</a>
<a class="file-line-num diff-line-num" data-line-number="445" href="#L445" id="L445">
445
</a>
<a class="file-line-num diff-line-num" data-line-number="446" href="#L446" id="L446">
446
</a>
<a class="file-line-num diff-line-num" data-line-number="447" href="#L447" id="L447">
447
</a>
<a class="file-line-num diff-line-num" data-line-number="448" href="#L448" id="L448">
448
</a>
<a class="file-line-num diff-line-num" data-line-number="449" href="#L449" id="L449">
449
</a>
<a class="file-line-num diff-line-num" data-line-number="450" href="#L450" id="L450">
450
</a>
<a class="file-line-num diff-line-num" data-line-number="451" href="#L451" id="L451">
451
</a>
<a class="file-line-num diff-line-num" data-line-number="452" href="#L452" id="L452">
452
</a>
<a class="file-line-num diff-line-num" data-line-number="453" href="#L453" id="L453">
453
</a>
<a class="file-line-num diff-line-num" data-line-number="454" href="#L454" id="L454">
454
</a>
<a class="file-line-num diff-line-num" data-line-number="455" href="#L455" id="L455">
455
</a>
<a class="file-line-num diff-line-num" data-line-number="456" href="#L456" id="L456">
456
</a>
<a class="file-line-num diff-line-num" data-line-number="457" href="#L457" id="L457">
457
</a>
<a class="file-line-num diff-line-num" data-line-number="458" href="#L458" id="L458">
458
</a>
<a class="file-line-num diff-line-num" data-line-number="459" href="#L459" id="L459">
459
</a>
<a class="file-line-num diff-line-num" data-line-number="460" href="#L460" id="L460">
460
</a>
<a class="file-line-num diff-line-num" data-line-number="461" href="#L461" id="L461">
461
</a>
<a class="file-line-num diff-line-num" data-line-number="462" href="#L462" id="L462">
462
</a>
<a class="file-line-num diff-line-num" data-line-number="463" href="#L463" id="L463">
463
</a>
<a class="file-line-num diff-line-num" data-line-number="464" href="#L464" id="L464">
464
</a>
<a class="file-line-num diff-line-num" data-line-number="465" href="#L465" id="L465">
465
</a>
<a class="file-line-num diff-line-num" data-line-number="466" href="#L466" id="L466">
466
</a>
<a class="file-line-num diff-line-num" data-line-number="467" href="#L467" id="L467">
467
</a>
<a class="file-line-num diff-line-num" data-line-number="468" href="#L468" id="L468">
468
</a>
<a class="file-line-num diff-line-num" data-line-number="469" href="#L469" id="L469">
469
</a>
<a class="file-line-num diff-line-num" data-line-number="470" href="#L470" id="L470">
470
</a>
<a class="file-line-num diff-line-num" data-line-number="471" href="#L471" id="L471">
471
</a>
<a class="file-line-num diff-line-num" data-line-number="472" href="#L472" id="L472">
472
</a>
<a class="file-line-num diff-line-num" data-line-number="473" href="#L473" id="L473">
473
</a>
<a class="file-line-num diff-line-num" data-line-number="474" href="#L474" id="L474">
474
</a>
<a class="file-line-num diff-line-num" data-line-number="475" href="#L475" id="L475">
475
</a>
<a class="file-line-num diff-line-num" data-line-number="476" href="#L476" id="L476">
476
</a>
<a class="file-line-num diff-line-num" data-line-number="477" href="#L477" id="L477">
477
</a>
<a class="file-line-num diff-line-num" data-line-number="478" href="#L478" id="L478">
478
</a>
<a class="file-line-num diff-line-num" data-line-number="479" href="#L479" id="L479">
479
</a>
<a class="file-line-num diff-line-num" data-line-number="480" href="#L480" id="L480">
480
</a>
<a class="file-line-num diff-line-num" data-line-number="481" href="#L481" id="L481">
481
</a>
<a class="file-line-num diff-line-num" data-line-number="482" href="#L482" id="L482">
482
</a>
<a class="file-line-num diff-line-num" data-line-number="483" href="#L483" id="L483">
483
</a>
<a class="file-line-num diff-line-num" data-line-number="484" href="#L484" id="L484">
484
</a>
<a class="file-line-num diff-line-num" data-line-number="485" href="#L485" id="L485">
485
</a>
<a class="file-line-num diff-line-num" data-line-number="486" href="#L486" id="L486">
486
</a>
<a class="file-line-num diff-line-num" data-line-number="487" href="#L487" id="L487">
487
</a>
<a class="file-line-num diff-line-num" data-line-number="488" href="#L488" id="L488">
488
</a>
<a class="file-line-num diff-line-num" data-line-number="489" href="#L489" id="L489">
489
</a>
<a class="file-line-num diff-line-num" data-line-number="490" href="#L490" id="L490">
490
</a>
<a class="file-line-num diff-line-num" data-line-number="491" href="#L491" id="L491">
491
</a>
<a class="file-line-num diff-line-num" data-line-number="492" href="#L492" id="L492">
492
</a>
<a class="file-line-num diff-line-num" data-line-number="493" href="#L493" id="L493">
493
</a>
<a class="file-line-num diff-line-num" data-line-number="494" href="#L494" id="L494">
494
</a>
<a class="file-line-num diff-line-num" data-line-number="495" href="#L495" id="L495">
495
</a>
<a class="file-line-num diff-line-num" data-line-number="496" href="#L496" id="L496">
496
</a>
<a class="file-line-num diff-line-num" data-line-number="497" href="#L497" id="L497">
497
</a>
<a class="file-line-num diff-line-num" data-line-number="498" href="#L498" id="L498">
498
</a>
<a class="file-line-num diff-line-num" data-line-number="499" href="#L499" id="L499">
499
</a>
<a class="file-line-num diff-line-num" data-line-number="500" href="#L500" id="L500">
500
</a>
<a class="file-line-num diff-line-num" data-line-number="501" href="#L501" id="L501">
501
</a>
<a class="file-line-num diff-line-num" data-line-number="502" href="#L502" id="L502">
502
</a>
<a class="file-line-num diff-line-num" data-line-number="503" href="#L503" id="L503">
503
</a>
<a class="file-line-num diff-line-num" data-line-number="504" href="#L504" id="L504">
504
</a>
<a class="file-line-num diff-line-num" data-line-number="505" href="#L505" id="L505">
505
</a>
<a class="file-line-num diff-line-num" data-line-number="506" href="#L506" id="L506">
506
</a>
<a class="file-line-num diff-line-num" data-line-number="507" href="#L507" id="L507">
507
</a>
<a class="file-line-num diff-line-num" data-line-number="508" href="#L508" id="L508">
508
</a>
<a class="file-line-num diff-line-num" data-line-number="509" href="#L509" id="L509">
509
</a>
<a class="file-line-num diff-line-num" data-line-number="510" href="#L510" id="L510">
510
</a>
<a class="file-line-num diff-line-num" data-line-number="511" href="#L511" id="L511">
511
</a>
<a class="file-line-num diff-line-num" data-line-number="512" href="#L512" id="L512">
512
</a>
<a class="file-line-num diff-line-num" data-line-number="513" href="#L513" id="L513">
513
</a>
<a class="file-line-num diff-line-num" data-line-number="514" href="#L514" id="L514">
514
</a>
<a class="file-line-num diff-line-num" data-line-number="515" href="#L515" id="L515">
515
</a>
<a class="file-line-num diff-line-num" data-line-number="516" href="#L516" id="L516">
516
</a>
<a class="file-line-num diff-line-num" data-line-number="517" href="#L517" id="L517">
517
</a>
<a class="file-line-num diff-line-num" data-line-number="518" href="#L518" id="L518">
518
</a>
<a class="file-line-num diff-line-num" data-line-number="519" href="#L519" id="L519">
519
</a>
<a class="file-line-num diff-line-num" data-line-number="520" href="#L520" id="L520">
520
</a>
<a class="file-line-num diff-line-num" data-line-number="521" href="#L521" id="L521">
521
</a>
<a class="file-line-num diff-line-num" data-line-number="522" href="#L522" id="L522">
522
</a>
<a class="file-line-num diff-line-num" data-line-number="523" href="#L523" id="L523">
523
</a>
<a class="file-line-num diff-line-num" data-line-number="524" href="#L524" id="L524">
524
</a>
<a class="file-line-num diff-line-num" data-line-number="525" href="#L525" id="L525">
525
</a>
<a class="file-line-num diff-line-num" data-line-number="526" href="#L526" id="L526">
526
</a>
<a class="file-line-num diff-line-num" data-line-number="527" href="#L527" id="L527">
527
</a>
<a class="file-line-num diff-line-num" data-line-number="528" href="#L528" id="L528">
528
</a>
<a class="file-line-num diff-line-num" data-line-number="529" href="#L529" id="L529">
529
</a>
<a class="file-line-num diff-line-num" data-line-number="530" href="#L530" id="L530">
530
</a>
<a class="file-line-num diff-line-num" data-line-number="531" href="#L531" id="L531">
531
</a>
<a class="file-line-num diff-line-num" data-line-number="532" href="#L532" id="L532">
532
</a>
<a class="file-line-num diff-line-num" data-line-number="533" href="#L533" id="L533">
533
</a>
<a class="file-line-num diff-line-num" data-line-number="534" href="#L534" id="L534">
534
</a>
<a class="file-line-num diff-line-num" data-line-number="535" href="#L535" id="L535">
535
</a>
<a class="file-line-num diff-line-num" data-line-number="536" href="#L536" id="L536">
536
</a>
<a class="file-line-num diff-line-num" data-line-number="537" href="#L537" id="L537">
537
</a>
<a class="file-line-num diff-line-num" data-line-number="538" href="#L538" id="L538">
538
</a>
<a class="file-line-num diff-line-num" data-line-number="539" href="#L539" id="L539">
539
</a>
<a class="file-line-num diff-line-num" data-line-number="540" href="#L540" id="L540">
540
</a>
<a class="file-line-num diff-line-num" data-line-number="541" href="#L541" id="L541">
541
</a>
<a class="file-line-num diff-line-num" data-line-number="542" href="#L542" id="L542">
542
</a>
<a class="file-line-num diff-line-num" data-line-number="543" href="#L543" id="L543">
543
</a>
<a class="file-line-num diff-line-num" data-line-number="544" href="#L544" id="L544">
544
</a>
<a class="file-line-num diff-line-num" data-line-number="545" href="#L545" id="L545">
545
</a>
<a class="file-line-num diff-line-num" data-line-number="546" href="#L546" id="L546">
546
</a>
<a class="file-line-num diff-line-num" data-line-number="547" href="#L547" id="L547">
547
</a>
<a class="file-line-num diff-line-num" data-line-number="548" href="#L548" id="L548">
548
</a>
<a class="file-line-num diff-line-num" data-line-number="549" href="#L549" id="L549">
549
</a>
<a class="file-line-num diff-line-num" data-line-number="550" href="#L550" id="L550">
550
</a>
<a class="file-line-num diff-line-num" data-line-number="551" href="#L551" id="L551">
551
</a>
<a class="file-line-num diff-line-num" data-line-number="552" href="#L552" id="L552">
552
</a>
<a class="file-line-num diff-line-num" data-line-number="553" href="#L553" id="L553">
553
</a>
<a class="file-line-num diff-line-num" data-line-number="554" href="#L554" id="L554">
554
</a>
<a class="file-line-num diff-line-num" data-line-number="555" href="#L555" id="L555">
555
</a>
<a class="file-line-num diff-line-num" data-line-number="556" href="#L556" id="L556">
556
</a>
<a class="file-line-num diff-line-num" data-line-number="557" href="#L557" id="L557">
557
</a>
<a class="file-line-num diff-line-num" data-line-number="558" href="#L558" id="L558">
558
</a>
<a class="file-line-num diff-line-num" data-line-number="559" href="#L559" id="L559">
559
</a>
<a class="file-line-num diff-line-num" data-line-number="560" href="#L560" id="L560">
560
</a>
<a class="file-line-num diff-line-num" data-line-number="561" href="#L561" id="L561">
561
</a>
<a class="file-line-num diff-line-num" data-line-number="562" href="#L562" id="L562">
562
</a>
<a class="file-line-num diff-line-num" data-line-number="563" href="#L563" id="L563">
563
</a>
<a class="file-line-num diff-line-num" data-line-number="564" href="#L564" id="L564">
564
</a>
<a class="file-line-num diff-line-num" data-line-number="565" href="#L565" id="L565">
565
</a>
<a class="file-line-num diff-line-num" data-line-number="566" href="#L566" id="L566">
566
</a>
<a class="file-line-num diff-line-num" data-line-number="567" href="#L567" id="L567">
567
</a>
<a class="file-line-num diff-line-num" data-line-number="568" href="#L568" id="L568">
568
</a>
<a class="file-line-num diff-line-num" data-line-number="569" href="#L569" id="L569">
569
</a>
<a class="file-line-num diff-line-num" data-line-number="570" href="#L570" id="L570">
570
</a>
<a class="file-line-num diff-line-num" data-line-number="571" href="#L571" id="L571">
571
</a>
<a class="file-line-num diff-line-num" data-line-number="572" href="#L572" id="L572">
572
</a>
<a class="file-line-num diff-line-num" data-line-number="573" href="#L573" id="L573">
573
</a>
<a class="file-line-num diff-line-num" data-line-number="574" href="#L574" id="L574">
574
</a>
<a class="file-line-num diff-line-num" data-line-number="575" href="#L575" id="L575">
575
</a>
<a class="file-line-num diff-line-num" data-line-number="576" href="#L576" id="L576">
576
</a>
<a class="file-line-num diff-line-num" data-line-number="577" href="#L577" id="L577">
577
</a>
<a class="file-line-num diff-line-num" data-line-number="578" href="#L578" id="L578">
578
</a>
<a class="file-line-num diff-line-num" data-line-number="579" href="#L579" id="L579">
579
</a>
<a class="file-line-num diff-line-num" data-line-number="580" href="#L580" id="L580">
580
</a>
<a class="file-line-num diff-line-num" data-line-number="581" href="#L581" id="L581">
581
</a>
<a class="file-line-num diff-line-num" data-line-number="582" href="#L582" id="L582">
582
</a>
<a class="file-line-num diff-line-num" data-line-number="583" href="#L583" id="L583">
583
</a>
<a class="file-line-num diff-line-num" data-line-number="584" href="#L584" id="L584">
584
</a>
<a class="file-line-num diff-line-num" data-line-number="585" href="#L585" id="L585">
585
</a>
<a class="file-line-num diff-line-num" data-line-number="586" href="#L586" id="L586">
586
</a>
<a class="file-line-num diff-line-num" data-line-number="587" href="#L587" id="L587">
587
</a>
<a class="file-line-num diff-line-num" data-line-number="588" href="#L588" id="L588">
588
</a>
<a class="file-line-num diff-line-num" data-line-number="589" href="#L589" id="L589">
589
</a>
<a class="file-line-num diff-line-num" data-line-number="590" href="#L590" id="L590">
590
</a>
<a class="file-line-num diff-line-num" data-line-number="591" href="#L591" id="L591">
591
</a>
<a class="file-line-num diff-line-num" data-line-number="592" href="#L592" id="L592">
592
</a>
<a class="file-line-num diff-line-num" data-line-number="593" href="#L593" id="L593">
593
</a>
<a class="file-line-num diff-line-num" data-line-number="594" href="#L594" id="L594">
594
</a>
<a class="file-line-num diff-line-num" data-line-number="595" href="#L595" id="L595">
595
</a>
<a class="file-line-num diff-line-num" data-line-number="596" href="#L596" id="L596">
596
</a>
<a class="file-line-num diff-line-num" data-line-number="597" href="#L597" id="L597">
597
</a>
<a class="file-line-num diff-line-num" data-line-number="598" href="#L598" id="L598">
598
</a>
<a class="file-line-num diff-line-num" data-line-number="599" href="#L599" id="L599">
599
</a>
<a class="file-line-num diff-line-num" data-line-number="600" href="#L600" id="L600">
600
</a>
<a class="file-line-num diff-line-num" data-line-number="601" href="#L601" id="L601">
601
</a>
<a class="file-line-num diff-line-num" data-line-number="602" href="#L602" id="L602">
602
</a>
<a class="file-line-num diff-line-num" data-line-number="603" href="#L603" id="L603">
603
</a>
<a class="file-line-num diff-line-num" data-line-number="604" href="#L604" id="L604">
604
</a>
<a class="file-line-num diff-line-num" data-line-number="605" href="#L605" id="L605">
605
</a>
<a class="file-line-num diff-line-num" data-line-number="606" href="#L606" id="L606">
606
</a>
<a class="file-line-num diff-line-num" data-line-number="607" href="#L607" id="L607">
607
</a>
<a class="file-line-num diff-line-num" data-line-number="608" href="#L608" id="L608">
608
</a>
<a class="file-line-num diff-line-num" data-line-number="609" href="#L609" id="L609">
609
</a>
<a class="file-line-num diff-line-num" data-line-number="610" href="#L610" id="L610">
610
</a>
<a class="file-line-num diff-line-num" data-line-number="611" href="#L611" id="L611">
611
</a>
<a class="file-line-num diff-line-num" data-line-number="612" href="#L612" id="L612">
612
</a>
<a class="file-line-num diff-line-num" data-line-number="613" href="#L613" id="L613">
613
</a>
<a class="file-line-num diff-line-num" data-line-number="614" href="#L614" id="L614">
614
</a>
<a class="file-line-num diff-line-num" data-line-number="615" href="#L615" id="L615">
615
</a>
<a class="file-line-num diff-line-num" data-line-number="616" href="#L616" id="L616">
616
</a>
<a class="file-line-num diff-line-num" data-line-number="617" href="#L617" id="L617">
617
</a>
<a class="file-line-num diff-line-num" data-line-number="618" href="#L618" id="L618">
618
</a>
<a class="file-line-num diff-line-num" data-line-number="619" href="#L619" id="L619">
619
</a>
<a class="file-line-num diff-line-num" data-line-number="620" href="#L620" id="L620">
620
</a>
<a class="file-line-num diff-line-num" data-line-number="621" href="#L621" id="L621">
621
</a>
<a class="file-line-num diff-line-num" data-line-number="622" href="#L622" id="L622">
622
</a>
<a class="file-line-num diff-line-num" data-line-number="623" href="#L623" id="L623">
623
</a>
<a class="file-line-num diff-line-num" data-line-number="624" href="#L624" id="L624">
624
</a>
<a class="file-line-num diff-line-num" data-line-number="625" href="#L625" id="L625">
625
</a>
<a class="file-line-num diff-line-num" data-line-number="626" href="#L626" id="L626">
626
</a>
<a class="file-line-num diff-line-num" data-line-number="627" href="#L627" id="L627">
627
</a>
<a class="file-line-num diff-line-num" data-line-number="628" href="#L628" id="L628">
628
</a>
<a class="file-line-num diff-line-num" data-line-number="629" href="#L629" id="L629">
629
</a>
<a class="file-line-num diff-line-num" data-line-number="630" href="#L630" id="L630">
630
</a>
<a class="file-line-num diff-line-num" data-line-number="631" href="#L631" id="L631">
631
</a>
<a class="file-line-num diff-line-num" data-line-number="632" href="#L632" id="L632">
632
</a>
<a class="file-line-num diff-line-num" data-line-number="633" href="#L633" id="L633">
633
</a>
<a class="file-line-num diff-line-num" data-line-number="634" href="#L634" id="L634">
634
</a>
<a class="file-line-num diff-line-num" data-line-number="635" href="#L635" id="L635">
635
</a>
<a class="file-line-num diff-line-num" data-line-number="636" href="#L636" id="L636">
636
</a>
<a class="file-line-num diff-line-num" data-line-number="637" href="#L637" id="L637">
637
</a>
<a class="file-line-num diff-line-num" data-line-number="638" href="#L638" id="L638">
638
</a>
<a class="file-line-num diff-line-num" data-line-number="639" href="#L639" id="L639">
639
</a>
<a class="file-line-num diff-line-num" data-line-number="640" href="#L640" id="L640">
640
</a>
<a class="file-line-num diff-line-num" data-line-number="641" href="#L641" id="L641">
641
</a>
<a class="file-line-num diff-line-num" data-line-number="642" href="#L642" id="L642">
642
</a>
<a class="file-line-num diff-line-num" data-line-number="643" href="#L643" id="L643">
643
</a>
<a class="file-line-num diff-line-num" data-line-number="644" href="#L644" id="L644">
644
</a>
<a class="file-line-num diff-line-num" data-line-number="645" href="#L645" id="L645">
645
</a>
<a class="file-line-num diff-line-num" data-line-number="646" href="#L646" id="L646">
646
</a>
<a class="file-line-num diff-line-num" data-line-number="647" href="#L647" id="L647">
647
</a>
<a class="file-line-num diff-line-num" data-line-number="648" href="#L648" id="L648">
648
</a>
<a class="file-line-num diff-line-num" data-line-number="649" href="#L649" id="L649">
649
</a>
<a class="file-line-num diff-line-num" data-line-number="650" href="#L650" id="L650">
650
</a>
<a class="file-line-num diff-line-num" data-line-number="651" href="#L651" id="L651">
651
</a>
<a class="file-line-num diff-line-num" data-line-number="652" href="#L652" id="L652">
652
</a>
<a class="file-line-num diff-line-num" data-line-number="653" href="#L653" id="L653">
653
</a>
<a class="file-line-num diff-line-num" data-line-number="654" href="#L654" id="L654">
654
</a>
<a class="file-line-num diff-line-num" data-line-number="655" href="#L655" id="L655">
655
</a>
<a class="file-line-num diff-line-num" data-line-number="656" href="#L656" id="L656">
656
</a>
<a class="file-line-num diff-line-num" data-line-number="657" href="#L657" id="L657">
657
</a>
<a class="file-line-num diff-line-num" data-line-number="658" href="#L658" id="L658">
658
</a>
<a class="file-line-num diff-line-num" data-line-number="659" href="#L659" id="L659">
659
</a>
<a class="file-line-num diff-line-num" data-line-number="660" href="#L660" id="L660">
660
</a>
<a class="file-line-num diff-line-num" data-line-number="661" href="#L661" id="L661">
661
</a>
<a class="file-line-num diff-line-num" data-line-number="662" href="#L662" id="L662">
662
</a>
<a class="file-line-num diff-line-num" data-line-number="663" href="#L663" id="L663">
663
</a>
<a class="file-line-num diff-line-num" data-line-number="664" href="#L664" id="L664">
664
</a>
<a class="file-line-num diff-line-num" data-line-number="665" href="#L665" id="L665">
665
</a>
<a class="file-line-num diff-line-num" data-line-number="666" href="#L666" id="L666">
666
</a>
<a class="file-line-num diff-line-num" data-line-number="667" href="#L667" id="L667">
667
</a>
<a class="file-line-num diff-line-num" data-line-number="668" href="#L668" id="L668">
668
</a>
<a class="file-line-num diff-line-num" data-line-number="669" href="#L669" id="L669">
669
</a>
<a class="file-line-num diff-line-num" data-line-number="670" href="#L670" id="L670">
670
</a>
<a class="file-line-num diff-line-num" data-line-number="671" href="#L671" id="L671">
671
</a>
<a class="file-line-num diff-line-num" data-line-number="672" href="#L672" id="L672">
672
</a>
<a class="file-line-num diff-line-num" data-line-number="673" href="#L673" id="L673">
673
</a>
<a class="file-line-num diff-line-num" data-line-number="674" href="#L674" id="L674">
674
</a>
<a class="file-line-num diff-line-num" data-line-number="675" href="#L675" id="L675">
675
</a>
<a class="file-line-num diff-line-num" data-line-number="676" href="#L676" id="L676">
676
</a>
<a class="file-line-num diff-line-num" data-line-number="677" href="#L677" id="L677">
677
</a>
<a class="file-line-num diff-line-num" data-line-number="678" href="#L678" id="L678">
678
</a>
<a class="file-line-num diff-line-num" data-line-number="679" href="#L679" id="L679">
679
</a>
<a class="file-line-num diff-line-num" data-line-number="680" href="#L680" id="L680">
680
</a>
<a class="file-line-num diff-line-num" data-line-number="681" href="#L681" id="L681">
681
</a>
<a class="file-line-num diff-line-num" data-line-number="682" href="#L682" id="L682">
682
</a>
<a class="file-line-num diff-line-num" data-line-number="683" href="#L683" id="L683">
683
</a>
<a class="file-line-num diff-line-num" data-line-number="684" href="#L684" id="L684">
684
</a>
<a class="file-line-num diff-line-num" data-line-number="685" href="#L685" id="L685">
685
</a>
<a class="file-line-num diff-line-num" data-line-number="686" href="#L686" id="L686">
686
</a>
<a class="file-line-num diff-line-num" data-line-number="687" href="#L687" id="L687">
687
</a>
<a class="file-line-num diff-line-num" data-line-number="688" href="#L688" id="L688">
688
</a>
<a class="file-line-num diff-line-num" data-line-number="689" href="#L689" id="L689">
689
</a>
<a class="file-line-num diff-line-num" data-line-number="690" href="#L690" id="L690">
690
</a>
<a class="file-line-num diff-line-num" data-line-number="691" href="#L691" id="L691">
691
</a>
<a class="file-line-num diff-line-num" data-line-number="692" href="#L692" id="L692">
692
</a>
<a class="file-line-num diff-line-num" data-line-number="693" href="#L693" id="L693">
693
</a>
<a class="file-line-num diff-line-num" data-line-number="694" href="#L694" id="L694">
694
</a>
<a class="file-line-num diff-line-num" data-line-number="695" href="#L695" id="L695">
695
</a>
<a class="file-line-num diff-line-num" data-line-number="696" href="#L696" id="L696">
696
</a>
<a class="file-line-num diff-line-num" data-line-number="697" href="#L697" id="L697">
697
</a>
<a class="file-line-num diff-line-num" data-line-number="698" href="#L698" id="L698">
698
</a>
<a class="file-line-num diff-line-num" data-line-number="699" href="#L699" id="L699">
699
</a>
<a class="file-line-num diff-line-num" data-line-number="700" href="#L700" id="L700">
700
</a>
<a class="file-line-num diff-line-num" data-line-number="701" href="#L701" id="L701">
701
</a>
<a class="file-line-num diff-line-num" data-line-number="702" href="#L702" id="L702">
702
</a>
<a class="file-line-num diff-line-num" data-line-number="703" href="#L703" id="L703">
703
</a>
<a class="file-line-num diff-line-num" data-line-number="704" href="#L704" id="L704">
704
</a>
<a class="file-line-num diff-line-num" data-line-number="705" href="#L705" id="L705">
705
</a>
<a class="file-line-num diff-line-num" data-line-number="706" href="#L706" id="L706">
706
</a>
<a class="file-line-num diff-line-num" data-line-number="707" href="#L707" id="L707">
707
</a>
<a class="file-line-num diff-line-num" data-line-number="708" href="#L708" id="L708">
708
</a>
<a class="file-line-num diff-line-num" data-line-number="709" href="#L709" id="L709">
709
</a>
<a class="file-line-num diff-line-num" data-line-number="710" href="#L710" id="L710">
710
</a>
<a class="file-line-num diff-line-num" data-line-number="711" href="#L711" id="L711">
711
</a>
<a class="file-line-num diff-line-num" data-line-number="712" href="#L712" id="L712">
712
</a>
<a class="file-line-num diff-line-num" data-line-number="713" href="#L713" id="L713">
713
</a>
<a class="file-line-num diff-line-num" data-line-number="714" href="#L714" id="L714">
714
</a>
<a class="file-line-num diff-line-num" data-line-number="715" href="#L715" id="L715">
715
</a>
<a class="file-line-num diff-line-num" data-line-number="716" href="#L716" id="L716">
716
</a>
<a class="file-line-num diff-line-num" data-line-number="717" href="#L717" id="L717">
717
</a>
<a class="file-line-num diff-line-num" data-line-number="718" href="#L718" id="L718">
718
</a>
<a class="file-line-num diff-line-num" data-line-number="719" href="#L719" id="L719">
719
</a>
<a class="file-line-num diff-line-num" data-line-number="720" href="#L720" id="L720">
720
</a>
<a class="file-line-num diff-line-num" data-line-number="721" href="#L721" id="L721">
721
</a>
<a class="file-line-num diff-line-num" data-line-number="722" href="#L722" id="L722">
722
</a>
<a class="file-line-num diff-line-num" data-line-number="723" href="#L723" id="L723">
723
</a>
<a class="file-line-num diff-line-num" data-line-number="724" href="#L724" id="L724">
724
</a>
<a class="file-line-num diff-line-num" data-line-number="725" href="#L725" id="L725">
725
</a>
<a class="file-line-num diff-line-num" data-line-number="726" href="#L726" id="L726">
726
</a>
<a class="file-line-num diff-line-num" data-line-number="727" href="#L727" id="L727">
727
</a>
<a class="file-line-num diff-line-num" data-line-number="728" href="#L728" id="L728">
728
</a>
<a class="file-line-num diff-line-num" data-line-number="729" href="#L729" id="L729">
729
</a>
<a class="file-line-num diff-line-num" data-line-number="730" href="#L730" id="L730">
730
</a>
<a class="file-line-num diff-line-num" data-line-number="731" href="#L731" id="L731">
731
</a>
<a class="file-line-num diff-line-num" data-line-number="732" href="#L732" id="L732">
732
</a>
<a class="file-line-num diff-line-num" data-line-number="733" href="#L733" id="L733">
733
</a>
<a class="file-line-num diff-line-num" data-line-number="734" href="#L734" id="L734">
734
</a>
<a class="file-line-num diff-line-num" data-line-number="735" href="#L735" id="L735">
735
</a>
<a class="file-line-num diff-line-num" data-line-number="736" href="#L736" id="L736">
736
</a>
<a class="file-line-num diff-line-num" data-line-number="737" href="#L737" id="L737">
737
</a>
<a class="file-line-num diff-line-num" data-line-number="738" href="#L738" id="L738">
738
</a>
<a class="file-line-num diff-line-num" data-line-number="739" href="#L739" id="L739">
739
</a>
<a class="file-line-num diff-line-num" data-line-number="740" href="#L740" id="L740">
740
</a>
<a class="file-line-num diff-line-num" data-line-number="741" href="#L741" id="L741">
741
</a>
<a class="file-line-num diff-line-num" data-line-number="742" href="#L742" id="L742">
742
</a>
<a class="file-line-num diff-line-num" data-line-number="743" href="#L743" id="L743">
743
</a>
<a class="file-line-num diff-line-num" data-line-number="744" href="#L744" id="L744">
744
</a>
<a class="file-line-num diff-line-num" data-line-number="745" href="#L745" id="L745">
745
</a>
<a class="file-line-num diff-line-num" data-line-number="746" href="#L746" id="L746">
746
</a>
<a class="file-line-num diff-line-num" data-line-number="747" href="#L747" id="L747">
747
</a>
<a class="file-line-num diff-line-num" data-line-number="748" href="#L748" id="L748">
748
</a>
<a class="file-line-num diff-line-num" data-line-number="749" href="#L749" id="L749">
749
</a>
<a class="file-line-num diff-line-num" data-line-number="750" href="#L750" id="L750">
750
</a>
<a class="file-line-num diff-line-num" data-line-number="751" href="#L751" id="L751">
751
</a>
<a class="file-line-num diff-line-num" data-line-number="752" href="#L752" id="L752">
752
</a>
<a class="file-line-num diff-line-num" data-line-number="753" href="#L753" id="L753">
753
</a>
<a class="file-line-num diff-line-num" data-line-number="754" href="#L754" id="L754">
754
</a>
<a class="file-line-num diff-line-num" data-line-number="755" href="#L755" id="L755">
755
</a>
<a class="file-line-num diff-line-num" data-line-number="756" href="#L756" id="L756">
756
</a>
<a class="file-line-num diff-line-num" data-line-number="757" href="#L757" id="L757">
757
</a>
<a class="file-line-num diff-line-num" data-line-number="758" href="#L758" id="L758">
758
</a>
<a class="file-line-num diff-line-num" data-line-number="759" href="#L759" id="L759">
759
</a>
<a class="file-line-num diff-line-num" data-line-number="760" href="#L760" id="L760">
760
</a>
<a class="file-line-num diff-line-num" data-line-number="761" href="#L761" id="L761">
761
</a>
<a class="file-line-num diff-line-num" data-line-number="762" href="#L762" id="L762">
762
</a>
<a class="file-line-num diff-line-num" data-line-number="763" href="#L763" id="L763">
763
</a>
<a class="file-line-num diff-line-num" data-line-number="764" href="#L764" id="L764">
764
</a>
<a class="file-line-num diff-line-num" data-line-number="765" href="#L765" id="L765">
765
</a>
<a class="file-line-num diff-line-num" data-line-number="766" href="#L766" id="L766">
766
</a>
<a class="file-line-num diff-line-num" data-line-number="767" href="#L767" id="L767">
767
</a>
<a class="file-line-num diff-line-num" data-line-number="768" href="#L768" id="L768">
768
</a>
<a class="file-line-num diff-line-num" data-line-number="769" href="#L769" id="L769">
769
</a>
<a class="file-line-num diff-line-num" data-line-number="770" href="#L770" id="L770">
770
</a>
<a class="file-line-num diff-line-num" data-line-number="771" href="#L771" id="L771">
771
</a>
<a class="file-line-num diff-line-num" data-line-number="772" href="#L772" id="L772">
772
</a>
<a class="file-line-num diff-line-num" data-line-number="773" href="#L773" id="L773">
773
</a>
<a class="file-line-num diff-line-num" data-line-number="774" href="#L774" id="L774">
774
</a>
<a class="file-line-num diff-line-num" data-line-number="775" href="#L775" id="L775">
775
</a>
<a class="file-line-num diff-line-num" data-line-number="776" href="#L776" id="L776">
776
</a>
<a class="file-line-num diff-line-num" data-line-number="777" href="#L777" id="L777">
777
</a>
<a class="file-line-num diff-line-num" data-line-number="778" href="#L778" id="L778">
778
</a>
<a class="file-line-num diff-line-num" data-line-number="779" href="#L779" id="L779">
779
</a>
<a class="file-line-num diff-line-num" data-line-number="780" href="#L780" id="L780">
780
</a>
<a class="file-line-num diff-line-num" data-line-number="781" href="#L781" id="L781">
781
</a>
<a class="file-line-num diff-line-num" data-line-number="782" href="#L782" id="L782">
782
</a>
<a class="file-line-num diff-line-num" data-line-number="783" href="#L783" id="L783">
783
</a>
<a class="file-line-num diff-line-num" data-line-number="784" href="#L784" id="L784">
784
</a>
<a class="file-line-num diff-line-num" data-line-number="785" href="#L785" id="L785">
785
</a>
<a class="file-line-num diff-line-num" data-line-number="786" href="#L786" id="L786">
786
</a>
<a class="file-line-num diff-line-num" data-line-number="787" href="#L787" id="L787">
787
</a>
<a class="file-line-num diff-line-num" data-line-number="788" href="#L788" id="L788">
788
</a>
<a class="file-line-num diff-line-num" data-line-number="789" href="#L789" id="L789">
789
</a>
<a class="file-line-num diff-line-num" data-line-number="790" href="#L790" id="L790">
790
</a>
<a class="file-line-num diff-line-num" data-line-number="791" href="#L791" id="L791">
791
</a>
<a class="file-line-num diff-line-num" data-line-number="792" href="#L792" id="L792">
792
</a>
<a class="file-line-num diff-line-num" data-line-number="793" href="#L793" id="L793">
793
</a>
<a class="file-line-num diff-line-num" data-line-number="794" href="#L794" id="L794">
794
</a>
<a class="file-line-num diff-line-num" data-line-number="795" href="#L795" id="L795">
795
</a>
<a class="file-line-num diff-line-num" data-line-number="796" href="#L796" id="L796">
796
</a>
<a class="file-line-num diff-line-num" data-line-number="797" href="#L797" id="L797">
797
</a>
<a class="file-line-num diff-line-num" data-line-number="798" href="#L798" id="L798">
798
</a>
<a class="file-line-num diff-line-num" data-line-number="799" href="#L799" id="L799">
799
</a>
<a class="file-line-num diff-line-num" data-line-number="800" href="#L800" id="L800">
800
</a>
<a class="file-line-num diff-line-num" data-line-number="801" href="#L801" id="L801">
801
</a>
<a class="file-line-num diff-line-num" data-line-number="802" href="#L802" id="L802">
802
</a>
<a class="file-line-num diff-line-num" data-line-number="803" href="#L803" id="L803">
803
</a>
<a class="file-line-num diff-line-num" data-line-number="804" href="#L804" id="L804">
804
</a>
<a class="file-line-num diff-line-num" data-line-number="805" href="#L805" id="L805">
805
</a>
<a class="file-line-num diff-line-num" data-line-number="806" href="#L806" id="L806">
806
</a>
<a class="file-line-num diff-line-num" data-line-number="807" href="#L807" id="L807">
807
</a>
<a class="file-line-num diff-line-num" data-line-number="808" href="#L808" id="L808">
808
</a>
<a class="file-line-num diff-line-num" data-line-number="809" href="#L809" id="L809">
809
</a>
<a class="file-line-num diff-line-num" data-line-number="810" href="#L810" id="L810">
810
</a>
<a class="file-line-num diff-line-num" data-line-number="811" href="#L811" id="L811">
811
</a>
<a class="file-line-num diff-line-num" data-line-number="812" href="#L812" id="L812">
812
</a>
<a class="file-line-num diff-line-num" data-line-number="813" href="#L813" id="L813">
813
</a>
<a class="file-line-num diff-line-num" data-line-number="814" href="#L814" id="L814">
814
</a>
<a class="file-line-num diff-line-num" data-line-number="815" href="#L815" id="L815">
815
</a>
<a class="file-line-num diff-line-num" data-line-number="816" href="#L816" id="L816">
816
</a>
<a class="file-line-num diff-line-num" data-line-number="817" href="#L817" id="L817">
817
</a>
<a class="file-line-num diff-line-num" data-line-number="818" href="#L818" id="L818">
818
</a>
<a class="file-line-num diff-line-num" data-line-number="819" href="#L819" id="L819">
819
</a>
<a class="file-line-num diff-line-num" data-line-number="820" href="#L820" id="L820">
820
</a>
<a class="file-line-num diff-line-num" data-line-number="821" href="#L821" id="L821">
821
</a>
<a class="file-line-num diff-line-num" data-line-number="822" href="#L822" id="L822">
822
</a>
<a class="file-line-num diff-line-num" data-line-number="823" href="#L823" id="L823">
823
</a>
<a class="file-line-num diff-line-num" data-line-number="824" href="#L824" id="L824">
824
</a>
<a class="file-line-num diff-line-num" data-line-number="825" href="#L825" id="L825">
825
</a>
<a class="file-line-num diff-line-num" data-line-number="826" href="#L826" id="L826">
826
</a>
<a class="file-line-num diff-line-num" data-line-number="827" href="#L827" id="L827">
827
</a>
<a class="file-line-num diff-line-num" data-line-number="828" href="#L828" id="L828">
828
</a>
<a class="file-line-num diff-line-num" data-line-number="829" href="#L829" id="L829">
829
</a>
<a class="file-line-num diff-line-num" data-line-number="830" href="#L830" id="L830">
830
</a>
<a class="file-line-num diff-line-num" data-line-number="831" href="#L831" id="L831">
831
</a>
<a class="file-line-num diff-line-num" data-line-number="832" href="#L832" id="L832">
832
</a>
<a class="file-line-num diff-line-num" data-line-number="833" href="#L833" id="L833">
833
</a>
<a class="file-line-num diff-line-num" data-line-number="834" href="#L834" id="L834">
834
</a>
<a class="file-line-num diff-line-num" data-line-number="835" href="#L835" id="L835">
835
</a>
<a class="file-line-num diff-line-num" data-line-number="836" href="#L836" id="L836">
836
</a>
<a class="file-line-num diff-line-num" data-line-number="837" href="#L837" id="L837">
837
</a>
<a class="file-line-num diff-line-num" data-line-number="838" href="#L838" id="L838">
838
</a>
<a class="file-line-num diff-line-num" data-line-number="839" href="#L839" id="L839">
839
</a>
<a class="file-line-num diff-line-num" data-line-number="840" href="#L840" id="L840">
840
</a>
<a class="file-line-num diff-line-num" data-line-number="841" href="#L841" id="L841">
841
</a>
<a class="file-line-num diff-line-num" data-line-number="842" href="#L842" id="L842">
842
</a>
<a class="file-line-num diff-line-num" data-line-number="843" href="#L843" id="L843">
843
</a>
<a class="file-line-num diff-line-num" data-line-number="844" href="#L844" id="L844">
844
</a>
<a class="file-line-num diff-line-num" data-line-number="845" href="#L845" id="L845">
845
</a>
<a class="file-line-num diff-line-num" data-line-number="846" href="#L846" id="L846">
846
</a>
<a class="file-line-num diff-line-num" data-line-number="847" href="#L847" id="L847">
847
</a>
<a class="file-line-num diff-line-num" data-line-number="848" href="#L848" id="L848">
848
</a>
<a class="file-line-num diff-line-num" data-line-number="849" href="#L849" id="L849">
849
</a>
<a class="file-line-num diff-line-num" data-line-number="850" href="#L850" id="L850">
850
</a>
<a class="file-line-num diff-line-num" data-line-number="851" href="#L851" id="L851">
851
</a>
<a class="file-line-num diff-line-num" data-line-number="852" href="#L852" id="L852">
852
</a>
<a class="file-line-num diff-line-num" data-line-number="853" href="#L853" id="L853">
853
</a>
<a class="file-line-num diff-line-num" data-line-number="854" href="#L854" id="L854">
854
</a>
<a class="file-line-num diff-line-num" data-line-number="855" href="#L855" id="L855">
855
</a>
<a class="file-line-num diff-line-num" data-line-number="856" href="#L856" id="L856">
856
</a>
<a class="file-line-num diff-line-num" data-line-number="857" href="#L857" id="L857">
857
</a>
<a class="file-line-num diff-line-num" data-line-number="858" href="#L858" id="L858">
858
</a>
<a class="file-line-num diff-line-num" data-line-number="859" href="#L859" id="L859">
859
</a>
<a class="file-line-num diff-line-num" data-line-number="860" href="#L860" id="L860">
860
</a>
<a class="file-line-num diff-line-num" data-line-number="861" href="#L861" id="L861">
861
</a>
<a class="file-line-num diff-line-num" data-line-number="862" href="#L862" id="L862">
862
</a>
<a class="file-line-num diff-line-num" data-line-number="863" href="#L863" id="L863">
863
</a>
<a class="file-line-num diff-line-num" data-line-number="864" href="#L864" id="L864">
864
</a>
<a class="file-line-num diff-line-num" data-line-number="865" href="#L865" id="L865">
865
</a>
<a class="file-line-num diff-line-num" data-line-number="866" href="#L866" id="L866">
866
</a>
<a class="file-line-num diff-line-num" data-line-number="867" href="#L867" id="L867">
867
</a>
<a class="file-line-num diff-line-num" data-line-number="868" href="#L868" id="L868">
868
</a>
<a class="file-line-num diff-line-num" data-line-number="869" href="#L869" id="L869">
869
</a>
<a class="file-line-num diff-line-num" data-line-number="870" href="#L870" id="L870">
870
</a>
<a class="file-line-num diff-line-num" data-line-number="871" href="#L871" id="L871">
871
</a>
<a class="file-line-num diff-line-num" data-line-number="872" href="#L872" id="L872">
872
</a>
<a class="file-line-num diff-line-num" data-line-number="873" href="#L873" id="L873">
873
</a>
<a class="file-line-num diff-line-num" data-line-number="874" href="#L874" id="L874">
874
</a>
<a class="file-line-num diff-line-num" data-line-number="875" href="#L875" id="L875">
875
</a>
<a class="file-line-num diff-line-num" data-line-number="876" href="#L876" id="L876">
876
</a>
<a class="file-line-num diff-line-num" data-line-number="877" href="#L877" id="L877">
877
</a>
<a class="file-line-num diff-line-num" data-line-number="878" href="#L878" id="L878">
878
</a>
<a class="file-line-num diff-line-num" data-line-number="879" href="#L879" id="L879">
879
</a>
<a class="file-line-num diff-line-num" data-line-number="880" href="#L880" id="L880">
880
</a>
<a class="file-line-num diff-line-num" data-line-number="881" href="#L881" id="L881">
881
</a>
<a class="file-line-num diff-line-num" data-line-number="882" href="#L882" id="L882">
882
</a>
<a class="file-line-num diff-line-num" data-line-number="883" href="#L883" id="L883">
883
</a>
<a class="file-line-num diff-line-num" data-line-number="884" href="#L884" id="L884">
884
</a>
<a class="file-line-num diff-line-num" data-line-number="885" href="#L885" id="L885">
885
</a>
<a class="file-line-num diff-line-num" data-line-number="886" href="#L886" id="L886">
886
</a>
<a class="file-line-num diff-line-num" data-line-number="887" href="#L887" id="L887">
887
</a>
<a class="file-line-num diff-line-num" data-line-number="888" href="#L888" id="L888">
888
</a>
<a class="file-line-num diff-line-num" data-line-number="889" href="#L889" id="L889">
889
</a>
<a class="file-line-num diff-line-num" data-line-number="890" href="#L890" id="L890">
890
</a>
<a class="file-line-num diff-line-num" data-line-number="891" href="#L891" id="L891">
891
</a>
<a class="file-line-num diff-line-num" data-line-number="892" href="#L892" id="L892">
892
</a>
<a class="file-line-num diff-line-num" data-line-number="893" href="#L893" id="L893">
893
</a>
<a class="file-line-num diff-line-num" data-line-number="894" href="#L894" id="L894">
894
</a>
<a class="file-line-num diff-line-num" data-line-number="895" href="#L895" id="L895">
895
</a>
<a class="file-line-num diff-line-num" data-line-number="896" href="#L896" id="L896">
896
</a>
<a class="file-line-num diff-line-num" data-line-number="897" href="#L897" id="L897">
897
</a>
<a class="file-line-num diff-line-num" data-line-number="898" href="#L898" id="L898">
898
</a>
<a class="file-line-num diff-line-num" data-line-number="899" href="#L899" id="L899">
899
</a>
<a class="file-line-num diff-line-num" data-line-number="900" href="#L900" id="L900">
900
</a>
<a class="file-line-num diff-line-num" data-line-number="901" href="#L901" id="L901">
901
</a>
<a class="file-line-num diff-line-num" data-line-number="902" href="#L902" id="L902">
902
</a>
<a class="file-line-num diff-line-num" data-line-number="903" href="#L903" id="L903">
903
</a>
<a class="file-line-num diff-line-num" data-line-number="904" href="#L904" id="L904">
904
</a>
<a class="file-line-num diff-line-num" data-line-number="905" href="#L905" id="L905">
905
</a>
<a class="file-line-num diff-line-num" data-line-number="906" href="#L906" id="L906">
906
</a>
<a class="file-line-num diff-line-num" data-line-number="907" href="#L907" id="L907">
907
</a>
<a class="file-line-num diff-line-num" data-line-number="908" href="#L908" id="L908">
908
</a>
<a class="file-line-num diff-line-num" data-line-number="909" href="#L909" id="L909">
909
</a>
<a class="file-line-num diff-line-num" data-line-number="910" href="#L910" id="L910">
910
</a>
<a class="file-line-num diff-line-num" data-line-number="911" href="#L911" id="L911">
911
</a>
<a class="file-line-num diff-line-num" data-line-number="912" href="#L912" id="L912">
912
</a>
<a class="file-line-num diff-line-num" data-line-number="913" href="#L913" id="L913">
913
</a>
<a class="file-line-num diff-line-num" data-line-number="914" href="#L914" id="L914">
914
</a>
<a class="file-line-num diff-line-num" data-line-number="915" href="#L915" id="L915">
915
</a>
<a class="file-line-num diff-line-num" data-line-number="916" href="#L916" id="L916">
916
</a>
<a class="file-line-num diff-line-num" data-line-number="917" href="#L917" id="L917">
917
</a>
<a class="file-line-num diff-line-num" data-line-number="918" href="#L918" id="L918">
918
</a>
<a class="file-line-num diff-line-num" data-line-number="919" href="#L919" id="L919">
919
</a>
<a class="file-line-num diff-line-num" data-line-number="920" href="#L920" id="L920">
920
</a>
<a class="file-line-num diff-line-num" data-line-number="921" href="#L921" id="L921">
921
</a>
<a class="file-line-num diff-line-num" data-line-number="922" href="#L922" id="L922">
922
</a>
<a class="file-line-num diff-line-num" data-line-number="923" href="#L923" id="L923">
923
</a>
<a class="file-line-num diff-line-num" data-line-number="924" href="#L924" id="L924">
924
</a>
<a class="file-line-num diff-line-num" data-line-number="925" href="#L925" id="L925">
925
</a>
<a class="file-line-num diff-line-num" data-line-number="926" href="#L926" id="L926">
926
</a>
<a class="file-line-num diff-line-num" data-line-number="927" href="#L927" id="L927">
927
</a>
<a class="file-line-num diff-line-num" data-line-number="928" href="#L928" id="L928">
928
</a>
<a class="file-line-num diff-line-num" data-line-number="929" href="#L929" id="L929">
929
</a>
<a class="file-line-num diff-line-num" data-line-number="930" href="#L930" id="L930">
930
</a>
<a class="file-line-num diff-line-num" data-line-number="931" href="#L931" id="L931">
931
</a>
<a class="file-line-num diff-line-num" data-line-number="932" href="#L932" id="L932">
932
</a>
<a class="file-line-num diff-line-num" data-line-number="933" href="#L933" id="L933">
933
</a>
<a class="file-line-num diff-line-num" data-line-number="934" href="#L934" id="L934">
934
</a>
<a class="file-line-num diff-line-num" data-line-number="935" href="#L935" id="L935">
935
</a>
<a class="file-line-num diff-line-num" data-line-number="936" href="#L936" id="L936">
936
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2007, 2018, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC5" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> * Copyright 1999-2005 The Apache Software Foundation.</span></span>
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
<span id="LC20" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.org.apache.xpath.internal.res</span><span class="o">;</span></span>
<span id="LC21" class="line" lang="java"></span>
<span id="LC22" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.ListResourceBundle</span><span class="o">;</span></span>
<span id="LC23" class="line" lang="java"></span>
<span id="LC24" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC25" class="line" lang="java"><span class="cm"> * Set up error messages.</span></span>
<span id="LC26" class="line" lang="java"><span class="cm"> * We build a two dimensional array of message keys and</span></span>
<span id="LC27" class="line" lang="java"><span class="cm"> * message strings. In order to add a new message here,</span></span>
<span id="LC28" class="line" lang="java"><span class="cm"> * you need to first add a Static string constant for the</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> * Key and update the contents array with Key, Value pair</span></span>
<span id="LC30" class="line" lang="java"><span class="cm">  * Also you need to  update the count of messages(MAX_CODE)or</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> * the count of warnings(MAX_WARNING) [ Information purpose only]</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> * @xsl.usage advanced</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC34" class="line" lang="java"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">XPATHErrorResources_sv</span> <span class="kd">extends</span> <span class="nc">ListResourceBundle</span></span>
<span id="LC35" class="line" lang="java"><span class="o">{</span></span>
<span id="LC36" class="line" lang="java"></span>
<span id="LC37" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * General notes to translators:</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * This file contains error and warning messages related to XPath Error</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * Handling.</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> *  1) Xalan (or more properly, Xalan-interpretive) and XSLTC are names of</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> *     components.</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> *     XSLT is an acronym for "XML Stylesheet Language: Transformations".</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> *     XSLTC is an acronym for XSLT Compiler.</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> *  2) A stylesheet is a description of how to transform an input XML document</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> *     into a resultant XML document (or HTML document or text).  The</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> *     stylesheet itself is described in the form of an XML document.</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> *  3) A template is a component of a stylesheet that is used to match a</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> *     particular portion of an input document and specifies the form of the</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> *     corresponding portion of the output document.</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> *  4) An element is a mark-up tag in an XML document; an attribute is a</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> *     modifier on the tag.  For example, in &lt;elem attr='val' attr2='val2'&gt;</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> *     "elem" is an element name, "attr" and "attr2" are attribute names with</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> *     the values "val" and "val2", respectively.</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> *  5) A namespace declaration is a special attribute that is used to associate</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> *     a prefix with a URI (the namespace).  The meanings of element names and</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> *     attribute names that use that prefix are defined with respect to that</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> *     namespace.</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> *  6) "Translet" is an invented term that describes the class file that</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> *     results from compiling an XML stylesheet into a Java class.</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> *  7) XPath is a specification that describes a notation for identifying</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> *     nodes in a tree-structured representation of an XML document.  An</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> *     instance of that notation is referred to as an XPath expression.</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> *  8) The context node is the node in the document with respect to which an</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> *     XPath expression is being evaluated.</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> *  9) An iterator is an object that traverses nodes in the tree, one at a time.</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> *  10) NCName is an XML term used to describe a name that does not contain a</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> *     colon (a "no-colon name").</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> *  11) QName is an XML term meaning "qualified name".</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC83" class="line" lang="java"></span>
<span id="LC84" class="line" lang="java">  <span class="cm">/*</span></span>
<span id="LC85" class="line" lang="java"><span class="cm">   * static variables</span></span>
<span id="LC86" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC87" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ERROR0000</span> <span class="o">=</span> <span class="s">"ERROR0000"</span><span class="o">;</span></span>
<span id="LC88" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CURRENT_NOT_ALLOWED_IN_MATCH</span> <span class="o">=</span></span>
<span id="LC89" class="line" lang="java">         <span class="s">"ER_CURRENT_NOT_ALLOWED_IN_MATCH"</span><span class="o">;</span></span>
<span id="LC90" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CURRENT_TAKES_NO_ARGS</span> <span class="o">=</span></span>
<span id="LC91" class="line" lang="java">         <span class="s">"ER_CURRENT_TAKES_NO_ARGS"</span><span class="o">;</span></span>
<span id="LC92" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_DOCUMENT_REPLACED</span> <span class="o">=</span> <span class="s">"ER_DOCUMENT_REPLACED"</span><span class="o">;</span></span>
<span id="LC93" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CONTEXT_HAS_NO_OWNERDOC</span> <span class="o">=</span></span>
<span id="LC94" class="line" lang="java">         <span class="s">"ER_CONTEXT_HAS_NO_OWNERDOC"</span><span class="o">;</span></span>
<span id="LC95" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_LOCALNAME_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC96" class="line" lang="java">         <span class="s">"ER_LOCALNAME_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC97" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NAMESPACEURI_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC98" class="line" lang="java">         <span class="s">"ER_NAMESPACEURI_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC99" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC100" class="line" lang="java">         <span class="s">"ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC101" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NUMBER_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC102" class="line" lang="java">         <span class="s">"ER_NUMBER_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC103" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NAME_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC104" class="line" lang="java">         <span class="s">"ER_NAME_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC105" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_STRING_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC106" class="line" lang="java">         <span class="s">"ER_STRING_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC107" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_STRINGLENGTH_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC108" class="line" lang="java">         <span class="s">"ER_STRINGLENGTH_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC109" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_TRANSLATE_TAKES_3_ARGS</span> <span class="o">=</span></span>
<span id="LC110" class="line" lang="java">         <span class="s">"ER_TRANSLATE_TAKES_3_ARGS"</span><span class="o">;</span></span>
<span id="LC111" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNPARSEDENTITYURI_TAKES_1_ARG</span> <span class="o">=</span></span>
<span id="LC112" class="line" lang="java">         <span class="s">"ER_UNPARSEDENTITYURI_TAKES_1_ARG"</span><span class="o">;</span></span>
<span id="LC113" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NAMESPACEAXIS_NOT_IMPLEMENTED</span> <span class="o">=</span></span>
<span id="LC114" class="line" lang="java">         <span class="s">"ER_NAMESPACEAXIS_NOT_IMPLEMENTED"</span><span class="o">;</span></span>
<span id="LC115" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNKNOWN_AXIS</span> <span class="o">=</span> <span class="s">"ER_UNKNOWN_AXIS"</span><span class="o">;</span></span>
<span id="LC116" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNKNOWN_MATCH_OPERATION</span> <span class="o">=</span></span>
<span id="LC117" class="line" lang="java">         <span class="s">"ER_UNKNOWN_MATCH_OPERATION"</span><span class="o">;</span></span>
<span id="LC118" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_INCORRECT_ARG_LENGTH</span> <span class="o">=</span><span class="s">"ER_INCORRECT_ARG_LENGTH"</span><span class="o">;</span></span>
<span id="LC119" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_NUMBER</span> <span class="o">=</span></span>
<span id="LC120" class="line" lang="java">         <span class="s">"ER_CANT_CONVERT_TO_NUMBER"</span><span class="o">;</span></span>
<span id="LC121" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER</span> <span class="o">=</span></span>
<span id="LC122" class="line" lang="java">           <span class="s">"ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER"</span><span class="o">;</span></span>
<span id="LC123" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_NODELIST</span> <span class="o">=</span></span>
<span id="LC124" class="line" lang="java">         <span class="s">"ER_CANT_CONVERT_TO_NODELIST"</span><span class="o">;</span></span>
<span id="LC125" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_MUTABLENODELIST</span> <span class="o">=</span></span>
<span id="LC126" class="line" lang="java">         <span class="s">"ER_CANT_CONVERT_TO_MUTABLENODELIST"</span><span class="o">;</span></span>
<span id="LC127" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_TYPE</span> <span class="o">=</span><span class="s">"ER_CANT_CONVERT_TO_TYPE"</span><span class="o">;</span></span>
<span id="LC128" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_MATCH_PATTERN</span> <span class="o">=</span></span>
<span id="LC129" class="line" lang="java">         <span class="s">"ER_EXPECTED_MATCH_PATTERN"</span><span class="o">;</span></span>
<span id="LC130" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COULDNOT_GET_VAR_NAMED</span> <span class="o">=</span></span>
<span id="LC131" class="line" lang="java">         <span class="s">"ER_COULDNOT_GET_VAR_NAMED"</span><span class="o">;</span></span>
<span id="LC132" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNKNOWN_OPCODE</span> <span class="o">=</span> <span class="s">"ER_UNKNOWN_OPCODE"</span><span class="o">;</span></span>
<span id="LC133" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXTRA_ILLEGAL_TOKENS</span> <span class="o">=</span><span class="s">"ER_EXTRA_ILLEGAL_TOKENS"</span><span class="o">;</span></span>
<span id="LC134" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_DOUBLE_QUOTE</span> <span class="o">=</span></span>
<span id="LC135" class="line" lang="java">         <span class="s">"ER_EXPECTED_DOUBLE_QUOTE"</span><span class="o">;</span></span>
<span id="LC136" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_SINGLE_QUOTE</span> <span class="o">=</span></span>
<span id="LC137" class="line" lang="java">         <span class="s">"ER_EXPECTED_SINGLE_QUOTE"</span><span class="o">;</span></span>
<span id="LC138" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EMPTY_EXPRESSION</span> <span class="o">=</span> <span class="s">"ER_EMPTY_EXPRESSION"</span><span class="o">;</span></span>
<span id="LC139" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_BUT_FOUND</span> <span class="o">=</span> <span class="s">"ER_EXPECTED_BUT_FOUND"</span><span class="o">;</span></span>
<span id="LC140" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_INCORRECT_PROGRAMMER_ASSERTION</span> <span class="o">=</span></span>
<span id="LC141" class="line" lang="java">         <span class="s">"ER_INCORRECT_PROGRAMMER_ASSERTION"</span><span class="o">;</span></span>
<span id="LC142" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL</span> <span class="o">=</span></span>
<span id="LC143" class="line" lang="java">         <span class="s">"ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL"</span><span class="o">;</span></span>
<span id="LC144" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG</span> <span class="o">=</span></span>
<span id="LC145" class="line" lang="java">         <span class="s">"ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG"</span><span class="o">;</span></span>
<span id="LC146" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG</span> <span class="o">=</span></span>
<span id="LC147" class="line" lang="java">         <span class="s">"ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG"</span><span class="o">;</span></span>
<span id="LC148" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_PREDICATE_ILLEGAL_SYNTAX</span> <span class="o">=</span></span>
<span id="LC149" class="line" lang="java">         <span class="s">"ER_PREDICATE_ILLEGAL_SYNTAX"</span><span class="o">;</span></span>
<span id="LC150" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ILLEGAL_AXIS_NAME</span> <span class="o">=</span> <span class="s">"ER_ILLEGAL_AXIS_NAME"</span><span class="o">;</span></span>
<span id="LC151" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNKNOWN_NODETYPE</span> <span class="o">=</span> <span class="s">"ER_UNKNOWN_NODETYPE"</span><span class="o">;</span></span>
<span id="LC152" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_PATTERN_LITERAL_NEEDS_BE_QUOTED</span> <span class="o">=</span></span>
<span id="LC153" class="line" lang="java">         <span class="s">"ER_PATTERN_LITERAL_NEEDS_BE_QUOTED"</span><span class="o">;</span></span>
<span id="LC154" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COULDNOT_BE_FORMATTED_TO_NUMBER</span> <span class="o">=</span></span>
<span id="LC155" class="line" lang="java">         <span class="s">"ER_COULDNOT_BE_FORMATTED_TO_NUMBER"</span><span class="o">;</span></span>
<span id="LC156" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COULDNOT_CREATE_XMLPROCESSORLIAISON</span> <span class="o">=</span></span>
<span id="LC157" class="line" lang="java">         <span class="s">"ER_COULDNOT_CREATE_XMLPROCESSORLIAISON"</span><span class="o">;</span></span>
<span id="LC158" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_DIDNOT_FIND_XPATH_SELECT_EXP</span> <span class="o">=</span></span>
<span id="LC159" class="line" lang="java">         <span class="s">"ER_DIDNOT_FIND_XPATH_SELECT_EXP"</span><span class="o">;</span></span>
<span id="LC160" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH</span> <span class="o">=</span></span>
<span id="LC161" class="line" lang="java">         <span class="s">"ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH"</span><span class="o">;</span></span>
<span id="LC162" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ERROR_OCCURED</span> <span class="o">=</span> <span class="s">"ER_ERROR_OCCURED"</span><span class="o">;</span></span>
<span id="LC163" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ILLEGAL_VARIABLE_REFERENCE</span> <span class="o">=</span></span>
<span id="LC164" class="line" lang="java">         <span class="s">"ER_ILLEGAL_VARIABLE_REFERENCE"</span><span class="o">;</span></span>
<span id="LC165" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_AXES_NOT_ALLOWED</span> <span class="o">=</span> <span class="s">"ER_AXES_NOT_ALLOWED"</span><span class="o">;</span></span>
<span id="LC166" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_KEY_HAS_TOO_MANY_ARGS</span> <span class="o">=</span></span>
<span id="LC167" class="line" lang="java">         <span class="s">"ER_KEY_HAS_TOO_MANY_ARGS"</span><span class="o">;</span></span>
<span id="LC168" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COUNT_TAKES_1_ARG</span> <span class="o">=</span> <span class="s">"ER_COUNT_TAKES_1_ARG"</span><span class="o">;</span></span>
<span id="LC169" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COULDNOT_FIND_FUNCTION</span> <span class="o">=</span></span>
<span id="LC170" class="line" lang="java">         <span class="s">"ER_COULDNOT_FIND_FUNCTION"</span><span class="o">;</span></span>
<span id="LC171" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNSUPPORTED_ENCODING</span> <span class="o">=</span><span class="s">"ER_UNSUPPORTED_ENCODING"</span><span class="o">;</span></span>
<span id="LC172" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_PROBLEM_IN_DTM_NEXTSIBLING</span> <span class="o">=</span></span>
<span id="LC173" class="line" lang="java">         <span class="s">"ER_PROBLEM_IN_DTM_NEXTSIBLING"</span><span class="o">;</span></span>
<span id="LC174" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL</span> <span class="o">=</span></span>
<span id="LC175" class="line" lang="java">         <span class="s">"ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL"</span><span class="o">;</span></span>
<span id="LC176" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_SETDOMFACTORY_NOT_SUPPORTED</span> <span class="o">=</span></span>
<span id="LC177" class="line" lang="java">         <span class="s">"ER_SETDOMFACTORY_NOT_SUPPORTED"</span><span class="o">;</span></span>
<span id="LC178" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_PREFIX_MUST_RESOLVE</span> <span class="o">=</span> <span class="s">"ER_PREFIX_MUST_RESOLVE"</span><span class="o">;</span></span>
<span id="LC179" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_PARSE_NOT_SUPPORTED</span> <span class="o">=</span> <span class="s">"ER_PARSE_NOT_SUPPORTED"</span><span class="o">;</span></span>
<span id="LC180" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_SAX_API_NOT_HANDLED</span> <span class="o">=</span> <span class="s">"ER_SAX_API_NOT_HANDLED"</span><span class="o">;</span></span>
<span id="LC181" class="line" lang="java"><span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_IGNORABLE_WHITESPACE_NOT_HANDLED</span> <span class="o">=</span></span>
<span id="LC182" class="line" lang="java">         <span class="s">"ER_IGNORABLE_WHITESPACE_NOT_HANDLED"</span><span class="o">;</span></span>
<span id="LC183" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_DTM_CANNOT_HANDLE_NODES</span> <span class="o">=</span></span>
<span id="LC184" class="line" lang="java">         <span class="s">"ER_DTM_CANNOT_HANDLE_NODES"</span><span class="o">;</span></span>
<span id="LC185" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XERCES_CANNOT_HANDLE_NODES</span> <span class="o">=</span></span>
<span id="LC186" class="line" lang="java">         <span class="s">"ER_XERCES_CANNOT_HANDLE_NODES"</span><span class="o">;</span></span>
<span id="LC187" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XERCES_PARSE_ERROR_DETAILS</span> <span class="o">=</span></span>
<span id="LC188" class="line" lang="java">         <span class="s">"ER_XERCES_PARSE_ERROR_DETAILS"</span><span class="o">;</span></span>
<span id="LC189" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XERCES_PARSE_ERROR</span> <span class="o">=</span> <span class="s">"ER_XERCES_PARSE_ERROR"</span><span class="o">;</span></span>
<span id="LC190" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_INVALID_UTF16_SURROGATE</span> <span class="o">=</span></span>
<span id="LC191" class="line" lang="java">         <span class="s">"ER_INVALID_UTF16_SURROGATE"</span><span class="o">;</span></span>
<span id="LC192" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_OIERROR</span> <span class="o">=</span> <span class="s">"ER_OIERROR"</span><span class="o">;</span></span>
<span id="LC193" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANNOT_CREATE_URL</span> <span class="o">=</span> <span class="s">"ER_CANNOT_CREATE_URL"</span><span class="o">;</span></span>
<span id="LC194" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XPATH_READOBJECT</span> <span class="o">=</span> <span class="s">"ER_XPATH_READOBJECT"</span><span class="o">;</span></span>
<span id="LC195" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FUNCTION_TOKEN_NOT_FOUND</span> <span class="o">=</span></span>
<span id="LC196" class="line" lang="java">         <span class="s">"ER_FUNCTION_TOKEN_NOT_FOUND"</span><span class="o">;</span></span>
<span id="LC197" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANNOT_DEAL_XPATH_TYPE</span> <span class="o">=</span></span>
<span id="LC198" class="line" lang="java">         <span class="s">"ER_CANNOT_DEAL_XPATH_TYPE"</span><span class="o">;</span></span>
<span id="LC199" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NODESET_NOT_MUTABLE</span> <span class="o">=</span> <span class="s">"ER_NODESET_NOT_MUTABLE"</span><span class="o">;</span></span>
<span id="LC200" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NODESETDTM_NOT_MUTABLE</span> <span class="o">=</span></span>
<span id="LC201" class="line" lang="java">         <span class="s">"ER_NODESETDTM_NOT_MUTABLE"</span><span class="o">;</span></span>
<span id="LC202" class="line" lang="java">   <span class="cm">/**  Variable not resolvable:   */</span></span>
<span id="LC203" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_VAR_NOT_RESOLVABLE</span> <span class="o">=</span> <span class="s">"ER_VAR_NOT_RESOLVABLE"</span><span class="o">;</span></span>
<span id="LC204" class="line" lang="java">   <span class="cm">/** Null error handler  */</span></span>
<span id="LC205" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NULL_ERROR_HANDLER</span> <span class="o">=</span> <span class="s">"ER_NULL_ERROR_HANDLER"</span><span class="o">;</span></span>
<span id="LC206" class="line" lang="java">   <span class="cm">/**  Programmer's assertion: unknown opcode  */</span></span>
<span id="LC207" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_PROG_ASSERT_UNKNOWN_OPCODE</span> <span class="o">=</span></span>
<span id="LC208" class="line" lang="java">         <span class="s">"ER_PROG_ASSERT_UNKNOWN_OPCODE"</span><span class="o">;</span></span>
<span id="LC209" class="line" lang="java">   <span class="cm">/**  0 or 1   */</span></span>
<span id="LC210" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ZERO_OR_ONE</span> <span class="o">=</span> <span class="s">"ER_ZERO_OR_ONE"</span><span class="o">;</span></span>
<span id="LC211" class="line" lang="java">   <span class="cm">/**  rtf() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC212" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span> <span class="o">=</span></span>
<span id="LC213" class="line" lang="java">         <span class="s">"ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"</span><span class="o">;</span></span>
<span id="LC214" class="line" lang="java">   <span class="cm">/**  asNodeIterator() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC215" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span> <span class="o">=</span> <span class="s">"ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"</span><span class="o">;</span></span>
<span id="LC216" class="line" lang="java">   <span class="cm">/**  fsb() not supported for XStringForChars   */</span></span>
<span id="LC217" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS</span> <span class="o">=</span></span>
<span id="LC218" class="line" lang="java">         <span class="s">"ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS"</span><span class="o">;</span></span>
<span id="LC219" class="line" lang="java">   <span class="cm">/**  Could not find variable with the name of   */</span></span>
<span id="LC220" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_COULD_NOT_FIND_VAR</span> <span class="o">=</span> <span class="s">"ER_COULD_NOT_FIND_VAR"</span><span class="o">;</span></span>
<span id="LC221" class="line" lang="java">   <span class="cm">/**  XStringForChars can not take a string for an argument   */</span></span>
<span id="LC222" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING</span> <span class="o">=</span></span>
<span id="LC223" class="line" lang="java">         <span class="s">"ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING"</span><span class="o">;</span></span>
<span id="LC224" class="line" lang="java">   <span class="cm">/**  The FastStringBuffer argument can not be null   */</span></span>
<span id="LC225" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FASTSTRINGBUFFER_CANNOT_BE_NULL</span> <span class="o">=</span></span>
<span id="LC226" class="line" lang="java">         <span class="s">"ER_FASTSTRINGBUFFER_CANNOT_BE_NULL"</span><span class="o">;</span></span>
<span id="LC227" class="line" lang="java">   <span class="cm">/**  2 or 3   */</span></span>
<span id="LC228" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_TWO_OR_THREE</span> <span class="o">=</span> <span class="s">"ER_TWO_OR_THREE"</span><span class="o">;</span></span>
<span id="LC229" class="line" lang="java">   <span class="cm">/** Variable accessed before it is bound! */</span></span>
<span id="LC230" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_VARIABLE_ACCESSED_BEFORE_BIND</span> <span class="o">=</span></span>
<span id="LC231" class="line" lang="java">         <span class="s">"ER_VARIABLE_ACCESSED_BEFORE_BIND"</span><span class="o">;</span></span>
<span id="LC232" class="line" lang="java">   <span class="cm">/** XStringForFSB can not take a string for an argument! */</span></span>
<span id="LC233" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FSB_CANNOT_TAKE_STRING</span> <span class="o">=</span></span>
<span id="LC234" class="line" lang="java">         <span class="s">"ER_FSB_CANNOT_TAKE_STRING"</span><span class="o">;</span></span>
<span id="LC235" class="line" lang="java">   <span class="cm">/** Error! Setting the root of a walker to null! */</span></span>
<span id="LC236" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_SETTING_WALKER_ROOT_TO_NULL</span> <span class="o">=</span></span>
<span id="LC237" class="line" lang="java">         <span class="s">"ER_SETTING_WALKER_ROOT_TO_NULL"</span><span class="o">;</span></span>
<span id="LC238" class="line" lang="java">   <span class="cm">/** This NodeSetDTM can not iterate to a previous node! */</span></span>
<span id="LC239" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NODESETDTM_CANNOT_ITERATE</span> <span class="o">=</span></span>
<span id="LC240" class="line" lang="java">         <span class="s">"ER_NODESETDTM_CANNOT_ITERATE"</span><span class="o">;</span></span>
<span id="LC241" class="line" lang="java">  <span class="cm">/** This NodeSet can not iterate to a previous node! */</span></span>
<span id="LC242" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NODESET_CANNOT_ITERATE</span> <span class="o">=</span></span>
<span id="LC243" class="line" lang="java">         <span class="s">"ER_NODESET_CANNOT_ITERATE"</span><span class="o">;</span></span>
<span id="LC244" class="line" lang="java">  <span class="cm">/** This NodeSetDTM can not do indexing or counting functions! */</span></span>
<span id="LC245" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NODESETDTM_CANNOT_INDEX</span> <span class="o">=</span></span>
<span id="LC246" class="line" lang="java">         <span class="s">"ER_NODESETDTM_CANNOT_INDEX"</span><span class="o">;</span></span>
<span id="LC247" class="line" lang="java">  <span class="cm">/** This NodeSet can not do indexing or counting functions! */</span></span>
<span id="LC248" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NODESET_CANNOT_INDEX</span> <span class="o">=</span></span>
<span id="LC249" class="line" lang="java">         <span class="s">"ER_NODESET_CANNOT_INDEX"</span><span class="o">;</span></span>
<span id="LC250" class="line" lang="java">  <span class="cm">/** Can not call setShouldCacheNodes after nextNode has been called! */</span></span>
<span id="LC251" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANNOT_CALL_SETSHOULDCACHENODE</span> <span class="o">=</span></span>
<span id="LC252" class="line" lang="java">         <span class="s">"ER_CANNOT_CALL_SETSHOULDCACHENODE"</span><span class="o">;</span></span>
<span id="LC253" class="line" lang="java">  <span class="cm">/** {0} only allows {1} arguments */</span></span>
<span id="LC254" class="line" lang="java"> <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ONLY_ALLOWS</span> <span class="o">=</span> <span class="s">"ER_ONLY_ALLOWS"</span><span class="o">;</span></span>
<span id="LC255" class="line" lang="java">  <span class="cm">/** Programmer's assertion in getNextStepPos: unknown stepType: {0} */</span></span>
<span id="LC256" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNKNOWN_STEP</span> <span class="o">=</span> <span class="s">"ER_UNKNOWN_STEP"</span><span class="o">;</span></span>
<span id="LC257" class="line" lang="java">  <span class="cm">/** Problem with RelativeLocationPath */</span></span>
<span id="LC258" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_REL_LOC_PATH</span> <span class="o">=</span></span>
<span id="LC259" class="line" lang="java">         <span class="s">"ER_EXPECTED_REL_LOC_PATH"</span><span class="o">;</span></span>
<span id="LC260" class="line" lang="java">  <span class="cm">/** Problem with LocationPath */</span></span>
<span id="LC261" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_LOC_PATH</span> <span class="o">=</span> <span class="s">"ER_EXPECTED_LOC_PATH"</span><span class="o">;</span></span>
<span id="LC262" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_LOC_PATH_AT_END_EXPR</span> <span class="o">=</span></span>
<span id="LC263" class="line" lang="java">                                        <span class="s">"ER_EXPECTED_LOC_PATH_AT_END_EXPR"</span><span class="o">;</span></span>
<span id="LC264" class="line" lang="java">  <span class="cm">/** Problem with Step */</span></span>
<span id="LC265" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_LOC_STEP</span> <span class="o">=</span> <span class="s">"ER_EXPECTED_LOC_STEP"</span><span class="o">;</span></span>
<span id="LC266" class="line" lang="java">  <span class="cm">/** Problem with NodeTest */</span></span>
<span id="LC267" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_NODE_TEST</span> <span class="o">=</span> <span class="s">"ER_EXPECTED_NODE_TEST"</span><span class="o">;</span></span>
<span id="LC268" class="line" lang="java">  <span class="cm">/** Expected step pattern */</span></span>
<span id="LC269" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_STEP_PATTERN</span> <span class="o">=</span></span>
<span id="LC270" class="line" lang="java">        <span class="s">"ER_EXPECTED_STEP_PATTERN"</span><span class="o">;</span></span>
<span id="LC271" class="line" lang="java">  <span class="cm">/** Expected relative path pattern */</span></span>
<span id="LC272" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXPECTED_REL_PATH_PATTERN</span> <span class="o">=</span></span>
<span id="LC273" class="line" lang="java">         <span class="s">"ER_EXPECTED_REL_PATH_PATTERN"</span><span class="o">;</span></span>
<span id="LC274" class="line" lang="java">  <span class="cm">/** ER_CANT_CONVERT_XPATHRESULTTYPE_TO_BOOLEAN          */</span></span>
<span id="LC275" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_BOOLEAN</span> <span class="o">=</span></span>
<span id="LC276" class="line" lang="java">         <span class="s">"ER_CANT_CONVERT_TO_BOOLEAN"</span><span class="o">;</span></span>
<span id="LC277" class="line" lang="java">  <span class="cm">/** Field ER_CANT_CONVERT_TO_SINGLENODE       */</span></span>
<span id="LC278" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_SINGLENODE</span> <span class="o">=</span></span>
<span id="LC279" class="line" lang="java">         <span class="s">"ER_CANT_CONVERT_TO_SINGLENODE"</span><span class="o">;</span></span>
<span id="LC280" class="line" lang="java">  <span class="cm">/** Field ER_CANT_GET_SNAPSHOT_LENGTH         */</span></span>
<span id="LC281" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_GET_SNAPSHOT_LENGTH</span> <span class="o">=</span></span>
<span id="LC282" class="line" lang="java">         <span class="s">"ER_CANT_GET_SNAPSHOT_LENGTH"</span><span class="o">;</span></span>
<span id="LC283" class="line" lang="java">  <span class="cm">/** Field ER_NON_ITERATOR_TYPE                */</span></span>
<span id="LC284" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NON_ITERATOR_TYPE</span> <span class="o">=</span> <span class="s">"ER_NON_ITERATOR_TYPE"</span><span class="o">;</span></span>
<span id="LC285" class="line" lang="java">  <span class="cm">/** Field ER_DOC_MUTATED                      */</span></span>
<span id="LC286" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_DOC_MUTATED</span> <span class="o">=</span> <span class="s">"ER_DOC_MUTATED"</span><span class="o">;</span></span>
<span id="LC287" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_INVALID_XPATH_TYPE</span> <span class="o">=</span> <span class="s">"ER_INVALID_XPATH_TYPE"</span><span class="o">;</span></span>
<span id="LC288" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EMPTY_XPATH_RESULT</span> <span class="o">=</span> <span class="s">"ER_EMPTY_XPATH_RESULT"</span><span class="o">;</span></span>
<span id="LC289" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_INCOMPATIBLE_TYPES</span> <span class="o">=</span> <span class="s">"ER_INCOMPATIBLE_TYPES"</span><span class="o">;</span></span>
<span id="LC290" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NULL_RESOLVER</span> <span class="o">=</span> <span class="s">"ER_NULL_RESOLVER"</span><span class="o">;</span></span>
<span id="LC291" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_CANT_CONVERT_TO_STRING</span> <span class="o">=</span></span>
<span id="LC292" class="line" lang="java">         <span class="s">"ER_CANT_CONVERT_TO_STRING"</span><span class="o">;</span></span>
<span id="LC293" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NON_SNAPSHOT_TYPE</span> <span class="o">=</span> <span class="s">"ER_NON_SNAPSHOT_TYPE"</span><span class="o">;</span></span>
<span id="LC294" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_WRONG_DOCUMENT</span> <span class="o">=</span> <span class="s">"ER_WRONG_DOCUMENT"</span><span class="o">;</span></span>
<span id="LC295" class="line" lang="java">  <span class="cm">/* Note to translators:  The XPath expression cannot be evaluated with respect</span></span>
<span id="LC296" class="line" lang="java"><span class="cm">   * to this type of node.</span></span>
<span id="LC297" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC298" class="line" lang="java">  <span class="cm">/** Field ER_WRONG_NODETYPE                    */</span></span>
<span id="LC299" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_WRONG_NODETYPE</span> <span class="o">=</span> <span class="s">"ER_WRONG_NODETYPE"</span><span class="o">;</span></span>
<span id="LC300" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XPATH_ERROR</span> <span class="o">=</span> <span class="s">"ER_XPATH_ERROR"</span><span class="o">;</span></span>
<span id="LC301" class="line" lang="java"></span>
<span id="LC302" class="line" lang="java">  <span class="c1">//BEGIN: Keys needed for exception messages of  JAXP 1.3 XPath API implementation</span></span>
<span id="LC303" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED</span> <span class="o">=</span> <span class="s">"ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED"</span><span class="o">;</span></span>
<span id="LC304" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_RESOLVE_VARIABLE_RETURNS_NULL</span> <span class="o">=</span> <span class="s">"ER_RESOLVE_VARIABLE_RETURNS_NULL"</span><span class="o">;</span></span>
<span id="LC305" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_UNSUPPORTED_RETURN_TYPE</span> <span class="o">=</span> <span class="s">"ER_UNSUPPORTED_RETURN_TYPE"</span><span class="o">;</span></span>
<span id="LC306" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL</span> <span class="o">=</span> <span class="s">"ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL"</span><span class="o">;</span></span>
<span id="LC307" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_ARG_CANNOT_BE_NULL</span> <span class="o">=</span> <span class="s">"ER_ARG_CANNOT_BE_NULL"</span><span class="o">;</span></span>
<span id="LC308" class="line" lang="java"></span>
<span id="LC309" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_OBJECT_MODEL_NULL</span> <span class="o">=</span> <span class="s">"ER_OBJECT_MODEL_NULL"</span><span class="o">;</span></span>
<span id="LC310" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_OBJECT_MODEL_EMPTY</span> <span class="o">=</span> <span class="s">"ER_OBJECT_MODEL_EMPTY"</span><span class="o">;</span></span>
<span id="LC311" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FEATURE_NAME_NULL</span> <span class="o">=</span> <span class="s">"ER_FEATURE_NAME_NULL"</span><span class="o">;</span></span>
<span id="LC312" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_FEATURE_UNKNOWN</span> <span class="o">=</span> <span class="s">"ER_FEATURE_UNKNOWN"</span><span class="o">;</span></span>
<span id="LC313" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_GETTING_NULL_FEATURE</span> <span class="o">=</span> <span class="s">"ER_GETTING_NULL_FEATURE"</span><span class="o">;</span></span>
<span id="LC314" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_GETTING_UNKNOWN_FEATURE</span> <span class="o">=</span> <span class="s">"ER_GETTING_UNKNOWN_FEATURE"</span><span class="o">;</span></span>
<span id="LC315" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_SECUREPROCESSING_FEATURE</span> <span class="o">=</span> <span class="s">"ER_SECUREPROCESSING_FEATURE"</span><span class="o">;</span></span>
<span id="LC316" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NULL_XPATH_FUNCTION_RESOLVER</span> <span class="o">=</span> <span class="s">"ER_NULL_XPATH_FUNCTION_RESOLVER"</span><span class="o">;</span></span>
<span id="LC317" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NULL_XPATH_VARIABLE_RESOLVER</span> <span class="o">=</span> <span class="s">"ER_NULL_XPATH_VARIABLE_RESOLVER"</span><span class="o">;</span></span>
<span id="LC318" class="line" lang="java">  <span class="c1">//END: Keys needed for exception messages of  JAXP 1.3 XPath API implementation</span></span>
<span id="LC319" class="line" lang="java"></span>
<span id="LC320" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_LOCALE_NAME_NOT_HANDLED</span> <span class="o">=</span></span>
<span id="LC321" class="line" lang="java">         <span class="s">"WG_LOCALE_NAME_NOT_HANDLED"</span><span class="o">;</span></span>
<span id="LC322" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_PROPERTY_NOT_SUPPORTED</span> <span class="o">=</span></span>
<span id="LC323" class="line" lang="java">         <span class="s">"WG_PROPERTY_NOT_SUPPORTED"</span><span class="o">;</span></span>
<span id="LC324" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_DONT_DO_ANYTHING_WITH_NS</span> <span class="o">=</span></span>
<span id="LC325" class="line" lang="java">         <span class="s">"WG_DONT_DO_ANYTHING_WITH_NS"</span><span class="o">;</span></span>
<span id="LC326" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_SECURITY_EXCEPTION</span> <span class="o">=</span> <span class="s">"WG_SECURITY_EXCEPTION"</span><span class="o">;</span></span>
<span id="LC327" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_QUO_NO_LONGER_DEFINED</span> <span class="o">=</span></span>
<span id="LC328" class="line" lang="java">         <span class="s">"WG_QUO_NO_LONGER_DEFINED"</span><span class="o">;</span></span>
<span id="LC329" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST</span> <span class="o">=</span></span>
<span id="LC330" class="line" lang="java">         <span class="s">"WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST"</span><span class="o">;</span></span>
<span id="LC331" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_FUNCTION_TOKEN_NOT_FOUND</span> <span class="o">=</span></span>
<span id="LC332" class="line" lang="java">         <span class="s">"WG_FUNCTION_TOKEN_NOT_FOUND"</span><span class="o">;</span></span>
<span id="LC333" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_COULDNOT_FIND_FUNCTION</span> <span class="o">=</span></span>
<span id="LC334" class="line" lang="java">         <span class="s">"WG_COULDNOT_FIND_FUNCTION"</span><span class="o">;</span></span>
<span id="LC335" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_CANNOT_MAKE_URL_FROM</span> <span class="o">=</span><span class="s">"WG_CANNOT_MAKE_URL_FROM"</span><span class="o">;</span></span>
<span id="LC336" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_EXPAND_ENTITIES_NOT_SUPPORTED</span> <span class="o">=</span></span>
<span id="LC337" class="line" lang="java">         <span class="s">"WG_EXPAND_ENTITIES_NOT_SUPPORTED"</span><span class="o">;</span></span>
<span id="LC338" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_ILLEGAL_VARIABLE_REFERENCE</span> <span class="o">=</span></span>
<span id="LC339" class="line" lang="java">         <span class="s">"WG_ILLEGAL_VARIABLE_REFERENCE"</span><span class="o">;</span></span>
<span id="LC340" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WG_UNSUPPORTED_ENCODING</span> <span class="o">=</span><span class="s">"WG_UNSUPPORTED_ENCODING"</span><span class="o">;</span></span>
<span id="LC341" class="line" lang="java"></span>
<span id="LC342" class="line" lang="java">  <span class="cm">/**  detach() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC343" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span> <span class="o">=</span></span>
<span id="LC344" class="line" lang="java">         <span class="s">"ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"</span><span class="o">;</span></span>
<span id="LC345" class="line" lang="java">  <span class="cm">/**  num() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC346" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span> <span class="o">=</span></span>
<span id="LC347" class="line" lang="java">         <span class="s">"ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"</span><span class="o">;</span></span>
<span id="LC348" class="line" lang="java">  <span class="cm">/**  xstr() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC349" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span> <span class="o">=</span></span>
<span id="LC350" class="line" lang="java">         <span class="s">"ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"</span><span class="o">;</span></span>
<span id="LC351" class="line" lang="java">  <span class="cm">/**  str() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC352" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span> <span class="o">=</span></span>
<span id="LC353" class="line" lang="java">         <span class="s">"ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER"</span><span class="o">;</span></span>
<span id="LC354" class="line" lang="java"></span>
<span id="LC355" class="line" lang="java">  <span class="c1">// Error messages...</span></span>
<span id="LC356" class="line" lang="java"></span>
<span id="LC357" class="line" lang="java">  <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">Object</span><span class="o">[][]</span> <span class="n">_contents</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">Object</span><span class="o">[][]{</span></span>
<span id="LC358" class="line" lang="java"></span>
<span id="LC359" class="line" lang="java">  <span class="o">{</span> <span class="s">"ERROR0000"</span> <span class="o">,</span> <span class="s">"{0}"</span> <span class="o">},</span></span>
<span id="LC360" class="line" lang="java"></span>
<span id="LC361" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CURRENT_NOT_ALLOWED_IN_MATCH</span><span class="o">,</span> <span class="s">"Funktionen current() \u00E4r inte till\u00E5ten i ett matchningsm\u00F6nster!"</span> <span class="o">},</span></span>
<span id="LC362" class="line" lang="java"></span>
<span id="LC363" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CURRENT_TAKES_NO_ARGS</span><span class="o">,</span> <span class="s">"Funktionen current() tar inte emot argument!"</span> <span class="o">},</span></span>
<span id="LC364" class="line" lang="java"></span>
<span id="LC365" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_DOCUMENT_REPLACED</span><span class="o">,</span></span>
<span id="LC366" class="line" lang="java">      <span class="s">"Implementeringen av funktionen document() har inte ersatts av com.sun.org.apache.xalan.internal.xslt.FuncDocument!"</span><span class="o">},</span></span>
<span id="LC367" class="line" lang="java"></span>
<span id="LC368" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CONTEXT_HAS_NO_OWNERDOC</span><span class="o">,</span></span>
<span id="LC369" class="line" lang="java">      <span class="s">"context har inget \u00E4gardokument!"</span><span class="o">},</span></span>
<span id="LC370" class="line" lang="java"></span>
<span id="LC371" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_LOCALNAME_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC372" class="line" lang="java">      <span class="s">"local-name() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC373" class="line" lang="java"></span>
<span id="LC374" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NAMESPACEURI_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC375" class="line" lang="java">      <span class="s">"namespace-uri() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC376" class="line" lang="java"></span>
<span id="LC377" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC378" class="line" lang="java">      <span class="s">"normalize-space() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC379" class="line" lang="java"></span>
<span id="LC380" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NUMBER_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC381" class="line" lang="java">      <span class="s">"number() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC382" class="line" lang="java"></span>
<span id="LC383" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NAME_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC384" class="line" lang="java">     <span class="s">"name() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC385" class="line" lang="java"></span>
<span id="LC386" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_STRING_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC387" class="line" lang="java">      <span class="s">"string() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC388" class="line" lang="java"></span>
<span id="LC389" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_STRINGLENGTH_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC390" class="line" lang="java">      <span class="s">"string-length() har f\u00F6r m\u00E5nga argument."</span><span class="o">},</span></span>
<span id="LC391" class="line" lang="java"></span>
<span id="LC392" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_TRANSLATE_TAKES_3_ARGS</span><span class="o">,</span></span>
<span id="LC393" class="line" lang="java">      <span class="s">"Funktionen translate() tar emot tre argument!"</span><span class="o">},</span></span>
<span id="LC394" class="line" lang="java"></span>
<span id="LC395" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNPARSEDENTITYURI_TAKES_1_ARG</span><span class="o">,</span></span>
<span id="LC396" class="line" lang="java">      <span class="s">"Funktionen unparsed-entity-uri borde ta emot ett argument!"</span><span class="o">},</span></span>
<span id="LC397" class="line" lang="java"></span>
<span id="LC398" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NAMESPACEAXIS_NOT_IMPLEMENTED</span><span class="o">,</span></span>
<span id="LC399" class="line" lang="java">      <span class="s">"namnrymdsaxeln \u00E4r inte implementerad \u00E4n!"</span><span class="o">},</span></span>
<span id="LC400" class="line" lang="java"></span>
<span id="LC401" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNKNOWN_AXIS</span><span class="o">,</span></span>
<span id="LC402" class="line" lang="java">     <span class="s">"ok\u00E4nd axel: {0}"</span><span class="o">},</span></span>
<span id="LC403" class="line" lang="java"></span>
<span id="LC404" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNKNOWN_MATCH_OPERATION</span><span class="o">,</span></span>
<span id="LC405" class="line" lang="java">     <span class="s">"ok\u00E4nd matchnings\u00E5tg\u00E4rd!"</span><span class="o">},</span></span>
<span id="LC406" class="line" lang="java"></span>
<span id="LC407" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_INCORRECT_ARG_LENGTH</span><span class="o">,</span></span>
<span id="LC408" class="line" lang="java">      <span class="s">"Felaktig argumentl\u00E4ngd p\u00E5 nodtest f\u00F6r processing-instruction()!"</span><span class="o">},</span></span>
<span id="LC409" class="line" lang="java"></span>
<span id="LC410" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_NUMBER</span><span class="o">,</span></span>
<span id="LC411" class="line" lang="java">      <span class="s">"Kan inte konvertera {0} till ett tal"</span><span class="o">},</span></span>
<span id="LC412" class="line" lang="java"></span>
<span id="LC413" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_NODELIST</span><span class="o">,</span></span>
<span id="LC414" class="line" lang="java">      <span class="s">"Kan inte konvertera {0} till NodeList!"</span><span class="o">},</span></span>
<span id="LC415" class="line" lang="java"></span>
<span id="LC416" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_MUTABLENODELIST</span><span class="o">,</span></span>
<span id="LC417" class="line" lang="java">      <span class="s">"Kan inte konvertera {0} till NodeSetDTM!"</span><span class="o">},</span></span>
<span id="LC418" class="line" lang="java"></span>
<span id="LC419" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_TYPE</span><span class="o">,</span></span>
<span id="LC420" class="line" lang="java">      <span class="s">"Kan inte konvertera {0} till type#{1}"</span><span class="o">},</span></span>
<span id="LC421" class="line" lang="java"></span>
<span id="LC422" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_MATCH_PATTERN</span><span class="o">,</span></span>
<span id="LC423" class="line" lang="java">      <span class="s">"F\u00F6rv\u00E4ntat matchningsm\u00F6nster i getMatchScore!"</span><span class="o">},</span></span>
<span id="LC424" class="line" lang="java"></span>
<span id="LC425" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COULDNOT_GET_VAR_NAMED</span><span class="o">,</span></span>
<span id="LC426" class="line" lang="java">      <span class="s">"Kunde inte h\u00E4mta variabeln {0}"</span><span class="o">},</span></span>
<span id="LC427" class="line" lang="java"></span>
<span id="LC428" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNKNOWN_OPCODE</span><span class="o">,</span></span>
<span id="LC429" class="line" lang="java">     <span class="s">"FEL! Ok\u00E4nd op-kod: {0}"</span><span class="o">},</span></span>
<span id="LC430" class="line" lang="java"></span>
<span id="LC431" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXTRA_ILLEGAL_TOKENS</span><span class="o">,</span></span>
<span id="LC432" class="line" lang="java">     <span class="s">"Extra otill\u00E5tna token: {0}"</span><span class="o">},</span></span>
<span id="LC433" class="line" lang="java"></span>
<span id="LC434" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_DOUBLE_QUOTE</span><span class="o">,</span></span>
<span id="LC435" class="line" lang="java">      <span class="s">"Litteral omges av fel sorts citattecken... dubbla citattecken f\u00F6rv\u00E4ntade!"</span><span class="o">},</span></span>
<span id="LC436" class="line" lang="java"></span>
<span id="LC437" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_SINGLE_QUOTE</span><span class="o">,</span></span>
<span id="LC438" class="line" lang="java">      <span class="s">"Litteral omges av fel sorts citattecken... enkla citattecken f\u00F6rv\u00E4ntade!"</span><span class="o">},</span></span>
<span id="LC439" class="line" lang="java"></span>
<span id="LC440" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EMPTY_EXPRESSION</span><span class="o">,</span></span>
<span id="LC441" class="line" lang="java">     <span class="s">"Tomt uttryck!"</span><span class="o">},</span></span>
<span id="LC442" class="line" lang="java"></span>
<span id="LC443" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_BUT_FOUND</span><span class="o">,</span></span>
<span id="LC444" class="line" lang="java">     <span class="s">"F\u00F6rv\u00E4ntade {0}, men hittade: {1}"</span><span class="o">},</span></span>
<span id="LC445" class="line" lang="java"></span>
<span id="LC446" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_INCORRECT_PROGRAMMER_ASSERTION</span><span class="o">,</span></span>
<span id="LC447" class="line" lang="java">      <span class="s">"Programmerarens utsaga \u00E4r inte korrekt! - {0}"</span><span class="o">},</span></span>
<span id="LC448" class="line" lang="java"></span>
<span id="LC449" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL</span><span class="o">,</span></span>
<span id="LC450" class="line" lang="java">      <span class="s">"Argumentet boolean(...) \u00E4r inte l\u00E4ngre valfritt med 19990709 XPath-utkast."</span><span class="o">},</span></span>
<span id="LC451" class="line" lang="java"></span>
<span id="LC452" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG</span><span class="o">,</span></span>
<span id="LC453" class="line" lang="java">      <span class="s">"Hittade ',' utan f\u00F6reg\u00E5ende argument!"</span><span class="o">},</span></span>
<span id="LC454" class="line" lang="java"></span>
<span id="LC455" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG</span><span class="o">,</span></span>
<span id="LC456" class="line" lang="java">      <span class="s">"Hittade ',' utan efterf\u00F6ljande argument!"</span><span class="o">},</span></span>
<span id="LC457" class="line" lang="java"></span>
<span id="LC458" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_PREDICATE_ILLEGAL_SYNTAX</span><span class="o">,</span></span>
<span id="LC459" class="line" lang="java">      <span class="s">"'..[predikat]' eller '.[predikat]' \u00E4r otill\u00E5ten syntax. Anv\u00E4nd 'self::node()[predikat]' ist\u00E4llet."</span><span class="o">},</span></span>
<span id="LC460" class="line" lang="java"></span>
<span id="LC461" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_ILLEGAL_AXIS_NAME</span><span class="o">,</span></span>
<span id="LC462" class="line" lang="java">     <span class="s">"otill\u00E5tet axelnamn: {0}"</span><span class="o">},</span></span>
<span id="LC463" class="line" lang="java"></span>
<span id="LC464" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNKNOWN_NODETYPE</span><span class="o">,</span></span>
<span id="LC465" class="line" lang="java">     <span class="s">"Ok\u00E4nd nodtyp: {0}"</span><span class="o">},</span></span>
<span id="LC466" class="line" lang="java"></span>
<span id="LC467" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_PATTERN_LITERAL_NEEDS_BE_QUOTED</span><span class="o">,</span></span>
<span id="LC468" class="line" lang="java">      <span class="s">"M\u00F6nsterlitteralen ({0}) m\u00E5ste omges av citattecken!"</span><span class="o">},</span></span>
<span id="LC469" class="line" lang="java"></span>
<span id="LC470" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COULDNOT_BE_FORMATTED_TO_NUMBER</span><span class="o">,</span></span>
<span id="LC471" class="line" lang="java">      <span class="s">"{0} kunde inte formateras till ett tal!"</span><span class="o">},</span></span>
<span id="LC472" class="line" lang="java"></span>
<span id="LC473" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COULDNOT_CREATE_XMLPROCESSORLIAISON</span><span class="o">,</span></span>
<span id="LC474" class="line" lang="java">      <span class="s">"Kunde inte skapa XML TransformerFactory Liaison: {0}"</span><span class="o">},</span></span>
<span id="LC475" class="line" lang="java"></span>
<span id="LC476" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_DIDNOT_FIND_XPATH_SELECT_EXP</span><span class="o">,</span></span>
<span id="LC477" class="line" lang="java">      <span class="s">"Fel! Hittade inte xpath select-uttryck (-select)."</span><span class="o">},</span></span>
<span id="LC478" class="line" lang="java"></span>
<span id="LC479" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH</span><span class="o">,</span></span>
<span id="LC480" class="line" lang="java">      <span class="s">"FEL! Hittade inte ENDOP efter OP_LOCATIONPATH"</span><span class="o">},</span></span>
<span id="LC481" class="line" lang="java"></span>
<span id="LC482" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_ERROR_OCCURED</span><span class="o">,</span></span>
<span id="LC483" class="line" lang="java">     <span class="s">"Ett fel har intr\u00E4ffat!"</span><span class="o">},</span></span>
<span id="LC484" class="line" lang="java"></span>
<span id="LC485" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_ILLEGAL_VARIABLE_REFERENCE</span><span class="o">,</span></span>
<span id="LC486" class="line" lang="java">      <span class="s">"VariableReference angiven f\u00F6r variabel som \u00E4r utanf\u00F6r kontext eller som saknar definition! Namn = {0}"</span><span class="o">},</span></span>
<span id="LC487" class="line" lang="java"></span>
<span id="LC488" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_AXES_NOT_ALLOWED</span><span class="o">,</span></span>
<span id="LC489" class="line" lang="java">      <span class="s">"Endast underordnade:: och attribut::-axlar \u00E4r till\u00E5tna i matchningsm\u00F6nster! Regelvidriga axlar = {0}"</span><span class="o">},</span></span>
<span id="LC490" class="line" lang="java"></span>
<span id="LC491" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_KEY_HAS_TOO_MANY_ARGS</span><span class="o">,</span></span>
<span id="LC492" class="line" lang="java">      <span class="s">"key() har felaktigt antal argument."</span><span class="o">},</span></span>
<span id="LC493" class="line" lang="java"></span>
<span id="LC494" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COUNT_TAKES_1_ARG</span><span class="o">,</span></span>
<span id="LC495" class="line" lang="java">      <span class="s">"Funktionen count borde ta emot ett argument!"</span><span class="o">},</span></span>
<span id="LC496" class="line" lang="java"></span>
<span id="LC497" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COULDNOT_FIND_FUNCTION</span><span class="o">,</span></span>
<span id="LC498" class="line" lang="java">     <span class="s">"Hittade inte funktionen: {0}"</span><span class="o">},</span></span>
<span id="LC499" class="line" lang="java"></span>
<span id="LC500" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNSUPPORTED_ENCODING</span><span class="o">,</span></span>
<span id="LC501" class="line" lang="java">     <span class="s">"Kodning utan st\u00F6d: {0}"</span><span class="o">},</span></span>
<span id="LC502" class="line" lang="java"></span>
<span id="LC503" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_PROBLEM_IN_DTM_NEXTSIBLING</span><span class="o">,</span></span>
<span id="LC504" class="line" lang="java">      <span class="s">"Problem intr\u00E4ffade i DTM i getNextSibling... f\u00F6rs\u00F6ker \u00E5terskapa"</span><span class="o">},</span></span>
<span id="LC505" class="line" lang="java"></span>
<span id="LC506" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL</span><span class="o">,</span></span>
<span id="LC507" class="line" lang="java">      <span class="s">"Programmerarfel: kan inte skriva till EmptyNodeList."</span><span class="o">},</span></span>
<span id="LC508" class="line" lang="java"></span>
<span id="LC509" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_SETDOMFACTORY_NOT_SUPPORTED</span><span class="o">,</span></span>
<span id="LC510" class="line" lang="java">      <span class="s">"setDOMFactory st\u00F6ds inte i XPathContext!"</span><span class="o">},</span></span>
<span id="LC511" class="line" lang="java"></span>
<span id="LC512" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_PREFIX_MUST_RESOLVE</span><span class="o">,</span></span>
<span id="LC513" class="line" lang="java">      <span class="s">"Prefix m\u00E5ste matchas till en namnrymd: {0}"</span><span class="o">},</span></span>
<span id="LC514" class="line" lang="java"></span>
<span id="LC515" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_PARSE_NOT_SUPPORTED</span><span class="o">,</span></span>
<span id="LC516" class="line" lang="java">      <span class="s">"tolkning (InputSource-k\u00E4lla) st\u00F6ds inte i XPathContext! Kan inte \u00F6ppna {0}"</span><span class="o">},</span></span>
<span id="LC517" class="line" lang="java"></span>
<span id="LC518" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_SAX_API_NOT_HANDLED</span><span class="o">,</span></span>
<span id="LC519" class="line" lang="java">      <span class="s">"SAX API-tecken(char ch[]... hanteras inte av DTM!"</span><span class="o">},</span></span>
<span id="LC520" class="line" lang="java"></span>
<span id="LC521" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_IGNORABLE_WHITESPACE_NOT_HANDLED</span><span class="o">,</span></span>
<span id="LC522" class="line" lang="java">      <span class="s">"ignorableWhitespace(char ch[]... hanteras inte av DTM!"</span><span class="o">},</span></span>
<span id="LC523" class="line" lang="java"></span>
<span id="LC524" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_DTM_CANNOT_HANDLE_NODES</span><span class="o">,</span></span>
<span id="LC525" class="line" lang="java">      <span class="s">"DTMLiaison kan inte hantera noder av typ {0}"</span><span class="o">},</span></span>
<span id="LC526" class="line" lang="java"></span>
<span id="LC527" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_XERCES_CANNOT_HANDLE_NODES</span><span class="o">,</span></span>
<span id="LC528" class="line" lang="java">      <span class="s">"DOM2Helper kan inte hantera noder av typ {0}"</span><span class="o">},</span></span>
<span id="LC529" class="line" lang="java"></span>
<span id="LC530" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_XERCES_PARSE_ERROR_DETAILS</span><span class="o">,</span></span>
<span id="LC531" class="line" lang="java">      <span class="s">"Fel i DOM2Helper.parse: SystemID - {0} rad - {1}"</span><span class="o">},</span></span>
<span id="LC532" class="line" lang="java"></span>
<span id="LC533" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_XERCES_PARSE_ERROR</span><span class="o">,</span></span>
<span id="LC534" class="line" lang="java">     <span class="s">"Fel i DOM2Helper.parse"</span><span class="o">},</span></span>
<span id="LC535" class="line" lang="java"></span>
<span id="LC536" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_INVALID_UTF16_SURROGATE</span><span class="o">,</span></span>
<span id="LC537" class="line" lang="java">      <span class="s">"Ogiltigt UTF-16-surrogat uppt\u00E4ckt: {0} ?"</span><span class="o">},</span></span>
<span id="LC538" class="line" lang="java"></span>
<span id="LC539" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_OIERROR</span><span class="o">,</span></span>
<span id="LC540" class="line" lang="java">     <span class="s">"IO-fel"</span><span class="o">},</span></span>
<span id="LC541" class="line" lang="java"></span>
<span id="LC542" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANNOT_CREATE_URL</span><span class="o">,</span></span>
<span id="LC543" class="line" lang="java">     <span class="s">"Kan inte skapa URL f\u00F6r: {0}"</span><span class="o">},</span></span>
<span id="LC544" class="line" lang="java"></span>
<span id="LC545" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_XPATH_READOBJECT</span><span class="o">,</span></span>
<span id="LC546" class="line" lang="java">     <span class="s">"I XPath.readObject: {0}"</span><span class="o">},</span></span>
<span id="LC547" class="line" lang="java"></span>
<span id="LC548" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FUNCTION_TOKEN_NOT_FOUND</span><span class="o">,</span></span>
<span id="LC549" class="line" lang="java">      <span class="s">"funktionstoken hittades inte."</span><span class="o">},</span></span>
<span id="LC550" class="line" lang="java"></span>
<span id="LC551" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANNOT_DEAL_XPATH_TYPE</span><span class="o">,</span></span>
<span id="LC552" class="line" lang="java">       <span class="s">"Kan inte hantera XPath-typ: {0}"</span><span class="o">},</span></span>
<span id="LC553" class="line" lang="java"></span>
<span id="LC554" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NODESET_NOT_MUTABLE</span><span class="o">,</span></span>
<span id="LC555" class="line" lang="java">       <span class="s">"Detta NodeSet \u00E4r of\u00F6r\u00E4nderligt"</span><span class="o">},</span></span>
<span id="LC556" class="line" lang="java"></span>
<span id="LC557" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NODESETDTM_NOT_MUTABLE</span><span class="o">,</span></span>
<span id="LC558" class="line" lang="java">       <span class="s">"Detta NodeSetDTM \u00E4r of\u00F6r\u00E4nderligt"</span><span class="o">},</span></span>
<span id="LC559" class="line" lang="java"></span>
<span id="LC560" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_VAR_NOT_RESOLVABLE</span><span class="o">,</span></span>
<span id="LC561" class="line" lang="java">        <span class="s">"Variabeln kan inte matchas: {0}"</span><span class="o">},</span></span>
<span id="LC562" class="line" lang="java"></span>
<span id="LC563" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NULL_ERROR_HANDLER</span><span class="o">,</span></span>
<span id="LC564" class="line" lang="java">        <span class="s">"Felhanterare med v\u00E4rde null"</span><span class="o">},</span></span>
<span id="LC565" class="line" lang="java"></span>
<span id="LC566" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_PROG_ASSERT_UNKNOWN_OPCODE</span><span class="o">,</span></span>
<span id="LC567" class="line" lang="java">       <span class="s">"Programmerarens utsaga: ok\u00E4nd op-kod: {0}"</span><span class="o">},</span></span>
<span id="LC568" class="line" lang="java"></span>
<span id="LC569" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_ZERO_OR_ONE</span><span class="o">,</span></span>
<span id="LC570" class="line" lang="java">       <span class="s">"0 eller 1"</span><span class="o">},</span></span>
<span id="LC571" class="line" lang="java"></span>
<span id="LC572" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span><span class="o">,</span></span>
<span id="LC573" class="line" lang="java">       <span class="s">"rtf() st\u00F6ds inte av XRTreeFragSelectWrapper"</span><span class="o">},</span></span>
<span id="LC574" class="line" lang="java"></span>
<span id="LC575" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span><span class="o">,</span></span>
<span id="LC576" class="line" lang="java">       <span class="s">"asNodeIterator() st\u00F6ds inte av XRTreeFragSelectWrapper"</span><span class="o">},</span></span>
<span id="LC577" class="line" lang="java"></span>
<span id="LC578" class="line" lang="java">        <span class="cm">/**  detach() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC579" class="line" lang="java">   <span class="o">{</span> <span class="no">ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span><span class="o">,</span></span>
<span id="LC580" class="line" lang="java">                <span class="s">"detach() st\u00F6ds inte av XRTreeFragSelectWrapper"</span><span class="o">},</span></span>
<span id="LC581" class="line" lang="java"></span>
<span id="LC582" class="line" lang="java">        <span class="cm">/**  num() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC583" class="line" lang="java">   <span class="o">{</span> <span class="no">ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span><span class="o">,</span></span>
<span id="LC584" class="line" lang="java">                <span class="s">"num() st\u00F6ds inte av XRTreeFragSelectWrapper"</span><span class="o">},</span></span>
<span id="LC585" class="line" lang="java"></span>
<span id="LC586" class="line" lang="java">        <span class="cm">/**  xstr() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC587" class="line" lang="java">   <span class="o">{</span> <span class="no">ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span><span class="o">,</span></span>
<span id="LC588" class="line" lang="java">                <span class="s">"xstr() st\u00F6ds inte av XRTreeFragSelectWrapper"</span><span class="o">},</span></span>
<span id="LC589" class="line" lang="java"></span>
<span id="LC590" class="line" lang="java">        <span class="cm">/**  str() not supported by XRTreeFragSelectWrapper   */</span></span>
<span id="LC591" class="line" lang="java">   <span class="o">{</span> <span class="no">ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER</span><span class="o">,</span></span>
<span id="LC592" class="line" lang="java">                <span class="s">"str() st\u00F6ds inte av XRTreeFragSelectWrapper"</span><span class="o">},</span></span>
<span id="LC593" class="line" lang="java"></span>
<span id="LC594" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS</span><span class="o">,</span></span>
<span id="LC595" class="line" lang="java">       <span class="s">"fsb() st\u00F6ds inte f\u00F6r XStringForChars"</span><span class="o">},</span></span>
<span id="LC596" class="line" lang="java"></span>
<span id="LC597" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_COULD_NOT_FIND_VAR</span><span class="o">,</span></span>
<span id="LC598" class="line" lang="java">      <span class="s">"Hittade inte variabel med namnet {0}"</span><span class="o">},</span></span>
<span id="LC599" class="line" lang="java"></span>
<span id="LC600" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING</span><span class="o">,</span></span>
<span id="LC601" class="line" lang="java">      <span class="s">"XStringForChars kan inte ta emot en str\u00E4ng f\u00F6r argument"</span><span class="o">},</span></span>
<span id="LC602" class="line" lang="java"></span>
<span id="LC603" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FASTSTRINGBUFFER_CANNOT_BE_NULL</span><span class="o">,</span></span>
<span id="LC604" class="line" lang="java">      <span class="s">"FastStringBuffer-argumentet f\u00E5r inte vara null"</span><span class="o">},</span></span>
<span id="LC605" class="line" lang="java"></span>
<span id="LC606" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_TWO_OR_THREE</span><span class="o">,</span></span>
<span id="LC607" class="line" lang="java">       <span class="s">"2 eller 3"</span><span class="o">},</span></span>
<span id="LC608" class="line" lang="java"></span>
<span id="LC609" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_VARIABLE_ACCESSED_BEFORE_BIND</span><span class="o">,</span></span>
<span id="LC610" class="line" lang="java">       <span class="s">"\u00C5tkomst till variabel innan den \u00E4r bunden!"</span><span class="o">},</span></span>
<span id="LC611" class="line" lang="java"></span>
<span id="LC612" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FSB_CANNOT_TAKE_STRING</span><span class="o">,</span></span>
<span id="LC613" class="line" lang="java">       <span class="s">"XStringForFSB kan inte ta emot en str\u00E4ng f\u00F6r argument!"</span><span class="o">},</span></span>
<span id="LC614" class="line" lang="java"></span>
<span id="LC615" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_SETTING_WALKER_ROOT_TO_NULL</span><span class="o">,</span></span>
<span id="LC616" class="line" lang="java">       <span class="s">"\n !!!! Fel! Anger roten f\u00F6r en ''walker'' som null!!!"</span><span class="o">},</span></span>
<span id="LC617" class="line" lang="java"></span>
<span id="LC618" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NODESETDTM_CANNOT_ITERATE</span><span class="o">,</span></span>
<span id="LC619" class="line" lang="java">       <span class="s">"Detta NodeSetDTM kan inte iterera till en tidigare nod!"</span><span class="o">},</span></span>
<span id="LC620" class="line" lang="java"></span>
<span id="LC621" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NODESET_CANNOT_ITERATE</span><span class="o">,</span></span>
<span id="LC622" class="line" lang="java">       <span class="s">"Detta NodeSet kan inte iterera till en tidigare nod!"</span><span class="o">},</span></span>
<span id="LC623" class="line" lang="java"></span>
<span id="LC624" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NODESETDTM_CANNOT_INDEX</span><span class="o">,</span></span>
<span id="LC625" class="line" lang="java">       <span class="s">"Detta NodeSetDTM kan inte utf\u00F6ra funktioner som indexerar eller r\u00E4knar!"</span><span class="o">},</span></span>
<span id="LC626" class="line" lang="java"></span>
<span id="LC627" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NODESET_CANNOT_INDEX</span><span class="o">,</span></span>
<span id="LC628" class="line" lang="java">       <span class="s">"Detta NodeSet kan inte utf\u00F6ra funktioner som indexerar eller r\u00E4knar!"</span><span class="o">},</span></span>
<span id="LC629" class="line" lang="java"></span>
<span id="LC630" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANNOT_CALL_SETSHOULDCACHENODE</span><span class="o">,</span></span>
<span id="LC631" class="line" lang="java">       <span class="s">"Kan inte anropa setShouldCacheNodes efter anropat nextNode!"</span><span class="o">},</span></span>
<span id="LC632" class="line" lang="java"></span>
<span id="LC633" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_ONLY_ALLOWS</span><span class="o">,</span></span>
<span id="LC634" class="line" lang="java">       <span class="s">"{0} till\u00E5ter endast {1} argument"</span><span class="o">},</span></span>
<span id="LC635" class="line" lang="java"></span>
<span id="LC636" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNKNOWN_STEP</span><span class="o">,</span></span>
<span id="LC637" class="line" lang="java">       <span class="s">"Programmerarens utsaga i getNextStepPos: ok\u00E4nt stepType: {0}"</span><span class="o">},</span></span>
<span id="LC638" class="line" lang="java"></span>
<span id="LC639" class="line" lang="java">  <span class="c1">//Note to translators:  A relative location path is a form of XPath expression.</span></span>
<span id="LC640" class="line" lang="java">  <span class="c1">// The message indicates that such an expression was expected following the</span></span>
<span id="LC641" class="line" lang="java">  <span class="c1">// characters '/' or '//', but was not found.</span></span>
<span id="LC642" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_REL_LOC_PATH</span><span class="o">,</span></span>
<span id="LC643" class="line" lang="java">      <span class="s">"En relativ s\u00F6kv\u00E4g f\u00F6rv\u00E4ntades efter token '/' eller '//'."</span><span class="o">},</span></span>
<span id="LC644" class="line" lang="java"></span>
<span id="LC645" class="line" lang="java">  <span class="c1">// Note to translators:  A location path is a form of XPath expression.</span></span>
<span id="LC646" class="line" lang="java">  <span class="c1">// The message indicates that syntactically such an expression was expected,but</span></span>
<span id="LC647" class="line" lang="java">  <span class="c1">// the characters specified by the substitution text were encountered instead.</span></span>
<span id="LC648" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_LOC_PATH</span><span class="o">,</span></span>
<span id="LC649" class="line" lang="java">       <span class="s">"En s\u00F6kv\u00E4g f\u00F6rv\u00E4ntades, men f\u00F6ljande token p\u00E5tr\u00E4ffades: {0}"</span><span class="o">},</span></span>
<span id="LC650" class="line" lang="java"></span>
<span id="LC651" class="line" lang="java">  <span class="c1">// Note to translators:  A location path is a form of XPath expression.</span></span>
<span id="LC652" class="line" lang="java">  <span class="c1">// The message indicates that syntactically such a subexpression was expected,</span></span>
<span id="LC653" class="line" lang="java">  <span class="c1">// but no more characters were found in the expression.</span></span>
<span id="LC654" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_LOC_PATH_AT_END_EXPR</span><span class="o">,</span></span>
<span id="LC655" class="line" lang="java">       <span class="s">"En s\u00F6kv\u00E4g f\u00F6rv\u00E4ntades, men slutet av XPath-uttrycket hittades ist\u00E4llet."</span><span class="o">},</span></span>
<span id="LC656" class="line" lang="java"></span>
<span id="LC657" class="line" lang="java">  <span class="c1">// Note to translators:  A location step is part of an XPath expression.</span></span>
<span id="LC658" class="line" lang="java">  <span class="c1">// The message indicates that syntactically such an expression was expected</span></span>
<span id="LC659" class="line" lang="java">  <span class="c1">// following the specified characters.</span></span>
<span id="LC660" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_LOC_STEP</span><span class="o">,</span></span>
<span id="LC661" class="line" lang="java">       <span class="s">"Ett platssteg f\u00F6rv\u00E4ntades efter token '/' eller '//'."</span><span class="o">},</span></span>
<span id="LC662" class="line" lang="java"></span>
<span id="LC663" class="line" lang="java">  <span class="c1">// Note to translators:  A node test is part of an XPath expression that is</span></span>
<span id="LC664" class="line" lang="java">  <span class="c1">// used to test for particular kinds of nodes.  In this case, a node test that</span></span>
<span id="LC665" class="line" lang="java">  <span class="c1">// consists of an NCName followed by a colon and an asterisk or that consists</span></span>
<span id="LC666" class="line" lang="java">  <span class="c1">// of a QName was expected, but was not found.</span></span>
<span id="LC667" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_NODE_TEST</span><span class="o">,</span></span>
<span id="LC668" class="line" lang="java">       <span class="s">"Ett nodtest som matchar antingen NCName:* eller QName f\u00F6rv\u00E4ntades."</span><span class="o">},</span></span>
<span id="LC669" class="line" lang="java"></span>
<span id="LC670" class="line" lang="java">  <span class="c1">// Note to translators:  A step pattern is part of an XPath expression.</span></span>
<span id="LC671" class="line" lang="java">  <span class="c1">// The message indicates that syntactically such an expression was expected,</span></span>
<span id="LC672" class="line" lang="java">  <span class="c1">// but the specified character was found in the expression instead.</span></span>
<span id="LC673" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_STEP_PATTERN</span><span class="o">,</span></span>
<span id="LC674" class="line" lang="java">       <span class="s">"Ett stegm\u00F6nster f\u00F6rv\u00E4ntades, men '/' p\u00E5tr\u00E4ffades."</span><span class="o">},</span></span>
<span id="LC675" class="line" lang="java"></span>
<span id="LC676" class="line" lang="java">  <span class="c1">// Note to translators: A relative path pattern is part of an XPath expression.</span></span>
<span id="LC677" class="line" lang="java">  <span class="c1">// The message indicates that syntactically such an expression was expected,</span></span>
<span id="LC678" class="line" lang="java">  <span class="c1">// but was not found.</span></span>
<span id="LC679" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXPECTED_REL_PATH_PATTERN</span><span class="o">,</span></span>
<span id="LC680" class="line" lang="java">       <span class="s">"Ett m\u00F6nster f\u00F6r relativ s\u00F6kv\u00E4g f\u00F6rv\u00E4ntades."</span><span class="o">},</span></span>
<span id="LC681" class="line" lang="java"></span>
<span id="LC682" class="line" lang="java">  <span class="c1">// Note to translators:  The substitution text is the name of a data type.  The</span></span>
<span id="LC683" class="line" lang="java">  <span class="c1">// message indicates that a value of a particular type could not be converted</span></span>
<span id="LC684" class="line" lang="java">  <span class="c1">// to a value of type boolean.</span></span>
<span id="LC685" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_BOOLEAN</span><span class="o">,</span></span>
<span id="LC686" class="line" lang="java">       <span class="s">"XPathResult i XPath-uttrycket ''{0}'' inneh\u00E5ller XPathResultType {1} som inte kan konverteras till booleskt v\u00E4rde."</span><span class="o">},</span></span>
<span id="LC687" class="line" lang="java"></span>
<span id="LC688" class="line" lang="java">  <span class="c1">// Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and</span></span>
<span id="LC689" class="line" lang="java">  <span class="c1">// FIRST_ORDERED_NODE_TYPE.</span></span>
<span id="LC690" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_SINGLENODE</span><span class="o">,</span></span>
<span id="LC691" class="line" lang="java">       <span class="s">"XPathResult i XPath-uttrycket ''{0}'' inneh\u00E5ller XPathResultType {1} som inte kan konverteras till enskild nod. Metoden getSingleNodeValue anv\u00E4nds endast till typ ANY_UNORDERED_NODE_TYPE och FIRST_ORDERED_NODE_TYPE."</span><span class="o">},</span></span>
<span id="LC692" class="line" lang="java"></span>
<span id="LC693" class="line" lang="java">  <span class="c1">// Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and</span></span>
<span id="LC694" class="line" lang="java">  <span class="c1">// ORDERED_NODE_SNAPSHOT_TYPE.</span></span>
<span id="LC695" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_GET_SNAPSHOT_LENGTH</span><span class="o">,</span></span>
<span id="LC696" class="line" lang="java">       <span class="s">"Metoden getSnapshotLength kan inte anropas vid XPathResult fr\u00E5n XPath-uttrycket ''{0}'' eftersom XPathResultType \u00E4r {1}. Metoden anv\u00E4nds endast till typ UNORDERED_NODE_SNAPSHOT_TYPE och ORDERED_NODE_SNAPSHOT_TYPE."</span><span class="o">},</span></span>
<span id="LC697" class="line" lang="java"></span>
<span id="LC698" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NON_ITERATOR_TYPE</span><span class="o">,</span></span>
<span id="LC699" class="line" lang="java">       <span class="s">"Metoden iterateNext kan inte anropas vid XPathResult fr\u00E5n XPath-uttrycket ''{0}'' eftersom XPathResultType \u00E4r {1}. Metoden anv\u00E4nds endast till typ UNORDERED_NODE_ITERATOR_TYPE och ORDERED_NODE_ITERATOR_TYPE."</span><span class="o">},</span></span>
<span id="LC700" class="line" lang="java"></span>
<span id="LC701" class="line" lang="java">  <span class="c1">// Note to translators: This message indicates that the document being operated</span></span>
<span id="LC702" class="line" lang="java">  <span class="c1">// upon changed, so the iterator object that was being used to traverse the</span></span>
<span id="LC703" class="line" lang="java">  <span class="c1">// document has now become invalid.</span></span>
<span id="LC704" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_DOC_MUTATED</span><span class="o">,</span></span>
<span id="LC705" class="line" lang="java">       <span class="s">"Dokumentet har muterats sedan resultatet genererades. Iteratorn \u00E4r ogiltig."</span><span class="o">},</span></span>
<span id="LC706" class="line" lang="java"></span>
<span id="LC707" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_INVALID_XPATH_TYPE</span><span class="o">,</span></span>
<span id="LC708" class="line" lang="java">       <span class="s">"Ogiltigt XPath-typargument: {0}"</span><span class="o">},</span></span>
<span id="LC709" class="line" lang="java"></span>
<span id="LC710" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EMPTY_XPATH_RESULT</span><span class="o">,</span></span>
<span id="LC711" class="line" lang="java">       <span class="s">"Tomt XPath-resultatobjekt"</span><span class="o">},</span></span>
<span id="LC712" class="line" lang="java"></span>
<span id="LC713" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_INCOMPATIBLE_TYPES</span><span class="o">,</span></span>
<span id="LC714" class="line" lang="java">       <span class="s">"XPathResult i XPath-uttrycket ''{0}'' inneh\u00E5ller XPathResultType {1} som inte kan tvingas till angiven XPathResultType {2}."</span><span class="o">},</span></span>
<span id="LC715" class="line" lang="java"></span>
<span id="LC716" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NULL_RESOLVER</span><span class="o">,</span></span>
<span id="LC717" class="line" lang="java">       <span class="s">"Kan inte matcha prefix med prefixmatchning som \u00E4r null."</span><span class="o">},</span></span>
<span id="LC718" class="line" lang="java"></span>
<span id="LC719" class="line" lang="java">  <span class="c1">// Note to translators:  The substitution text is the name of a data type.  The</span></span>
<span id="LC720" class="line" lang="java">  <span class="c1">// message indicates that a value of a particular type could not be converted</span></span>
<span id="LC721" class="line" lang="java">  <span class="c1">// to a value of type string.</span></span>
<span id="LC722" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_TO_STRING</span><span class="o">,</span></span>
<span id="LC723" class="line" lang="java">       <span class="s">"XPathResult i XPath-uttrycket ''{0}'' inneh\u00E5ller XPathResultType {1} som inte kan konverteras till en str\u00E4ng."</span><span class="o">},</span></span>
<span id="LC724" class="line" lang="java"></span>
<span id="LC725" class="line" lang="java">  <span class="c1">// Note to translators: Do not translate snapshotItem,</span></span>
<span id="LC726" class="line" lang="java">  <span class="c1">// UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE.</span></span>
<span id="LC727" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NON_SNAPSHOT_TYPE</span><span class="o">,</span></span>
<span id="LC728" class="line" lang="java">       <span class="s">"Metoden snapshotItem kan inte anropas vid XPathResult fr\u00E5n XPath-uttrycket ''{0}'' eftersom XPathResultType \u00E4r {1}. Metoden anv\u00E4nds endast till typ UNORDERED_NODE_SNAPSHOT_TYPE och ORDERED_NODE_SNAPSHOT_TYPE."</span><span class="o">},</span></span>
<span id="LC729" class="line" lang="java"></span>
<span id="LC730" class="line" lang="java">  <span class="c1">// Note to translators:  XPathEvaluator is a Java interface name.  An</span></span>
<span id="LC731" class="line" lang="java">  <span class="c1">// XPathEvaluator is created with respect to a particular XML document, and in</span></span>
<span id="LC732" class="line" lang="java">  <span class="c1">// this case the expression represented by this object was being evaluated with</span></span>
<span id="LC733" class="line" lang="java">  <span class="c1">// respect to a context node from a different document.</span></span>
<span id="LC734" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_WRONG_DOCUMENT</span><span class="o">,</span></span>
<span id="LC735" class="line" lang="java">       <span class="s">"Kontextnoden tillh\u00F6r inte dokumentet som \u00E4r bundet till denna XPathEvaluator."</span><span class="o">},</span></span>
<span id="LC736" class="line" lang="java"></span>
<span id="LC737" class="line" lang="java">  <span class="c1">// Note to translators:  The XPath expression cannot be evaluated with respect</span></span>
<span id="LC738" class="line" lang="java">  <span class="c1">// to this type of node.</span></span>
<span id="LC739" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_WRONG_NODETYPE</span><span class="o">,</span></span>
<span id="LC740" class="line" lang="java">       <span class="s">"Kontextnodtypen st\u00F6ds inte."</span><span class="o">},</span></span>
<span id="LC741" class="line" lang="java"></span>
<span id="LC742" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_XPATH_ERROR</span><span class="o">,</span></span>
<span id="LC743" class="line" lang="java">       <span class="s">"Ok\u00E4nt fel i XPath."</span><span class="o">},</span></span>
<span id="LC744" class="line" lang="java"></span>
<span id="LC745" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_CANT_CONVERT_XPATHRESULTTYPE_TO_NUMBER</span><span class="o">,</span></span>
<span id="LC746" class="line" lang="java">        <span class="s">"XPathResult i XPath-uttrycket ''{0}'' inneh\u00E5ller XPathResultType {1} som inte kan konverteras till ett tal."</span><span class="o">},</span></span>
<span id="LC747" class="line" lang="java"></span>
<span id="LC748" class="line" lang="java">  <span class="c1">//BEGIN:  Definitions of error keys used  in exception messages of  JAXP 1.3 XPath API implementation</span></span>
<span id="LC749" class="line" lang="java"></span>
<span id="LC750" class="line" lang="java">  <span class="cm">/** Field ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED                       */</span></span>
<span id="LC751" class="line" lang="java"></span>
<span id="LC752" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_EXTENSION_FUNCTION_CANNOT_BE_INVOKED</span><span class="o">,</span></span>
<span id="LC753" class="line" lang="java">       <span class="s">"Till\u00E4ggsfunktion: ''{0}'' kan inte anropas om funktionen XMLConstants.FEATURE_SECURE_PROCESSING anges som true."</span><span class="o">},</span></span>
<span id="LC754" class="line" lang="java"></span>
<span id="LC755" class="line" lang="java">  <span class="cm">/** Field ER_RESOLVE_VARIABLE_RETURNS_NULL                       */</span></span>
<span id="LC756" class="line" lang="java"></span>
<span id="LC757" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_RESOLVE_VARIABLE_RETURNS_NULL</span><span class="o">,</span></span>
<span id="LC758" class="line" lang="java">       <span class="s">"resolveVariable f\u00F6r variabeln {0} returnerar null"</span><span class="o">},</span></span>
<span id="LC759" class="line" lang="java"></span>
<span id="LC760" class="line" lang="java">  <span class="cm">/** Field ER_UNSUPPORTED_RETURN_TYPE                       */</span></span>
<span id="LC761" class="line" lang="java"></span>
<span id="LC762" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_UNSUPPORTED_RETURN_TYPE</span><span class="o">,</span></span>
<span id="LC763" class="line" lang="java">       <span class="s">"Det finns inget st\u00F6d f\u00F6r returtypen: {0}"</span><span class="o">},</span></span>
<span id="LC764" class="line" lang="java"></span>
<span id="LC765" class="line" lang="java">  <span class="cm">/** Field ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL                       */</span></span>
<span id="LC766" class="line" lang="java"></span>
<span id="LC767" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL</span><span class="o">,</span></span>
<span id="LC768" class="line" lang="java">       <span class="s">"K\u00E4lla och/eller returtyp f\u00E5r inte vara null"</span><span class="o">},</span></span>
<span id="LC769" class="line" lang="java"></span>
<span id="LC770" class="line" lang="java">  <span class="cm">/** Field ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL                       */</span></span>
<span id="LC771" class="line" lang="java"></span>
<span id="LC772" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_SOURCE_RETURN_TYPE_CANNOT_BE_NULL</span><span class="o">,</span></span>
<span id="LC773" class="line" lang="java">       <span class="s">"K\u00E4lla och/eller returtyp f\u00E5r inte vara null"</span><span class="o">},</span></span>
<span id="LC774" class="line" lang="java"></span>
<span id="LC775" class="line" lang="java">  <span class="cm">/** Field ER_ARG_CANNOT_BE_NULL                       */</span></span>
<span id="LC776" class="line" lang="java"></span>
<span id="LC777" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_ARG_CANNOT_BE_NULL</span><span class="o">,</span></span>
<span id="LC778" class="line" lang="java">       <span class="s">"Argumentet {0} kan inte vara null"</span><span class="o">},</span></span>
<span id="LC779" class="line" lang="java"></span>
<span id="LC780" class="line" lang="java">  <span class="cm">/** Field ER_OBJECT_MODEL_NULL                       */</span></span>
<span id="LC781" class="line" lang="java"></span>
<span id="LC782" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_OBJECT_MODEL_NULL</span><span class="o">,</span></span>
<span id="LC783" class="line" lang="java">       <span class="s">"{0}#isObjectModelSupported( String objectModel ) kan inte anropas med objectModel == null"</span><span class="o">},</span></span>
<span id="LC784" class="line" lang="java"></span>
<span id="LC785" class="line" lang="java">  <span class="cm">/** Field ER_OBJECT_MODEL_EMPTY                       */</span></span>
<span id="LC786" class="line" lang="java"></span>
<span id="LC787" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_OBJECT_MODEL_EMPTY</span><span class="o">,</span></span>
<span id="LC788" class="line" lang="java">       <span class="s">"{0}#isObjectModelSupported( String objectModel ) kan inte anropas med objectModel == \"\""</span><span class="o">},</span></span>
<span id="LC789" class="line" lang="java"></span>
<span id="LC790" class="line" lang="java">  <span class="cm">/** Field ER_OBJECT_MODEL_EMPTY                       */</span></span>
<span id="LC791" class="line" lang="java"></span>
<span id="LC792" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FEATURE_NAME_NULL</span><span class="o">,</span></span>
<span id="LC793" class="line" lang="java">       <span class="s">"F\u00F6rs\u00F6ker ange en funktion med null-namn: {0}#setFeature( null, {1})"</span><span class="o">},</span></span>
<span id="LC794" class="line" lang="java"></span>
<span id="LC795" class="line" lang="java">  <span class="cm">/** Field ER_FEATURE_UNKNOWN                       */</span></span>
<span id="LC796" class="line" lang="java"></span>
<span id="LC797" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_FEATURE_UNKNOWN</span><span class="o">,</span></span>
<span id="LC798" class="line" lang="java">       <span class="s">"F\u00F6rs\u00F6ker ange en ok\u00E4nd funktion \"{0}\":{1}#setFeature({0},{2})"</span><span class="o">},</span></span>
<span id="LC799" class="line" lang="java"></span>
<span id="LC800" class="line" lang="java">  <span class="cm">/** Field ER_GETTING_NULL_FEATURE                       */</span></span>
<span id="LC801" class="line" lang="java"></span>
<span id="LC802" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_GETTING_NULL_FEATURE</span><span class="o">,</span></span>
<span id="LC803" class="line" lang="java">       <span class="s">"F\u00F6rs\u00F6ker h\u00E4mta en funktion med null-namn: {0}#getFeature(null)"</span><span class="o">},</span></span>
<span id="LC804" class="line" lang="java"></span>
<span id="LC805" class="line" lang="java">  <span class="cm">/** Field ER_GETTING_NULL_FEATURE                       */</span></span>
<span id="LC806" class="line" lang="java"></span>
<span id="LC807" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_GETTING_UNKNOWN_FEATURE</span><span class="o">,</span></span>
<span id="LC808" class="line" lang="java">       <span class="s">"F\u00F6rs\u00F6ker h\u00E4mta en ok\u00E4nd funktion \"{0}\":{1}#getFeature({0})"</span><span class="o">},</span></span>
<span id="LC809" class="line" lang="java"></span>
<span id="LC810" class="line" lang="java">  <span class="o">{</span><span class="no">ER_SECUREPROCESSING_FEATURE</span><span class="o">,</span></span>
<span id="LC811" class="line" lang="java">        <span class="s">"FEATURE_SECURE_PROCESSING: Kan inte ange funktionen som false om s\u00E4kerhetshanteraren anv\u00E4nds: {1}#setFeature({0},{2})"</span><span class="o">},</span></span>
<span id="LC812" class="line" lang="java"></span>
<span id="LC813" class="line" lang="java">  <span class="cm">/** Field ER_NULL_XPATH_FUNCTION_RESOLVER                       */</span></span>
<span id="LC814" class="line" lang="java"></span>
<span id="LC815" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NULL_XPATH_FUNCTION_RESOLVER</span><span class="o">,</span></span>
<span id="LC816" class="line" lang="java">       <span class="s">"F\u00F6rs\u00F6ker ange nullv\u00E4rde f\u00F6r XPathFunctionResolver:{0}#setXPathFunctionResolver(null)"</span><span class="o">},</span></span>
<span id="LC817" class="line" lang="java"></span>
<span id="LC818" class="line" lang="java">  <span class="cm">/** Field ER_NULL_XPATH_VARIABLE_RESOLVER                       */</span></span>
<span id="LC819" class="line" lang="java"></span>
<span id="LC820" class="line" lang="java">  <span class="o">{</span> <span class="no">ER_NULL_XPATH_VARIABLE_RESOLVER</span><span class="o">,</span></span>
<span id="LC821" class="line" lang="java">       <span class="s">"F\u00F6rs\u00F6ker ange nullv\u00E4rde f\u00F6r XPathVariableResolver:{0}#setXPathVariableResolver(null)"</span><span class="o">},</span></span>
<span id="LC822" class="line" lang="java"></span>
<span id="LC823" class="line" lang="java">  <span class="c1">//END:  Definitions of error keys used  in exception messages of  JAXP 1.3 XPath API implementation</span></span>
<span id="LC824" class="line" lang="java"></span>
<span id="LC825" class="line" lang="java">  <span class="c1">// Warnings...</span></span>
<span id="LC826" class="line" lang="java"></span>
<span id="LC827" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_LOCALE_NAME_NOT_HANDLED</span><span class="o">,</span></span>
<span id="LC828" class="line" lang="java">      <span class="s">"spr\u00E5kkonventionsnamnet i funktionen format-number har \u00E4nnu inte hanterats!"</span><span class="o">},</span></span>
<span id="LC829" class="line" lang="java"></span>
<span id="LC830" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_PROPERTY_NOT_SUPPORTED</span><span class="o">,</span></span>
<span id="LC831" class="line" lang="java">      <span class="s">"XSL-egenskapen st\u00F6ds inte: {0}"</span><span class="o">},</span></span>
<span id="LC832" class="line" lang="java"></span>
<span id="LC833" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_DONT_DO_ANYTHING_WITH_NS</span><span class="o">,</span></span>
<span id="LC834" class="line" lang="java">      <span class="s">"G\u00F6r f\u00F6r n\u00E4rvarande inte n\u00E5gonting med namnrymden {0} i egenskap: {1}"</span><span class="o">},</span></span>
<span id="LC835" class="line" lang="java"></span>
<span id="LC836" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_SECURITY_EXCEPTION</span><span class="o">,</span></span>
<span id="LC837" class="line" lang="java">      <span class="s">"SecurityException vid f\u00F6rs\u00F6k att f\u00E5 \u00E5tkomst till XSL-systemegenskap: {0}"</span><span class="o">},</span></span>
<span id="LC838" class="line" lang="java"></span>
<span id="LC839" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_QUO_NO_LONGER_DEFINED</span><span class="o">,</span></span>
<span id="LC840" class="line" lang="java">      <span class="s">"Gammal syntax: quo(...) definieras inte l\u00E4ngre i XPath."</span><span class="o">},</span></span>
<span id="LC841" class="line" lang="java"></span>
<span id="LC842" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST</span><span class="o">,</span></span>
<span id="LC843" class="line" lang="java">      <span class="s">"XPath beh\u00F6ver ett h\u00E4rledningsobjekt f\u00F6r att implementera nodeTest!"</span><span class="o">},</span></span>
<span id="LC844" class="line" lang="java"></span>
<span id="LC845" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_FUNCTION_TOKEN_NOT_FOUND</span><span class="o">,</span></span>
<span id="LC846" class="line" lang="java">      <span class="s">"funktionstoken hittades inte."</span><span class="o">},</span></span>
<span id="LC847" class="line" lang="java"></span>
<span id="LC848" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_COULDNOT_FIND_FUNCTION</span><span class="o">,</span></span>
<span id="LC849" class="line" lang="java">      <span class="s">"Hittade inte funktionen: {0}"</span><span class="o">},</span></span>
<span id="LC850" class="line" lang="java"></span>
<span id="LC851" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_CANNOT_MAKE_URL_FROM</span><span class="o">,</span></span>
<span id="LC852" class="line" lang="java">      <span class="s">"Kan inte skapa URL fr\u00E5n: {0}"</span><span class="o">},</span></span>
<span id="LC853" class="line" lang="java"></span>
<span id="LC854" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_EXPAND_ENTITIES_NOT_SUPPORTED</span><span class="o">,</span></span>
<span id="LC855" class="line" lang="java">      <span class="s">"Alternativet -E st\u00F6ds inte i DTM-parser"</span><span class="o">},</span></span>
<span id="LC856" class="line" lang="java"></span>
<span id="LC857" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_ILLEGAL_VARIABLE_REFERENCE</span><span class="o">,</span></span>
<span id="LC858" class="line" lang="java">      <span class="s">"VariableReference angiven f\u00F6r variabel som \u00E4r utanf\u00F6r kontext eller som saknar definition! Namn = {0}"</span><span class="o">},</span></span>
<span id="LC859" class="line" lang="java"></span>
<span id="LC860" class="line" lang="java">  <span class="o">{</span> <span class="no">WG_UNSUPPORTED_ENCODING</span><span class="o">,</span></span>
<span id="LC861" class="line" lang="java">     <span class="s">"Kodning utan st\u00F6d: {0}"</span><span class="o">},</span></span>
<span id="LC862" class="line" lang="java"></span>
<span id="LC863" class="line" lang="java"></span>
<span id="LC864" class="line" lang="java"></span>
<span id="LC865" class="line" lang="java">  <span class="c1">// Other miscellaneous text used inside the code...</span></span>
<span id="LC866" class="line" lang="java">  <span class="o">{</span> <span class="s">"ui_language"</span><span class="o">,</span> <span class="s">"en"</span><span class="o">},</span></span>
<span id="LC867" class="line" lang="java">  <span class="o">{</span> <span class="s">"help_language"</span><span class="o">,</span> <span class="s">"en"</span><span class="o">},</span></span>
<span id="LC868" class="line" lang="java">  <span class="o">{</span> <span class="s">"language"</span><span class="o">,</span> <span class="s">"en"</span><span class="o">},</span></span>
<span id="LC869" class="line" lang="java">  <span class="o">{</span> <span class="s">"BAD_CODE"</span><span class="o">,</span> <span class="s">"Parameter f\u00F6r createMessage ligger utanf\u00F6r gr\u00E4nsv\u00E4rdet"</span><span class="o">},</span></span>
<span id="LC870" class="line" lang="java">  <span class="o">{</span> <span class="s">"FORMAT_FAILED"</span><span class="o">,</span> <span class="s">"Undantag utl\u00F6st vid messageFormat-anrop"</span><span class="o">},</span></span>
<span id="LC871" class="line" lang="java">  <span class="o">{</span> <span class="s">"version"</span><span class="o">,</span> <span class="s">"&gt;&gt;&gt;&gt;&gt;&gt;&gt; Xalan version "</span><span class="o">},</span></span>
<span id="LC872" class="line" lang="java">  <span class="o">{</span> <span class="s">"version2"</span><span class="o">,</span> <span class="s">"&lt;&lt;&lt;&lt;&lt;&lt;&lt;"</span><span class="o">},</span></span>
<span id="LC873" class="line" lang="java">  <span class="o">{</span> <span class="s">"yes"</span><span class="o">,</span> <span class="s">"ja"</span><span class="o">},</span></span>
<span id="LC874" class="line" lang="java">  <span class="o">{</span> <span class="s">"line"</span><span class="o">,</span> <span class="s">"Rad nr"</span><span class="o">},</span></span>
<span id="LC875" class="line" lang="java">  <span class="o">{</span> <span class="s">"column"</span><span class="o">,</span> <span class="s">"Kolumn nr"</span><span class="o">},</span></span>
<span id="LC876" class="line" lang="java">  <span class="o">{</span> <span class="s">"xsldone"</span><span class="o">,</span> <span class="s">"XSLProcessor: utf\u00F6rd"</span><span class="o">},</span></span>
<span id="LC877" class="line" lang="java">  <span class="o">{</span> <span class="s">"xpath_option"</span><span class="o">,</span> <span class="s">"xpath-alternativ: "</span><span class="o">},</span></span>
<span id="LC878" class="line" lang="java">  <span class="o">{</span> <span class="s">"optionIN"</span><span class="o">,</span> <span class="s">"   [-in inputXMLURL]"</span><span class="o">},</span></span>
<span id="LC879" class="line" lang="java">  <span class="o">{</span> <span class="s">"optionSelect"</span><span class="o">,</span> <span class="s">"   [-select xpath-uttryck]"</span><span class="o">},</span></span>
<span id="LC880" class="line" lang="java">  <span class="o">{</span> <span class="s">"optionMatch"</span><span class="o">,</span> <span class="s">"   [-match matchningsm\u00F6nster (f\u00F6r matchningsdiagnostik)]"</span><span class="o">},</span></span>
<span id="LC881" class="line" lang="java">  <span class="o">{</span> <span class="s">"optionAnyExpr"</span><span class="o">,</span> <span class="s">"Eller bara ett xpath-uttryck skapar en diagnostikdump"</span><span class="o">},</span></span>
<span id="LC882" class="line" lang="java">  <span class="o">{</span> <span class="s">"noParsermsg1"</span><span class="o">,</span> <span class="s">"XSL-processen utf\u00F6rdes inte."</span><span class="o">},</span></span>
<span id="LC883" class="line" lang="java">  <span class="o">{</span> <span class="s">"noParsermsg2"</span><span class="o">,</span> <span class="s">"** Hittade inte parser **"</span><span class="o">},</span></span>
<span id="LC884" class="line" lang="java">  <span class="o">{</span> <span class="s">"noParsermsg3"</span><span class="o">,</span> <span class="s">"Kontrollera klass\u00F6kv\u00E4gen."</span><span class="o">},</span></span>
<span id="LC885" class="line" lang="java">  <span class="o">{</span> <span class="s">"noParsermsg4"</span><span class="o">,</span> <span class="s">"Om du inte har IBMs XML Parser f\u00F6r Java kan du ladda ned den fr\u00E5n"</span><span class="o">},</span></span>
<span id="LC886" class="line" lang="java">  <span class="o">{</span> <span class="s">"noParsermsg5"</span><span class="o">,</span> <span class="s">"IBMs AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"</span><span class="o">},</span></span>
<span id="LC887" class="line" lang="java">  <span class="o">{</span> <span class="s">"gtone"</span><span class="o">,</span> <span class="s">"&gt;1"</span> <span class="o">},</span></span>
<span id="LC888" class="line" lang="java">  <span class="o">{</span> <span class="s">"zero"</span><span class="o">,</span> <span class="s">"0"</span> <span class="o">},</span></span>
<span id="LC889" class="line" lang="java">  <span class="o">{</span> <span class="s">"one"</span><span class="o">,</span> <span class="s">"1"</span> <span class="o">},</span></span>
<span id="LC890" class="line" lang="java">  <span class="o">{</span> <span class="s">"two"</span> <span class="o">,</span> <span class="s">"2"</span> <span class="o">},</span></span>
<span id="LC891" class="line" lang="java">  <span class="o">{</span> <span class="s">"three"</span><span class="o">,</span> <span class="s">"3"</span> <span class="o">}</span></span>
<span id="LC892" class="line" lang="java"></span>
<span id="LC893" class="line" lang="java">  <span class="o">};</span></span>
<span id="LC894" class="line" lang="java"></span>
<span id="LC895" class="line" lang="java">  <span class="cm">/**</span></span>
<span id="LC896" class="line" lang="java"><span class="cm">   * Get the association list.</span></span>
<span id="LC897" class="line" lang="java"><span class="cm">   *</span></span>
<span id="LC898" class="line" lang="java"><span class="cm">   * @return The association list.</span></span>
<span id="LC899" class="line" lang="java"><span class="cm">   */</span></span>
<span id="LC900" class="line" lang="java">  <span class="kd">public</span> <span class="nc">Object</span><span class="o">[][]</span> <span class="nf">getContents</span><span class="o">()</span></span>
<span id="LC901" class="line" lang="java">  <span class="o">{</span></span>
<span id="LC902" class="line" lang="java">      <span class="k">return</span> <span class="n">_contents</span><span class="o">;</span></span>
<span id="LC903" class="line" lang="java">  <span class="o">}</span></span>
<span id="LC904" class="line" lang="java"></span>
<span id="LC905" class="line" lang="java"></span>
<span id="LC906" class="line" lang="java">  <span class="c1">// ================= INFRASTRUCTURE ======================</span></span>
<span id="LC907" class="line" lang="java"></span>
<span id="LC908" class="line" lang="java">  <span class="cm">/** Field BAD_CODE          */</span></span>
<span id="LC909" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">BAD_CODE</span> <span class="o">=</span> <span class="s">"BAD_CODE"</span><span class="o">;</span></span>
<span id="LC910" class="line" lang="java"></span>
<span id="LC911" class="line" lang="java">  <span class="cm">/** Field FORMAT_FAILED          */</span></span>
<span id="LC912" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">FORMAT_FAILED</span> <span class="o">=</span> <span class="s">"FORMAT_FAILED"</span><span class="o">;</span></span>
<span id="LC913" class="line" lang="java"></span>
<span id="LC914" class="line" lang="java">  <span class="cm">/** Field ERROR_RESOURCES          */</span></span>
<span id="LC915" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ERROR_RESOURCES</span> <span class="o">=</span></span>
<span id="LC916" class="line" lang="java">    <span class="s">"com.sun.org.apache.xpath.internal.res.XPATHErrorResources"</span><span class="o">;</span></span>
<span id="LC917" class="line" lang="java"></span>
<span id="LC918" class="line" lang="java">  <span class="cm">/** Field ERROR_STRING          */</span></span>
<span id="LC919" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ERROR_STRING</span> <span class="o">=</span> <span class="s">"#error"</span><span class="o">;</span></span>
<span id="LC920" class="line" lang="java"></span>
<span id="LC921" class="line" lang="java">  <span class="cm">/** Field ERROR_HEADER          */</span></span>
<span id="LC922" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">ERROR_HEADER</span> <span class="o">=</span> <span class="s">"Error: "</span><span class="o">;</span></span>
<span id="LC923" class="line" lang="java"></span>
<span id="LC924" class="line" lang="java">  <span class="cm">/** Field WARNING_HEADER          */</span></span>
<span id="LC925" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">WARNING_HEADER</span> <span class="o">=</span> <span class="s">"Warning: "</span><span class="o">;</span></span>
<span id="LC926" class="line" lang="java"></span>
<span id="LC927" class="line" lang="java">  <span class="cm">/** Field XSL_HEADER          */</span></span>
<span id="LC928" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">XSL_HEADER</span> <span class="o">=</span> <span class="s">"XSL "</span><span class="o">;</span></span>
<span id="LC929" class="line" lang="java"></span>
<span id="LC930" class="line" lang="java">  <span class="cm">/** Field XML_HEADER          */</span></span>
<span id="LC931" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">XML_HEADER</span> <span class="o">=</span> <span class="s">"XML "</span><span class="o">;</span></span>
<span id="LC932" class="line" lang="java"></span>
<span id="LC933" class="line" lang="java">  <span class="cm">/** Field QUERY_HEADER          */</span></span>
<span id="LC934" class="line" lang="java">  <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">QUERY_HEADER</span> <span class="o">=</span> <span class="s">"PATTERN "</span><span class="o">;</span></span>
<span id="LC935" class="line" lang="java"></span>
<span id="LC936" class="line" lang="java"><span class="o">}</span></span>
