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
<a class="file-line-num diff-line-num" data-line-number="937" href="#L937" id="L937">
937
</a>
<a class="file-line-num diff-line-num" data-line-number="938" href="#L938" id="L938">
938
</a>
<a class="file-line-num diff-line-num" data-line-number="939" href="#L939" id="L939">
939
</a>
<a class="file-line-num diff-line-num" data-line-number="940" href="#L940" id="L940">
940
</a>
<a class="file-line-num diff-line-num" data-line-number="941" href="#L941" id="L941">
941
</a>
<a class="file-line-num diff-line-num" data-line-number="942" href="#L942" id="L942">
942
</a>
<a class="file-line-num diff-line-num" data-line-number="943" href="#L943" id="L943">
943
</a>
<a class="file-line-num diff-line-num" data-line-number="944" href="#L944" id="L944">
944
</a>
<a class="file-line-num diff-line-num" data-line-number="945" href="#L945" id="L945">
945
</a>
<a class="file-line-num diff-line-num" data-line-number="946" href="#L946" id="L946">
946
</a>
<a class="file-line-num diff-line-num" data-line-number="947" href="#L947" id="L947">
947
</a>
<a class="file-line-num diff-line-num" data-line-number="948" href="#L948" id="L948">
948
</a>
<a class="file-line-num diff-line-num" data-line-number="949" href="#L949" id="L949">
949
</a>
<a class="file-line-num diff-line-num" data-line-number="950" href="#L950" id="L950">
950
</a>
<a class="file-line-num diff-line-num" data-line-number="951" href="#L951" id="L951">
951
</a>
<a class="file-line-num diff-line-num" data-line-number="952" href="#L952" id="L952">
952
</a>
<a class="file-line-num diff-line-num" data-line-number="953" href="#L953" id="L953">
953
</a>
<a class="file-line-num diff-line-num" data-line-number="954" href="#L954" id="L954">
954
</a>
<a class="file-line-num diff-line-num" data-line-number="955" href="#L955" id="L955">
955
</a>
<a class="file-line-num diff-line-num" data-line-number="956" href="#L956" id="L956">
956
</a>
<a class="file-line-num diff-line-num" data-line-number="957" href="#L957" id="L957">
957
</a>
<a class="file-line-num diff-line-num" data-line-number="958" href="#L958" id="L958">
958
</a>
<a class="file-line-num diff-line-num" data-line-number="959" href="#L959" id="L959">
959
</a>
<a class="file-line-num diff-line-num" data-line-number="960" href="#L960" id="L960">
960
</a>
<a class="file-line-num diff-line-num" data-line-number="961" href="#L961" id="L961">
961
</a>
<a class="file-line-num diff-line-num" data-line-number="962" href="#L962" id="L962">
962
</a>
<a class="file-line-num diff-line-num" data-line-number="963" href="#L963" id="L963">
963
</a>
<a class="file-line-num diff-line-num" data-line-number="964" href="#L964" id="L964">
964
</a>
<a class="file-line-num diff-line-num" data-line-number="965" href="#L965" id="L965">
965
</a>
<a class="file-line-num diff-line-num" data-line-number="966" href="#L966" id="L966">
966
</a>
<a class="file-line-num diff-line-num" data-line-number="967" href="#L967" id="L967">
967
</a>
<a class="file-line-num diff-line-num" data-line-number="968" href="#L968" id="L968">
968
</a>
<a class="file-line-num diff-line-num" data-line-number="969" href="#L969" id="L969">
969
</a>
<a class="file-line-num diff-line-num" data-line-number="970" href="#L970" id="L970">
970
</a>
<a class="file-line-num diff-line-num" data-line-number="971" href="#L971" id="L971">
971
</a>
<a class="file-line-num diff-line-num" data-line-number="972" href="#L972" id="L972">
972
</a>
<a class="file-line-num diff-line-num" data-line-number="973" href="#L973" id="L973">
973
</a>
<a class="file-line-num diff-line-num" data-line-number="974" href="#L974" id="L974">
974
</a>
<a class="file-line-num diff-line-num" data-line-number="975" href="#L975" id="L975">
975
</a>
<a class="file-line-num diff-line-num" data-line-number="976" href="#L976" id="L976">
976
</a>
<a class="file-line-num diff-line-num" data-line-number="977" href="#L977" id="L977">
977
</a>
<a class="file-line-num diff-line-num" data-line-number="978" href="#L978" id="L978">
978
</a>
<a class="file-line-num diff-line-num" data-line-number="979" href="#L979" id="L979">
979
</a>
<a class="file-line-num diff-line-num" data-line-number="980" href="#L980" id="L980">
980
</a>
<a class="file-line-num diff-line-num" data-line-number="981" href="#L981" id="L981">
981
</a>
<a class="file-line-num diff-line-num" data-line-number="982" href="#L982" id="L982">
982
</a>
<a class="file-line-num diff-line-num" data-line-number="983" href="#L983" id="L983">
983
</a>
<a class="file-line-num diff-line-num" data-line-number="984" href="#L984" id="L984">
984
</a>
<a class="file-line-num diff-line-num" data-line-number="985" href="#L985" id="L985">
985
</a>
<a class="file-line-num diff-line-num" data-line-number="986" href="#L986" id="L986">
986
</a>
<a class="file-line-num diff-line-num" data-line-number="987" href="#L987" id="L987">
987
</a>
<a class="file-line-num diff-line-num" data-line-number="988" href="#L988" id="L988">
988
</a>
<a class="file-line-num diff-line-num" data-line-number="989" href="#L989" id="L989">
989
</a>
<a class="file-line-num diff-line-num" data-line-number="990" href="#L990" id="L990">
990
</a>
<a class="file-line-num diff-line-num" data-line-number="991" href="#L991" id="L991">
991
</a>
<a class="file-line-num diff-line-num" data-line-number="992" href="#L992" id="L992">
992
</a>
<a class="file-line-num diff-line-num" data-line-number="993" href="#L993" id="L993">
993
</a>
<a class="file-line-num diff-line-num" data-line-number="994" href="#L994" id="L994">
994
</a>
<a class="file-line-num diff-line-num" data-line-number="995" href="#L995" id="L995">
995
</a>
<a class="file-line-num diff-line-num" data-line-number="996" href="#L996" id="L996">
996
</a>
<a class="file-line-num diff-line-num" data-line-number="997" href="#L997" id="L997">
997
</a>
<a class="file-line-num diff-line-num" data-line-number="998" href="#L998" id="L998">
998
</a>
<a class="file-line-num diff-line-num" data-line-number="999" href="#L999" id="L999">
999
</a>
<a class="file-line-num diff-line-num" data-line-number="1000" href="#L1000" id="L1000">
1000
</a>
<a class="file-line-num diff-line-num" data-line-number="1001" href="#L1001" id="L1001">
1001
</a>
<a class="file-line-num diff-line-num" data-line-number="1002" href="#L1002" id="L1002">
1002
</a>
<a class="file-line-num diff-line-num" data-line-number="1003" href="#L1003" id="L1003">
1003
</a>
<a class="file-line-num diff-line-num" data-line-number="1004" href="#L1004" id="L1004">
1004
</a>
<a class="file-line-num diff-line-num" data-line-number="1005" href="#L1005" id="L1005">
1005
</a>
<a class="file-line-num diff-line-num" data-line-number="1006" href="#L1006" id="L1006">
1006
</a>
<a class="file-line-num diff-line-num" data-line-number="1007" href="#L1007" id="L1007">
1007
</a>
<a class="file-line-num diff-line-num" data-line-number="1008" href="#L1008" id="L1008">
1008
</a>
<a class="file-line-num diff-line-num" data-line-number="1009" href="#L1009" id="L1009">
1009
</a>
<a class="file-line-num diff-line-num" data-line-number="1010" href="#L1010" id="L1010">
1010
</a>
<a class="file-line-num diff-line-num" data-line-number="1011" href="#L1011" id="L1011">
1011
</a>
<a class="file-line-num diff-line-num" data-line-number="1012" href="#L1012" id="L1012">
1012
</a>
<a class="file-line-num diff-line-num" data-line-number="1013" href="#L1013" id="L1013">
1013
</a>
<a class="file-line-num diff-line-num" data-line-number="1014" href="#L1014" id="L1014">
1014
</a>
<a class="file-line-num diff-line-num" data-line-number="1015" href="#L1015" id="L1015">
1015
</a>
<a class="file-line-num diff-line-num" data-line-number="1016" href="#L1016" id="L1016">
1016
</a>
<a class="file-line-num diff-line-num" data-line-number="1017" href="#L1017" id="L1017">
1017
</a>
<a class="file-line-num diff-line-num" data-line-number="1018" href="#L1018" id="L1018">
1018
</a>
<a class="file-line-num diff-line-num" data-line-number="1019" href="#L1019" id="L1019">
1019
</a>
<a class="file-line-num diff-line-num" data-line-number="1020" href="#L1020" id="L1020">
1020
</a>
<a class="file-line-num diff-line-num" data-line-number="1021" href="#L1021" id="L1021">
1021
</a>
<a class="file-line-num diff-line-num" data-line-number="1022" href="#L1022" id="L1022">
1022
</a>
<a class="file-line-num diff-line-num" data-line-number="1023" href="#L1023" id="L1023">
1023
</a>
<a class="file-line-num diff-line-num" data-line-number="1024" href="#L1024" id="L1024">
1024
</a>
<a class="file-line-num diff-line-num" data-line-number="1025" href="#L1025" id="L1025">
1025
</a>
<a class="file-line-num diff-line-num" data-line-number="1026" href="#L1026" id="L1026">
1026
</a>
<a class="file-line-num diff-line-num" data-line-number="1027" href="#L1027" id="L1027">
1027
</a>
<a class="file-line-num diff-line-num" data-line-number="1028" href="#L1028" id="L1028">
1028
</a>
<a class="file-line-num diff-line-num" data-line-number="1029" href="#L1029" id="L1029">
1029
</a>
<a class="file-line-num diff-line-num" data-line-number="1030" href="#L1030" id="L1030">
1030
</a>
<a class="file-line-num diff-line-num" data-line-number="1031" href="#L1031" id="L1031">
1031
</a>
<a class="file-line-num diff-line-num" data-line-number="1032" href="#L1032" id="L1032">
1032
</a>
<a class="file-line-num diff-line-num" data-line-number="1033" href="#L1033" id="L1033">
1033
</a>
<a class="file-line-num diff-line-num" data-line-number="1034" href="#L1034" id="L1034">
1034
</a>
<a class="file-line-num diff-line-num" data-line-number="1035" href="#L1035" id="L1035">
1035
</a>
<a class="file-line-num diff-line-num" data-line-number="1036" href="#L1036" id="L1036">
1036
</a>
<a class="file-line-num diff-line-num" data-line-number="1037" href="#L1037" id="L1037">
1037
</a>
<a class="file-line-num diff-line-num" data-line-number="1038" href="#L1038" id="L1038">
1038
</a>
<a class="file-line-num diff-line-num" data-line-number="1039" href="#L1039" id="L1039">
1039
</a>
<a class="file-line-num diff-line-num" data-line-number="1040" href="#L1040" id="L1040">
1040
</a>
<a class="file-line-num diff-line-num" data-line-number="1041" href="#L1041" id="L1041">
1041
</a>
<a class="file-line-num diff-line-num" data-line-number="1042" href="#L1042" id="L1042">
1042
</a>
<a class="file-line-num diff-line-num" data-line-number="1043" href="#L1043" id="L1043">
1043
</a>
<a class="file-line-num diff-line-num" data-line-number="1044" href="#L1044" id="L1044">
1044
</a>
<a class="file-line-num diff-line-num" data-line-number="1045" href="#L1045" id="L1045">
1045
</a>
<a class="file-line-num diff-line-num" data-line-number="1046" href="#L1046" id="L1046">
1046
</a>
<a class="file-line-num diff-line-num" data-line-number="1047" href="#L1047" id="L1047">
1047
</a>
<a class="file-line-num diff-line-num" data-line-number="1048" href="#L1048" id="L1048">
1048
</a>
<a class="file-line-num diff-line-num" data-line-number="1049" href="#L1049" id="L1049">
1049
</a>
<a class="file-line-num diff-line-num" data-line-number="1050" href="#L1050" id="L1050">
1050
</a>
<a class="file-line-num diff-line-num" data-line-number="1051" href="#L1051" id="L1051">
1051
</a>
<a class="file-line-num diff-line-num" data-line-number="1052" href="#L1052" id="L1052">
1052
</a>
<a class="file-line-num diff-line-num" data-line-number="1053" href="#L1053" id="L1053">
1053
</a>
<a class="file-line-num diff-line-num" data-line-number="1054" href="#L1054" id="L1054">
1054
</a>
<a class="file-line-num diff-line-num" data-line-number="1055" href="#L1055" id="L1055">
1055
</a>
<a class="file-line-num diff-line-num" data-line-number="1056" href="#L1056" id="L1056">
1056
</a>
<a class="file-line-num diff-line-num" data-line-number="1057" href="#L1057" id="L1057">
1057
</a>
<a class="file-line-num diff-line-num" data-line-number="1058" href="#L1058" id="L1058">
1058
</a>
<a class="file-line-num diff-line-num" data-line-number="1059" href="#L1059" id="L1059">
1059
</a>
<a class="file-line-num diff-line-num" data-line-number="1060" href="#L1060" id="L1060">
1060
</a>
<a class="file-line-num diff-line-num" data-line-number="1061" href="#L1061" id="L1061">
1061
</a>
<a class="file-line-num diff-line-num" data-line-number="1062" href="#L1062" id="L1062">
1062
</a>
<a class="file-line-num diff-line-num" data-line-number="1063" href="#L1063" id="L1063">
1063
</a>
<a class="file-line-num diff-line-num" data-line-number="1064" href="#L1064" id="L1064">
1064
</a>
<a class="file-line-num diff-line-num" data-line-number="1065" href="#L1065" id="L1065">
1065
</a>
<a class="file-line-num diff-line-num" data-line-number="1066" href="#L1066" id="L1066">
1066
</a>
<a class="file-line-num diff-line-num" data-line-number="1067" href="#L1067" id="L1067">
1067
</a>
<a class="file-line-num diff-line-num" data-line-number="1068" href="#L1068" id="L1068">
1068
</a>
<a class="file-line-num diff-line-num" data-line-number="1069" href="#L1069" id="L1069">
1069
</a>
<a class="file-line-num diff-line-num" data-line-number="1070" href="#L1070" id="L1070">
1070
</a>
<a class="file-line-num diff-line-num" data-line-number="1071" href="#L1071" id="L1071">
1071
</a>
<a class="file-line-num diff-line-num" data-line-number="1072" href="#L1072" id="L1072">
1072
</a>
<a class="file-line-num diff-line-num" data-line-number="1073" href="#L1073" id="L1073">
1073
</a>
<a class="file-line-num diff-line-num" data-line-number="1074" href="#L1074" id="L1074">
1074
</a>
<a class="file-line-num diff-line-num" data-line-number="1075" href="#L1075" id="L1075">
1075
</a>
<a class="file-line-num diff-line-num" data-line-number="1076" href="#L1076" id="L1076">
1076
</a>
<a class="file-line-num diff-line-num" data-line-number="1077" href="#L1077" id="L1077">
1077
</a>
<a class="file-line-num diff-line-num" data-line-number="1078" href="#L1078" id="L1078">
1078
</a>
<a class="file-line-num diff-line-num" data-line-number="1079" href="#L1079" id="L1079">
1079
</a>
<a class="file-line-num diff-line-num" data-line-number="1080" href="#L1080" id="L1080">
1080
</a>
<a class="file-line-num diff-line-num" data-line-number="1081" href="#L1081" id="L1081">
1081
</a>
<a class="file-line-num diff-line-num" data-line-number="1082" href="#L1082" id="L1082">
1082
</a>
<a class="file-line-num diff-line-num" data-line-number="1083" href="#L1083" id="L1083">
1083
</a>
<a class="file-line-num diff-line-num" data-line-number="1084" href="#L1084" id="L1084">
1084
</a>
<a class="file-line-num diff-line-num" data-line-number="1085" href="#L1085" id="L1085">
1085
</a>
<a class="file-line-num diff-line-num" data-line-number="1086" href="#L1086" id="L1086">
1086
</a>
<a class="file-line-num diff-line-num" data-line-number="1087" href="#L1087" id="L1087">
1087
</a>
<a class="file-line-num diff-line-num" data-line-number="1088" href="#L1088" id="L1088">
1088
</a>
<a class="file-line-num diff-line-num" data-line-number="1089" href="#L1089" id="L1089">
1089
</a>
<a class="file-line-num diff-line-num" data-line-number="1090" href="#L1090" id="L1090">
1090
</a>
<a class="file-line-num diff-line-num" data-line-number="1091" href="#L1091" id="L1091">
1091
</a>
<a class="file-line-num diff-line-num" data-line-number="1092" href="#L1092" id="L1092">
1092
</a>
<a class="file-line-num diff-line-num" data-line-number="1093" href="#L1093" id="L1093">
1093
</a>
<a class="file-line-num diff-line-num" data-line-number="1094" href="#L1094" id="L1094">
1094
</a>
<a class="file-line-num diff-line-num" data-line-number="1095" href="#L1095" id="L1095">
1095
</a>
<a class="file-line-num diff-line-num" data-line-number="1096" href="#L1096" id="L1096">
1096
</a>
<a class="file-line-num diff-line-num" data-line-number="1097" href="#L1097" id="L1097">
1097
</a>
<a class="file-line-num diff-line-num" data-line-number="1098" href="#L1098" id="L1098">
1098
</a>
<a class="file-line-num diff-line-num" data-line-number="1099" href="#L1099" id="L1099">
1099
</a>
<a class="file-line-num diff-line-num" data-line-number="1100" href="#L1100" id="L1100">
1100
</a>
<a class="file-line-num diff-line-num" data-line-number="1101" href="#L1101" id="L1101">
1101
</a>
<a class="file-line-num diff-line-num" data-line-number="1102" href="#L1102" id="L1102">
1102
</a>
<a class="file-line-num diff-line-num" data-line-number="1103" href="#L1103" id="L1103">
1103
</a>
<a class="file-line-num diff-line-num" data-line-number="1104" href="#L1104" id="L1104">
1104
</a>
<a class="file-line-num diff-line-num" data-line-number="1105" href="#L1105" id="L1105">
1105
</a>
<a class="file-line-num diff-line-num" data-line-number="1106" href="#L1106" id="L1106">
1106
</a>
<a class="file-line-num diff-line-num" data-line-number="1107" href="#L1107" id="L1107">
1107
</a>
<a class="file-line-num diff-line-num" data-line-number="1108" href="#L1108" id="L1108">
1108
</a>
<a class="file-line-num diff-line-num" data-line-number="1109" href="#L1109" id="L1109">
1109
</a>
<a class="file-line-num diff-line-num" data-line-number="1110" href="#L1110" id="L1110">
1110
</a>
<a class="file-line-num diff-line-num" data-line-number="1111" href="#L1111" id="L1111">
1111
</a>
<a class="file-line-num diff-line-num" data-line-number="1112" href="#L1112" id="L1112">
1112
</a>
<a class="file-line-num diff-line-num" data-line-number="1113" href="#L1113" id="L1113">
1113
</a>
<a class="file-line-num diff-line-num" data-line-number="1114" href="#L1114" id="L1114">
1114
</a>
<a class="file-line-num diff-line-num" data-line-number="1115" href="#L1115" id="L1115">
1115
</a>
<a class="file-line-num diff-line-num" data-line-number="1116" href="#L1116" id="L1116">
1116
</a>
<a class="file-line-num diff-line-num" data-line-number="1117" href="#L1117" id="L1117">
1117
</a>
<a class="file-line-num diff-line-num" data-line-number="1118" href="#L1118" id="L1118">
1118
</a>
<a class="file-line-num diff-line-num" data-line-number="1119" href="#L1119" id="L1119">
1119
</a>
<a class="file-line-num diff-line-num" data-line-number="1120" href="#L1120" id="L1120">
1120
</a>
<a class="file-line-num diff-line-num" data-line-number="1121" href="#L1121" id="L1121">
1121
</a>
<a class="file-line-num diff-line-num" data-line-number="1122" href="#L1122" id="L1122">
1122
</a>
<a class="file-line-num diff-line-num" data-line-number="1123" href="#L1123" id="L1123">
1123
</a>
<a class="file-line-num diff-line-num" data-line-number="1124" href="#L1124" id="L1124">
1124
</a>
<a class="file-line-num diff-line-num" data-line-number="1125" href="#L1125" id="L1125">
1125
</a>
<a class="file-line-num diff-line-num" data-line-number="1126" href="#L1126" id="L1126">
1126
</a>
<a class="file-line-num diff-line-num" data-line-number="1127" href="#L1127" id="L1127">
1127
</a>
<a class="file-line-num diff-line-num" data-line-number="1128" href="#L1128" id="L1128">
1128
</a>
<a class="file-line-num diff-line-num" data-line-number="1129" href="#L1129" id="L1129">
1129
</a>
<a class="file-line-num diff-line-num" data-line-number="1130" href="#L1130" id="L1130">
1130
</a>
<a class="file-line-num diff-line-num" data-line-number="1131" href="#L1131" id="L1131">
1131
</a>
<a class="file-line-num diff-line-num" data-line-number="1132" href="#L1132" id="L1132">
1132
</a>
<a class="file-line-num diff-line-num" data-line-number="1133" href="#L1133" id="L1133">
1133
</a>
<a class="file-line-num diff-line-num" data-line-number="1134" href="#L1134" id="L1134">
1134
</a>
<a class="file-line-num diff-line-num" data-line-number="1135" href="#L1135" id="L1135">
1135
</a>
<a class="file-line-num diff-line-num" data-line-number="1136" href="#L1136" id="L1136">
1136
</a>
<a class="file-line-num diff-line-num" data-line-number="1137" href="#L1137" id="L1137">
1137
</a>
<a class="file-line-num diff-line-num" data-line-number="1138" href="#L1138" id="L1138">
1138
</a>
<a class="file-line-num diff-line-num" data-line-number="1139" href="#L1139" id="L1139">
1139
</a>
<a class="file-line-num diff-line-num" data-line-number="1140" href="#L1140" id="L1140">
1140
</a>
<a class="file-line-num diff-line-num" data-line-number="1141" href="#L1141" id="L1141">
1141
</a>
<a class="file-line-num diff-line-num" data-line-number="1142" href="#L1142" id="L1142">
1142
</a>
<a class="file-line-num diff-line-num" data-line-number="1143" href="#L1143" id="L1143">
1143
</a>
<a class="file-line-num diff-line-num" data-line-number="1144" href="#L1144" id="L1144">
1144
</a>
<a class="file-line-num diff-line-num" data-line-number="1145" href="#L1145" id="L1145">
1145
</a>
<a class="file-line-num diff-line-num" data-line-number="1146" href="#L1146" id="L1146">
1146
</a>
<a class="file-line-num diff-line-num" data-line-number="1147" href="#L1147" id="L1147">
1147
</a>
<a class="file-line-num diff-line-num" data-line-number="1148" href="#L1148" id="L1148">
1148
</a>
<a class="file-line-num diff-line-num" data-line-number="1149" href="#L1149" id="L1149">
1149
</a>
<a class="file-line-num diff-line-num" data-line-number="1150" href="#L1150" id="L1150">
1150
</a>
<a class="file-line-num diff-line-num" data-line-number="1151" href="#L1151" id="L1151">
1151
</a>
<a class="file-line-num diff-line-num" data-line-number="1152" href="#L1152" id="L1152">
1152
</a>
<a class="file-line-num diff-line-num" data-line-number="1153" href="#L1153" id="L1153">
1153
</a>
<a class="file-line-num diff-line-num" data-line-number="1154" href="#L1154" id="L1154">
1154
</a>
<a class="file-line-num diff-line-num" data-line-number="1155" href="#L1155" id="L1155">
1155
</a>
<a class="file-line-num diff-line-num" data-line-number="1156" href="#L1156" id="L1156">
1156
</a>
<a class="file-line-num diff-line-num" data-line-number="1157" href="#L1157" id="L1157">
1157
</a>
<a class="file-line-num diff-line-num" data-line-number="1158" href="#L1158" id="L1158">
1158
</a>
<a class="file-line-num diff-line-num" data-line-number="1159" href="#L1159" id="L1159">
1159
</a>
<a class="file-line-num diff-line-num" data-line-number="1160" href="#L1160" id="L1160">
1160
</a>
<a class="file-line-num diff-line-num" data-line-number="1161" href="#L1161" id="L1161">
1161
</a>
<a class="file-line-num diff-line-num" data-line-number="1162" href="#L1162" id="L1162">
1162
</a>
<a class="file-line-num diff-line-num" data-line-number="1163" href="#L1163" id="L1163">
1163
</a>
<a class="file-line-num diff-line-num" data-line-number="1164" href="#L1164" id="L1164">
1164
</a>
<a class="file-line-num diff-line-num" data-line-number="1165" href="#L1165" id="L1165">
1165
</a>
<a class="file-line-num diff-line-num" data-line-number="1166" href="#L1166" id="L1166">
1166
</a>
<a class="file-line-num diff-line-num" data-line-number="1167" href="#L1167" id="L1167">
1167
</a>
<a class="file-line-num diff-line-num" data-line-number="1168" href="#L1168" id="L1168">
1168
</a>
<a class="file-line-num diff-line-num" data-line-number="1169" href="#L1169" id="L1169">
1169
</a>
<a class="file-line-num diff-line-num" data-line-number="1170" href="#L1170" id="L1170">
1170
</a>
<a class="file-line-num diff-line-num" data-line-number="1171" href="#L1171" id="L1171">
1171
</a>
<a class="file-line-num diff-line-num" data-line-number="1172" href="#L1172" id="L1172">
1172
</a>
<a class="file-line-num diff-line-num" data-line-number="1173" href="#L1173" id="L1173">
1173
</a>
<a class="file-line-num diff-line-num" data-line-number="1174" href="#L1174" id="L1174">
1174
</a>
<a class="file-line-num diff-line-num" data-line-number="1175" href="#L1175" id="L1175">
1175
</a>
<a class="file-line-num diff-line-num" data-line-number="1176" href="#L1176" id="L1176">
1176
</a>
<a class="file-line-num diff-line-num" data-line-number="1177" href="#L1177" id="L1177">
1177
</a>
<a class="file-line-num diff-line-num" data-line-number="1178" href="#L1178" id="L1178">
1178
</a>
<a class="file-line-num diff-line-num" data-line-number="1179" href="#L1179" id="L1179">
1179
</a>
<a class="file-line-num diff-line-num" data-line-number="1180" href="#L1180" id="L1180">
1180
</a>
<a class="file-line-num diff-line-num" data-line-number="1181" href="#L1181" id="L1181">
1181
</a>
<a class="file-line-num diff-line-num" data-line-number="1182" href="#L1182" id="L1182">
1182
</a>
<a class="file-line-num diff-line-num" data-line-number="1183" href="#L1183" id="L1183">
1183
</a>
<a class="file-line-num diff-line-num" data-line-number="1184" href="#L1184" id="L1184">
1184
</a>
<a class="file-line-num diff-line-num" data-line-number="1185" href="#L1185" id="L1185">
1185
</a>
<a class="file-line-num diff-line-num" data-line-number="1186" href="#L1186" id="L1186">
1186
</a>
<a class="file-line-num diff-line-num" data-line-number="1187" href="#L1187" id="L1187">
1187
</a>
<a class="file-line-num diff-line-num" data-line-number="1188" href="#L1188" id="L1188">
1188
</a>
<a class="file-line-num diff-line-num" data-line-number="1189" href="#L1189" id="L1189">
1189
</a>
<a class="file-line-num diff-line-num" data-line-number="1190" href="#L1190" id="L1190">
1190
</a>
<a class="file-line-num diff-line-num" data-line-number="1191" href="#L1191" id="L1191">
1191
</a>
<a class="file-line-num diff-line-num" data-line-number="1192" href="#L1192" id="L1192">
1192
</a>
<a class="file-line-num diff-line-num" data-line-number="1193" href="#L1193" id="L1193">
1193
</a>
<a class="file-line-num diff-line-num" data-line-number="1194" href="#L1194" id="L1194">
1194
</a>
<a class="file-line-num diff-line-num" data-line-number="1195" href="#L1195" id="L1195">
1195
</a>
<a class="file-line-num diff-line-num" data-line-number="1196" href="#L1196" id="L1196">
1196
</a>
<a class="file-line-num diff-line-num" data-line-number="1197" href="#L1197" id="L1197">
1197
</a>
<a class="file-line-num diff-line-num" data-line-number="1198" href="#L1198" id="L1198">
1198
</a>
<a class="file-line-num diff-line-num" data-line-number="1199" href="#L1199" id="L1199">
1199
</a>
<a class="file-line-num diff-line-num" data-line-number="1200" href="#L1200" id="L1200">
1200
</a>
<a class="file-line-num diff-line-num" data-line-number="1201" href="#L1201" id="L1201">
1201
</a>
<a class="file-line-num diff-line-num" data-line-number="1202" href="#L1202" id="L1202">
1202
</a>
<a class="file-line-num diff-line-num" data-line-number="1203" href="#L1203" id="L1203">
1203
</a>
<a class="file-line-num diff-line-num" data-line-number="1204" href="#L1204" id="L1204">
1204
</a>
<a class="file-line-num diff-line-num" data-line-number="1205" href="#L1205" id="L1205">
1205
</a>
<a class="file-line-num diff-line-num" data-line-number="1206" href="#L1206" id="L1206">
1206
</a>
<a class="file-line-num diff-line-num" data-line-number="1207" href="#L1207" id="L1207">
1207
</a>
<a class="file-line-num diff-line-num" data-line-number="1208" href="#L1208" id="L1208">
1208
</a>
<a class="file-line-num diff-line-num" data-line-number="1209" href="#L1209" id="L1209">
1209
</a>
<a class="file-line-num diff-line-num" data-line-number="1210" href="#L1210" id="L1210">
1210
</a>
<a class="file-line-num diff-line-num" data-line-number="1211" href="#L1211" id="L1211">
1211
</a>
<a class="file-line-num diff-line-num" data-line-number="1212" href="#L1212" id="L1212">
1212
</a>
<a class="file-line-num diff-line-num" data-line-number="1213" href="#L1213" id="L1213">
1213
</a>
<a class="file-line-num diff-line-num" data-line-number="1214" href="#L1214" id="L1214">
1214
</a>
<a class="file-line-num diff-line-num" data-line-number="1215" href="#L1215" id="L1215">
1215
</a>
<a class="file-line-num diff-line-num" data-line-number="1216" href="#L1216" id="L1216">
1216
</a>
<a class="file-line-num diff-line-num" data-line-number="1217" href="#L1217" id="L1217">
1217
</a>
<a class="file-line-num diff-line-num" data-line-number="1218" href="#L1218" id="L1218">
1218
</a>
<a class="file-line-num diff-line-num" data-line-number="1219" href="#L1219" id="L1219">
1219
</a>
<a class="file-line-num diff-line-num" data-line-number="1220" href="#L1220" id="L1220">
1220
</a>
<a class="file-line-num diff-line-num" data-line-number="1221" href="#L1221" id="L1221">
1221
</a>
<a class="file-line-num diff-line-num" data-line-number="1222" href="#L1222" id="L1222">
1222
</a>
<a class="file-line-num diff-line-num" data-line-number="1223" href="#L1223" id="L1223">
1223
</a>
<a class="file-line-num diff-line-num" data-line-number="1224" href="#L1224" id="L1224">
1224
</a>
<a class="file-line-num diff-line-num" data-line-number="1225" href="#L1225" id="L1225">
1225
</a>
<a class="file-line-num diff-line-num" data-line-number="1226" href="#L1226" id="L1226">
1226
</a>
<a class="file-line-num diff-line-num" data-line-number="1227" href="#L1227" id="L1227">
1227
</a>
<a class="file-line-num diff-line-num" data-line-number="1228" href="#L1228" id="L1228">
1228
</a>
<a class="file-line-num diff-line-num" data-line-number="1229" href="#L1229" id="L1229">
1229
</a>
<a class="file-line-num diff-line-num" data-line-number="1230" href="#L1230" id="L1230">
1230
</a>
<a class="file-line-num diff-line-num" data-line-number="1231" href="#L1231" id="L1231">
1231
</a>
<a class="file-line-num diff-line-num" data-line-number="1232" href="#L1232" id="L1232">
1232
</a>
<a class="file-line-num diff-line-num" data-line-number="1233" href="#L1233" id="L1233">
1233
</a>
<a class="file-line-num diff-line-num" data-line-number="1234" href="#L1234" id="L1234">
1234
</a>
<a class="file-line-num diff-line-num" data-line-number="1235" href="#L1235" id="L1235">
1235
</a>
<a class="file-line-num diff-line-num" data-line-number="1236" href="#L1236" id="L1236">
1236
</a>
<a class="file-line-num diff-line-num" data-line-number="1237" href="#L1237" id="L1237">
1237
</a>
<a class="file-line-num diff-line-num" data-line-number="1238" href="#L1238" id="L1238">
1238
</a>
<a class="file-line-num diff-line-num" data-line-number="1239" href="#L1239" id="L1239">
1239
</a>
<a class="file-line-num diff-line-num" data-line-number="1240" href="#L1240" id="L1240">
1240
</a>
<a class="file-line-num diff-line-num" data-line-number="1241" href="#L1241" id="L1241">
1241
</a>
<a class="file-line-num diff-line-num" data-line-number="1242" href="#L1242" id="L1242">
1242
</a>
<a class="file-line-num diff-line-num" data-line-number="1243" href="#L1243" id="L1243">
1243
</a>
<a class="file-line-num diff-line-num" data-line-number="1244" href="#L1244" id="L1244">
1244
</a>
<a class="file-line-num diff-line-num" data-line-number="1245" href="#L1245" id="L1245">
1245
</a>
<a class="file-line-num diff-line-num" data-line-number="1246" href="#L1246" id="L1246">
1246
</a>
<a class="file-line-num diff-line-num" data-line-number="1247" href="#L1247" id="L1247">
1247
</a>
<a class="file-line-num diff-line-num" data-line-number="1248" href="#L1248" id="L1248">
1248
</a>
<a class="file-line-num diff-line-num" data-line-number="1249" href="#L1249" id="L1249">
1249
</a>
<a class="file-line-num diff-line-num" data-line-number="1250" href="#L1250" id="L1250">
1250
</a>
<a class="file-line-num diff-line-num" data-line-number="1251" href="#L1251" id="L1251">
1251
</a>
<a class="file-line-num diff-line-num" data-line-number="1252" href="#L1252" id="L1252">
1252
</a>
<a class="file-line-num diff-line-num" data-line-number="1253" href="#L1253" id="L1253">
1253
</a>
<a class="file-line-num diff-line-num" data-line-number="1254" href="#L1254" id="L1254">
1254
</a>
<a class="file-line-num diff-line-num" data-line-number="1255" href="#L1255" id="L1255">
1255
</a>
<a class="file-line-num diff-line-num" data-line-number="1256" href="#L1256" id="L1256">
1256
</a>
<a class="file-line-num diff-line-num" data-line-number="1257" href="#L1257" id="L1257">
1257
</a>
<a class="file-line-num diff-line-num" data-line-number="1258" href="#L1258" id="L1258">
1258
</a>
<a class="file-line-num diff-line-num" data-line-number="1259" href="#L1259" id="L1259">
1259
</a>
<a class="file-line-num diff-line-num" data-line-number="1260" href="#L1260" id="L1260">
1260
</a>
<a class="file-line-num diff-line-num" data-line-number="1261" href="#L1261" id="L1261">
1261
</a>
<a class="file-line-num diff-line-num" data-line-number="1262" href="#L1262" id="L1262">
1262
</a>
<a class="file-line-num diff-line-num" data-line-number="1263" href="#L1263" id="L1263">
1263
</a>
<a class="file-line-num diff-line-num" data-line-number="1264" href="#L1264" id="L1264">
1264
</a>
<a class="file-line-num diff-line-num" data-line-number="1265" href="#L1265" id="L1265">
1265
</a>
<a class="file-line-num diff-line-num" data-line-number="1266" href="#L1266" id="L1266">
1266
</a>
<a class="file-line-num diff-line-num" data-line-number="1267" href="#L1267" id="L1267">
1267
</a>
<a class="file-line-num diff-line-num" data-line-number="1268" href="#L1268" id="L1268">
1268
</a>
<a class="file-line-num diff-line-num" data-line-number="1269" href="#L1269" id="L1269">
1269
</a>
<a class="file-line-num diff-line-num" data-line-number="1270" href="#L1270" id="L1270">
1270
</a>
<a class="file-line-num diff-line-num" data-line-number="1271" href="#L1271" id="L1271">
1271
</a>
<a class="file-line-num diff-line-num" data-line-number="1272" href="#L1272" id="L1272">
1272
</a>
<a class="file-line-num diff-line-num" data-line-number="1273" href="#L1273" id="L1273">
1273
</a>
<a class="file-line-num diff-line-num" data-line-number="1274" href="#L1274" id="L1274">
1274
</a>
<a class="file-line-num diff-line-num" data-line-number="1275" href="#L1275" id="L1275">
1275
</a>
<a class="file-line-num diff-line-num" data-line-number="1276" href="#L1276" id="L1276">
1276
</a>
<a class="file-line-num diff-line-num" data-line-number="1277" href="#L1277" id="L1277">
1277
</a>
<a class="file-line-num diff-line-num" data-line-number="1278" href="#L1278" id="L1278">
1278
</a>
<a class="file-line-num diff-line-num" data-line-number="1279" href="#L1279" id="L1279">
1279
</a>
<a class="file-line-num diff-line-num" data-line-number="1280" href="#L1280" id="L1280">
1280
</a>
<a class="file-line-num diff-line-num" data-line-number="1281" href="#L1281" id="L1281">
1281
</a>
<a class="file-line-num diff-line-num" data-line-number="1282" href="#L1282" id="L1282">
1282
</a>
<a class="file-line-num diff-line-num" data-line-number="1283" href="#L1283" id="L1283">
1283
</a>
<a class="file-line-num diff-line-num" data-line-number="1284" href="#L1284" id="L1284">
1284
</a>
<a class="file-line-num diff-line-num" data-line-number="1285" href="#L1285" id="L1285">
1285
</a>
<a class="file-line-num diff-line-num" data-line-number="1286" href="#L1286" id="L1286">
1286
</a>
<a class="file-line-num diff-line-num" data-line-number="1287" href="#L1287" id="L1287">
1287
</a>
<a class="file-line-num diff-line-num" data-line-number="1288" href="#L1288" id="L1288">
1288
</a>
<a class="file-line-num diff-line-num" data-line-number="1289" href="#L1289" id="L1289">
1289
</a>
<a class="file-line-num diff-line-num" data-line-number="1290" href="#L1290" id="L1290">
1290
</a>
<a class="file-line-num diff-line-num" data-line-number="1291" href="#L1291" id="L1291">
1291
</a>
<a class="file-line-num diff-line-num" data-line-number="1292" href="#L1292" id="L1292">
1292
</a>
<a class="file-line-num diff-line-num" data-line-number="1293" href="#L1293" id="L1293">
1293
</a>
<a class="file-line-num diff-line-num" data-line-number="1294" href="#L1294" id="L1294">
1294
</a>
<a class="file-line-num diff-line-num" data-line-number="1295" href="#L1295" id="L1295">
1295
</a>
<a class="file-line-num diff-line-num" data-line-number="1296" href="#L1296" id="L1296">
1296
</a>
<a class="file-line-num diff-line-num" data-line-number="1297" href="#L1297" id="L1297">
1297
</a>
<a class="file-line-num diff-line-num" data-line-number="1298" href="#L1298" id="L1298">
1298
</a>
<a class="file-line-num diff-line-num" data-line-number="1299" href="#L1299" id="L1299">
1299
</a>
<a class="file-line-num diff-line-num" data-line-number="1300" href="#L1300" id="L1300">
1300
</a>
<a class="file-line-num diff-line-num" data-line-number="1301" href="#L1301" id="L1301">
1301
</a>
<a class="file-line-num diff-line-num" data-line-number="1302" href="#L1302" id="L1302">
1302
</a>
<a class="file-line-num diff-line-num" data-line-number="1303" href="#L1303" id="L1303">
1303
</a>
<a class="file-line-num diff-line-num" data-line-number="1304" href="#L1304" id="L1304">
1304
</a>
<a class="file-line-num diff-line-num" data-line-number="1305" href="#L1305" id="L1305">
1305
</a>
<a class="file-line-num diff-line-num" data-line-number="1306" href="#L1306" id="L1306">
1306
</a>
<a class="file-line-num diff-line-num" data-line-number="1307" href="#L1307" id="L1307">
1307
</a>
<a class="file-line-num diff-line-num" data-line-number="1308" href="#L1308" id="L1308">
1308
</a>
<a class="file-line-num diff-line-num" data-line-number="1309" href="#L1309" id="L1309">
1309
</a>
<a class="file-line-num diff-line-num" data-line-number="1310" href="#L1310" id="L1310">
1310
</a>
<a class="file-line-num diff-line-num" data-line-number="1311" href="#L1311" id="L1311">
1311
</a>
<a class="file-line-num diff-line-num" data-line-number="1312" href="#L1312" id="L1312">
1312
</a>
<a class="file-line-num diff-line-num" data-line-number="1313" href="#L1313" id="L1313">
1313
</a>
<a class="file-line-num diff-line-num" data-line-number="1314" href="#L1314" id="L1314">
1314
</a>
<a class="file-line-num diff-line-num" data-line-number="1315" href="#L1315" id="L1315">
1315
</a>
<a class="file-line-num diff-line-num" data-line-number="1316" href="#L1316" id="L1316">
1316
</a>
<a class="file-line-num diff-line-num" data-line-number="1317" href="#L1317" id="L1317">
1317
</a>
<a class="file-line-num diff-line-num" data-line-number="1318" href="#L1318" id="L1318">
1318
</a>
<a class="file-line-num diff-line-num" data-line-number="1319" href="#L1319" id="L1319">
1319
</a>
<a class="file-line-num diff-line-num" data-line-number="1320" href="#L1320" id="L1320">
1320
</a>
<a class="file-line-num diff-line-num" data-line-number="1321" href="#L1321" id="L1321">
1321
</a>
<a class="file-line-num diff-line-num" data-line-number="1322" href="#L1322" id="L1322">
1322
</a>
<a class="file-line-num diff-line-num" data-line-number="1323" href="#L1323" id="L1323">
1323
</a>
<a class="file-line-num diff-line-num" data-line-number="1324" href="#L1324" id="L1324">
1324
</a>
<a class="file-line-num diff-line-num" data-line-number="1325" href="#L1325" id="L1325">
1325
</a>
<a class="file-line-num diff-line-num" data-line-number="1326" href="#L1326" id="L1326">
1326
</a>
<a class="file-line-num diff-line-num" data-line-number="1327" href="#L1327" id="L1327">
1327
</a>
<a class="file-line-num diff-line-num" data-line-number="1328" href="#L1328" id="L1328">
1328
</a>
<a class="file-line-num diff-line-num" data-line-number="1329" href="#L1329" id="L1329">
1329
</a>
<a class="file-line-num diff-line-num" data-line-number="1330" href="#L1330" id="L1330">
1330
</a>
<a class="file-line-num diff-line-num" data-line-number="1331" href="#L1331" id="L1331">
1331
</a>
<a class="file-line-num diff-line-num" data-line-number="1332" href="#L1332" id="L1332">
1332
</a>
<a class="file-line-num diff-line-num" data-line-number="1333" href="#L1333" id="L1333">
1333
</a>
<a class="file-line-num diff-line-num" data-line-number="1334" href="#L1334" id="L1334">
1334
</a>
<a class="file-line-num diff-line-num" data-line-number="1335" href="#L1335" id="L1335">
1335
</a>
<a class="file-line-num diff-line-num" data-line-number="1336" href="#L1336" id="L1336">
1336
</a>
<a class="file-line-num diff-line-num" data-line-number="1337" href="#L1337" id="L1337">
1337
</a>
<a class="file-line-num diff-line-num" data-line-number="1338" href="#L1338" id="L1338">
1338
</a>
<a class="file-line-num diff-line-num" data-line-number="1339" href="#L1339" id="L1339">
1339
</a>
<a class="file-line-num diff-line-num" data-line-number="1340" href="#L1340" id="L1340">
1340
</a>
<a class="file-line-num diff-line-num" data-line-number="1341" href="#L1341" id="L1341">
1341
</a>
<a class="file-line-num diff-line-num" data-line-number="1342" href="#L1342" id="L1342">
1342
</a>
<a class="file-line-num diff-line-num" data-line-number="1343" href="#L1343" id="L1343">
1343
</a>
<a class="file-line-num diff-line-num" data-line-number="1344" href="#L1344" id="L1344">
1344
</a>
<a class="file-line-num diff-line-num" data-line-number="1345" href="#L1345" id="L1345">
1345
</a>
<a class="file-line-num diff-line-num" data-line-number="1346" href="#L1346" id="L1346">
1346
</a>
<a class="file-line-num diff-line-num" data-line-number="1347" href="#L1347" id="L1347">
1347
</a>
<a class="file-line-num diff-line-num" data-line-number="1348" href="#L1348" id="L1348">
1348
</a>
<a class="file-line-num diff-line-num" data-line-number="1349" href="#L1349" id="L1349">
1349
</a>
<a class="file-line-num diff-line-num" data-line-number="1350" href="#L1350" id="L1350">
1350
</a>
<a class="file-line-num diff-line-num" data-line-number="1351" href="#L1351" id="L1351">
1351
</a>
<a class="file-line-num diff-line-num" data-line-number="1352" href="#L1352" id="L1352">
1352
</a>
<a class="file-line-num diff-line-num" data-line-number="1353" href="#L1353" id="L1353">
1353
</a>
<a class="file-line-num diff-line-num" data-line-number="1354" href="#L1354" id="L1354">
1354
</a>
<a class="file-line-num diff-line-num" data-line-number="1355" href="#L1355" id="L1355">
1355
</a>
<a class="file-line-num diff-line-num" data-line-number="1356" href="#L1356" id="L1356">
1356
</a>
<a class="file-line-num diff-line-num" data-line-number="1357" href="#L1357" id="L1357">
1357
</a>
<a class="file-line-num diff-line-num" data-line-number="1358" href="#L1358" id="L1358">
1358
</a>
<a class="file-line-num diff-line-num" data-line-number="1359" href="#L1359" id="L1359">
1359
</a>
<a class="file-line-num diff-line-num" data-line-number="1360" href="#L1360" id="L1360">
1360
</a>
<a class="file-line-num diff-line-num" data-line-number="1361" href="#L1361" id="L1361">
1361
</a>
<a class="file-line-num diff-line-num" data-line-number="1362" href="#L1362" id="L1362">
1362
</a>
<a class="file-line-num diff-line-num" data-line-number="1363" href="#L1363" id="L1363">
1363
</a>
<a class="file-line-num diff-line-num" data-line-number="1364" href="#L1364" id="L1364">
1364
</a>
<a class="file-line-num diff-line-num" data-line-number="1365" href="#L1365" id="L1365">
1365
</a>
<a class="file-line-num diff-line-num" data-line-number="1366" href="#L1366" id="L1366">
1366
</a>
<a class="file-line-num diff-line-num" data-line-number="1367" href="#L1367" id="L1367">
1367
</a>
<a class="file-line-num diff-line-num" data-line-number="1368" href="#L1368" id="L1368">
1368
</a>
<a class="file-line-num diff-line-num" data-line-number="1369" href="#L1369" id="L1369">
1369
</a>
<a class="file-line-num diff-line-num" data-line-number="1370" href="#L1370" id="L1370">
1370
</a>
<a class="file-line-num diff-line-num" data-line-number="1371" href="#L1371" id="L1371">
1371
</a>
<a class="file-line-num diff-line-num" data-line-number="1372" href="#L1372" id="L1372">
1372
</a>
<a class="file-line-num diff-line-num" data-line-number="1373" href="#L1373" id="L1373">
1373
</a>
<a class="file-line-num diff-line-num" data-line-number="1374" href="#L1374" id="L1374">
1374
</a>
<a class="file-line-num diff-line-num" data-line-number="1375" href="#L1375" id="L1375">
1375
</a>
<a class="file-line-num diff-line-num" data-line-number="1376" href="#L1376" id="L1376">
1376
</a>
<a class="file-line-num diff-line-num" data-line-number="1377" href="#L1377" id="L1377">
1377
</a>
<a class="file-line-num diff-line-num" data-line-number="1378" href="#L1378" id="L1378">
1378
</a>
<a class="file-line-num diff-line-num" data-line-number="1379" href="#L1379" id="L1379">
1379
</a>
<a class="file-line-num diff-line-num" data-line-number="1380" href="#L1380" id="L1380">
1380
</a>
<a class="file-line-num diff-line-num" data-line-number="1381" href="#L1381" id="L1381">
1381
</a>
<a class="file-line-num diff-line-num" data-line-number="1382" href="#L1382" id="L1382">
1382
</a>
<a class="file-line-num diff-line-num" data-line-number="1383" href="#L1383" id="L1383">
1383
</a>
<a class="file-line-num diff-line-num" data-line-number="1384" href="#L1384" id="L1384">
1384
</a>
<a class="file-line-num diff-line-num" data-line-number="1385" href="#L1385" id="L1385">
1385
</a>
<a class="file-line-num diff-line-num" data-line-number="1386" href="#L1386" id="L1386">
1386
</a>
<a class="file-line-num diff-line-num" data-line-number="1387" href="#L1387" id="L1387">
1387
</a>
<a class="file-line-num diff-line-num" data-line-number="1388" href="#L1388" id="L1388">
1388
</a>
<a class="file-line-num diff-line-num" data-line-number="1389" href="#L1389" id="L1389">
1389
</a>
<a class="file-line-num diff-line-num" data-line-number="1390" href="#L1390" id="L1390">
1390
</a>
<a class="file-line-num diff-line-num" data-line-number="1391" href="#L1391" id="L1391">
1391
</a>
<a class="file-line-num diff-line-num" data-line-number="1392" href="#L1392" id="L1392">
1392
</a>
<a class="file-line-num diff-line-num" data-line-number="1393" href="#L1393" id="L1393">
1393
</a>
<a class="file-line-num diff-line-num" data-line-number="1394" href="#L1394" id="L1394">
1394
</a>
<a class="file-line-num diff-line-num" data-line-number="1395" href="#L1395" id="L1395">
1395
</a>
<a class="file-line-num diff-line-num" data-line-number="1396" href="#L1396" id="L1396">
1396
</a>
<a class="file-line-num diff-line-num" data-line-number="1397" href="#L1397" id="L1397">
1397
</a>
<a class="file-line-num diff-line-num" data-line-number="1398" href="#L1398" id="L1398">
1398
</a>
<a class="file-line-num diff-line-num" data-line-number="1399" href="#L1399" id="L1399">
1399
</a>
<a class="file-line-num diff-line-num" data-line-number="1400" href="#L1400" id="L1400">
1400
</a>
<a class="file-line-num diff-line-num" data-line-number="1401" href="#L1401" id="L1401">
1401
</a>
<a class="file-line-num diff-line-num" data-line-number="1402" href="#L1402" id="L1402">
1402
</a>
<a class="file-line-num diff-line-num" data-line-number="1403" href="#L1403" id="L1403">
1403
</a>
<a class="file-line-num diff-line-num" data-line-number="1404" href="#L1404" id="L1404">
1404
</a>
<a class="file-line-num diff-line-num" data-line-number="1405" href="#L1405" id="L1405">
1405
</a>
<a class="file-line-num diff-line-num" data-line-number="1406" href="#L1406" id="L1406">
1406
</a>
<a class="file-line-num diff-line-num" data-line-number="1407" href="#L1407" id="L1407">
1407
</a>
<a class="file-line-num diff-line-num" data-line-number="1408" href="#L1408" id="L1408">
1408
</a>
<a class="file-line-num diff-line-num" data-line-number="1409" href="#L1409" id="L1409">
1409
</a>
<a class="file-line-num diff-line-num" data-line-number="1410" href="#L1410" id="L1410">
1410
</a>
<a class="file-line-num diff-line-num" data-line-number="1411" href="#L1411" id="L1411">
1411
</a>
<a class="file-line-num diff-line-num" data-line-number="1412" href="#L1412" id="L1412">
1412
</a>
<a class="file-line-num diff-line-num" data-line-number="1413" href="#L1413" id="L1413">
1413
</a>
<a class="file-line-num diff-line-num" data-line-number="1414" href="#L1414" id="L1414">
1414
</a>
<a class="file-line-num diff-line-num" data-line-number="1415" href="#L1415" id="L1415">
1415
</a>
<a class="file-line-num diff-line-num" data-line-number="1416" href="#L1416" id="L1416">
1416
</a>
<a class="file-line-num diff-line-num" data-line-number="1417" href="#L1417" id="L1417">
1417
</a>
<a class="file-line-num diff-line-num" data-line-number="1418" href="#L1418" id="L1418">
1418
</a>
<a class="file-line-num diff-line-num" data-line-number="1419" href="#L1419" id="L1419">
1419
</a>
<a class="file-line-num diff-line-num" data-line-number="1420" href="#L1420" id="L1420">
1420
</a>
<a class="file-line-num diff-line-num" data-line-number="1421" href="#L1421" id="L1421">
1421
</a>
<a class="file-line-num diff-line-num" data-line-number="1422" href="#L1422" id="L1422">
1422
</a>
<a class="file-line-num diff-line-num" data-line-number="1423" href="#L1423" id="L1423">
1423
</a>
<a class="file-line-num diff-line-num" data-line-number="1424" href="#L1424" id="L1424">
1424
</a>
<a class="file-line-num diff-line-num" data-line-number="1425" href="#L1425" id="L1425">
1425
</a>
<a class="file-line-num diff-line-num" data-line-number="1426" href="#L1426" id="L1426">
1426
</a>
<a class="file-line-num diff-line-num" data-line-number="1427" href="#L1427" id="L1427">
1427
</a>
<a class="file-line-num diff-line-num" data-line-number="1428" href="#L1428" id="L1428">
1428
</a>
<a class="file-line-num diff-line-num" data-line-number="1429" href="#L1429" id="L1429">
1429
</a>
<a class="file-line-num diff-line-num" data-line-number="1430" href="#L1430" id="L1430">
1430
</a>
<a class="file-line-num diff-line-num" data-line-number="1431" href="#L1431" id="L1431">
1431
</a>
<a class="file-line-num diff-line-num" data-line-number="1432" href="#L1432" id="L1432">
1432
</a>
<a class="file-line-num diff-line-num" data-line-number="1433" href="#L1433" id="L1433">
1433
</a>
<a class="file-line-num diff-line-num" data-line-number="1434" href="#L1434" id="L1434">
1434
</a>
<a class="file-line-num diff-line-num" data-line-number="1435" href="#L1435" id="L1435">
1435
</a>
<a class="file-line-num diff-line-num" data-line-number="1436" href="#L1436" id="L1436">
1436
</a>
<a class="file-line-num diff-line-num" data-line-number="1437" href="#L1437" id="L1437">
1437
</a>
<a class="file-line-num diff-line-num" data-line-number="1438" href="#L1438" id="L1438">
1438
</a>
<a class="file-line-num diff-line-num" data-line-number="1439" href="#L1439" id="L1439">
1439
</a>
<a class="file-line-num diff-line-num" data-line-number="1440" href="#L1440" id="L1440">
1440
</a>
<a class="file-line-num diff-line-num" data-line-number="1441" href="#L1441" id="L1441">
1441
</a>
<a class="file-line-num diff-line-num" data-line-number="1442" href="#L1442" id="L1442">
1442
</a>
<a class="file-line-num diff-line-num" data-line-number="1443" href="#L1443" id="L1443">
1443
</a>
<a class="file-line-num diff-line-num" data-line-number="1444" href="#L1444" id="L1444">
1444
</a>
<a class="file-line-num diff-line-num" data-line-number="1445" href="#L1445" id="L1445">
1445
</a>
<a class="file-line-num diff-line-num" data-line-number="1446" href="#L1446" id="L1446">
1446
</a>
<a class="file-line-num diff-line-num" data-line-number="1447" href="#L1447" id="L1447">
1447
</a>
<a class="file-line-num diff-line-num" data-line-number="1448" href="#L1448" id="L1448">
1448
</a>
<a class="file-line-num diff-line-num" data-line-number="1449" href="#L1449" id="L1449">
1449
</a>
<a class="file-line-num diff-line-num" data-line-number="1450" href="#L1450" id="L1450">
1450
</a>
<a class="file-line-num diff-line-num" data-line-number="1451" href="#L1451" id="L1451">
1451
</a>
<a class="file-line-num diff-line-num" data-line-number="1452" href="#L1452" id="L1452">
1452
</a>
<a class="file-line-num diff-line-num" data-line-number="1453" href="#L1453" id="L1453">
1453
</a>
<a class="file-line-num diff-line-num" data-line-number="1454" href="#L1454" id="L1454">
1454
</a>
<a class="file-line-num diff-line-num" data-line-number="1455" href="#L1455" id="L1455">
1455
</a>
<a class="file-line-num diff-line-num" data-line-number="1456" href="#L1456" id="L1456">
1456
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2008, 2013, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC19" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC20" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC22" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC23" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC24" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC25" class="line" lang="java"></span>
<span id="LC26" class="line" lang="java"><span class="kn">package</span> <span class="nn">java.lang.invoke</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"></span>
<span id="LC28" class="line" lang="java"></span>
<span id="LC29" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.*</span><span class="o">;</span></span>
<span id="LC30" class="line" lang="java"></span>
<span id="LC31" class="line" lang="java"><span class="kn">import</span> <span class="nn">static</span> <span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">invoke</span><span class="o">.</span><span class="na">MethodHandleStatics</span><span class="o">.*;</span></span>
<span id="LC32" class="line" lang="java"></span>
<span id="LC33" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> * A method handle is a typed, directly executable reference to an underlying method,</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> * constructor, field, or similar low-level operation, with optional</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> * transformations of arguments or return values.</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> * These transformations are quite general, and include such patterns as</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * {@linkplain #asType conversion},</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> * {@linkplain #bindTo insertion},</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * {@linkplain java.lang.invoke.MethodHandles#dropArguments deletion},</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * and {@linkplain java.lang.invoke.MethodHandles#filterArguments substitution}.</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Method handle contents&lt;/h1&gt;</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> * Method handles are dynamically and strongly typed according to their parameter and return types.</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * They are not distinguished by the name or the defining class of their underlying methods.</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> * A method handle must be invoked using a symbolic type descriptor which matches</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> * the method handle's own {@linkplain #type type descriptor}.</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * Every method handle reports its type descriptor via the {@link #type type} accessor.</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * This type descriptor is a {@link java.lang.invoke.MethodType MethodType} object,</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * whose structure is a series of classes, one of which is</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> * the return type of the method (or {@code void.class} if none).</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> * A method handle's type controls the types of invocations it accepts,</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> * and the kinds of transformations that apply to it.</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> * A method handle contains a pair of special invoker methods</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> * called {@link #invokeExact invokeExact} and {@link #invoke invoke}.</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> * Both invoker methods provide direct access to the method handle's</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> * underlying method, constructor, field, or other operation,</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> * as modified by transformations of arguments and return values.</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> * Both invokers accept calls which exactly match the method handle's own type.</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> * The plain, inexact invoker also accepts a range of other call types.</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> * Method handles are immutable and have no visible state.</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> * Of course, they can be bound to underlying methods or data which exhibit state.</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> * With respect to the Java Memory Model, any method handle will behave</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> * as if all of its (internal) fields are final variables.  This means that any method</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> * handle made visible to the application will always be fully formed.</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> * This is true even if the method handle is published through a shared</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> * variable in a data race.</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> * Method handles cannot be subclassed by the user.</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> * Implementations may (or may not) create internal subclasses of {@code MethodHandle}</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> * which may be visible via the {@link java.lang.Object#getClass Object.getClass}</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> * operation.  The programmer should not draw conclusions about a method handle</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> * from its specific class, as the method handle class hierarchy (if any)</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> * may change from time to time or across implementations from different vendors.</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Method handle compilation&lt;/h1&gt;</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> * A Java method call expression naming {@code invokeExact} or {@code invoke}</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> * can invoke a method handle from Java source code.</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> * From the viewpoint of source code, these methods can take any arguments</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> * and their result can be cast to any return type.</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> * Formally this is accomplished by giving the invoker methods</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> * {@code Object} return types and variable arity {@code Object} arguments,</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> * but they have an additional quality called &lt;em&gt;signature polymorphism&lt;/em&gt;</span></span>
<span id="LC88" class="line" lang="java"><span class="cm"> * which connects this freedom of invocation directly to the JVM execution stack.</span></span>
<span id="LC89" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC90" class="line" lang="java"><span class="cm"> * As is usual with virtual methods, source-level calls to {@code invokeExact}</span></span>
<span id="LC91" class="line" lang="java"><span class="cm"> * and {@code invoke} compile to an {@code invokevirtual} instruction.</span></span>
<span id="LC92" class="line" lang="java"><span class="cm"> * More unusually, the compiler must record the actual argument types,</span></span>
<span id="LC93" class="line" lang="java"><span class="cm"> * and may not perform method invocation conversions on the arguments.</span></span>
<span id="LC94" class="line" lang="java"><span class="cm"> * Instead, it must push them on the stack according to their own unconverted types.</span></span>
<span id="LC95" class="line" lang="java"><span class="cm"> * The method handle object itself is pushed on the stack before the arguments.</span></span>
<span id="LC96" class="line" lang="java"><span class="cm"> * The compiler then calls the method handle with a symbolic type descriptor which</span></span>
<span id="LC97" class="line" lang="java"><span class="cm"> * describes the argument and return types.</span></span>
<span id="LC98" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC99" class="line" lang="java"><span class="cm"> * To issue a complete symbolic type descriptor, the compiler must also determine</span></span>
<span id="LC100" class="line" lang="java"><span class="cm"> * the return type.  This is based on a cast on the method invocation expression,</span></span>
<span id="LC101" class="line" lang="java"><span class="cm"> * if there is one, or else {@code Object} if the invocation is an expression</span></span>
<span id="LC102" class="line" lang="java"><span class="cm"> * or else {@code void} if the invocation is a statement.</span></span>
<span id="LC103" class="line" lang="java"><span class="cm"> * The cast may be to a primitive type (but not {@code void}).</span></span>
<span id="LC104" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC105" class="line" lang="java"><span class="cm"> * As a corner case, an uncasted {@code null} argument is given</span></span>
<span id="LC106" class="line" lang="java"><span class="cm"> * a symbolic type descriptor of {@code java.lang.Void}.</span></span>
<span id="LC107" class="line" lang="java"><span class="cm"> * The ambiguity with the type {@code Void} is harmless, since there are no references of type</span></span>
<span id="LC108" class="line" lang="java"><span class="cm"> * {@code Void} except the null reference.</span></span>
<span id="LC109" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC110" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Method handle invocation&lt;/h1&gt;</span></span>
<span id="LC111" class="line" lang="java"><span class="cm"> * The first time a {@code invokevirtual} instruction is executed</span></span>
<span id="LC112" class="line" lang="java"><span class="cm"> * it is linked, by symbolically resolving the names in the instruction</span></span>
<span id="LC113" class="line" lang="java"><span class="cm"> * and verifying that the method call is statically legal.</span></span>
<span id="LC114" class="line" lang="java"><span class="cm"> * This is true of calls to {@code invokeExact} and {@code invoke}.</span></span>
<span id="LC115" class="line" lang="java"><span class="cm"> * In this case, the symbolic type descriptor emitted by the compiler is checked for</span></span>
<span id="LC116" class="line" lang="java"><span class="cm"> * correct syntax and names it contains are resolved.</span></span>
<span id="LC117" class="line" lang="java"><span class="cm"> * Thus, an {@code invokevirtual} instruction which invokes</span></span>
<span id="LC118" class="line" lang="java"><span class="cm"> * a method handle will always link, as long</span></span>
<span id="LC119" class="line" lang="java"><span class="cm"> * as the symbolic type descriptor is syntactically well-formed</span></span>
<span id="LC120" class="line" lang="java"><span class="cm"> * and the types exist.</span></span>
<span id="LC121" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC122" class="line" lang="java"><span class="cm"> * When the {@code invokevirtual} is executed after linking,</span></span>
<span id="LC123" class="line" lang="java"><span class="cm"> * the receiving method handle's type is first checked by the JVM</span></span>
<span id="LC124" class="line" lang="java"><span class="cm"> * to ensure that it matches the symbolic type descriptor.</span></span>
<span id="LC125" class="line" lang="java"><span class="cm"> * If the type match fails, it means that the method which the</span></span>
<span id="LC126" class="line" lang="java"><span class="cm"> * caller is invoking is not present on the individual</span></span>
<span id="LC127" class="line" lang="java"><span class="cm"> * method handle being invoked.</span></span>
<span id="LC128" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC129" class="line" lang="java"><span class="cm"> * In the case of {@code invokeExact}, the type descriptor of the invocation</span></span>
<span id="LC130" class="line" lang="java"><span class="cm"> * (after resolving symbolic type names) must exactly match the method type</span></span>
<span id="LC131" class="line" lang="java"><span class="cm"> * of the receiving method handle.</span></span>
<span id="LC132" class="line" lang="java"><span class="cm"> * In the case of plain, inexact {@code invoke}, the resolved type descriptor</span></span>
<span id="LC133" class="line" lang="java"><span class="cm"> * must be a valid argument to the receiver's {@link #asType asType} method.</span></span>
<span id="LC134" class="line" lang="java"><span class="cm"> * Thus, plain {@code invoke} is more permissive than {@code invokeExact}.</span></span>
<span id="LC135" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC136" class="line" lang="java"><span class="cm"> * After type matching, a call to {@code invokeExact} directly</span></span>
<span id="LC137" class="line" lang="java"><span class="cm"> * and immediately invoke the method handle's underlying method</span></span>
<span id="LC138" class="line" lang="java"><span class="cm"> * (or other behavior, as the case may be).</span></span>
<span id="LC139" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC140" class="line" lang="java"><span class="cm"> * A call to plain {@code invoke} works the same as a call to</span></span>
<span id="LC141" class="line" lang="java"><span class="cm"> * {@code invokeExact}, if the symbolic type descriptor specified by the caller</span></span>
<span id="LC142" class="line" lang="java"><span class="cm"> * exactly matches the method handle's own type.</span></span>
<span id="LC143" class="line" lang="java"><span class="cm"> * If there is a type mismatch, {@code invoke} attempts</span></span>
<span id="LC144" class="line" lang="java"><span class="cm"> * to adjust the type of the receiving method handle,</span></span>
<span id="LC145" class="line" lang="java"><span class="cm"> * as if by a call to {@link #asType asType},</span></span>
<span id="LC146" class="line" lang="java"><span class="cm"> * to obtain an exactly invokable method handle {@code M2}.</span></span>
<span id="LC147" class="line" lang="java"><span class="cm"> * This allows a more powerful negotiation of method type</span></span>
<span id="LC148" class="line" lang="java"><span class="cm"> * between caller and callee.</span></span>
<span id="LC149" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC150" class="line" lang="java"><span class="cm"> * (&lt;em&gt;Note:&lt;/em&gt; The adjusted method handle {@code M2} is not directly observable,</span></span>
<span id="LC151" class="line" lang="java"><span class="cm"> * and implementations are therefore not required to materialize it.)</span></span>
<span id="LC152" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC153" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Invocation checking&lt;/h1&gt;</span></span>
<span id="LC154" class="line" lang="java"><span class="cm"> * In typical programs, method handle type matching will usually succeed.</span></span>
<span id="LC155" class="line" lang="java"><span class="cm"> * But if a match fails, the JVM will throw a {@link WrongMethodTypeException},</span></span>
<span id="LC156" class="line" lang="java"><span class="cm"> * either directly (in the case of {@code invokeExact}) or indirectly as if</span></span>
<span id="LC157" class="line" lang="java"><span class="cm"> * by a failed call to {@code asType} (in the case of {@code invoke}).</span></span>
<span id="LC158" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC159" class="line" lang="java"><span class="cm"> * Thus, a method type mismatch which might show up as a linkage error</span></span>
<span id="LC160" class="line" lang="java"><span class="cm"> * in a statically typed program can show up as</span></span>
<span id="LC161" class="line" lang="java"><span class="cm"> * a dynamic {@code WrongMethodTypeException}</span></span>
<span id="LC162" class="line" lang="java"><span class="cm"> * in a program which uses method handles.</span></span>
<span id="LC163" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC164" class="line" lang="java"><span class="cm"> * Because method types contain "live" {@code Class} objects,</span></span>
<span id="LC165" class="line" lang="java"><span class="cm"> * method type matching takes into account both types names and class loaders.</span></span>
<span id="LC166" class="line" lang="java"><span class="cm"> * Thus, even if a method handle {@code M} is created in one</span></span>
<span id="LC167" class="line" lang="java"><span class="cm"> * class loader {@code L1} and used in another {@code L2},</span></span>
<span id="LC168" class="line" lang="java"><span class="cm"> * method handle calls are type-safe, because the caller's symbolic type</span></span>
<span id="LC169" class="line" lang="java"><span class="cm"> * descriptor, as resolved in {@code L2},</span></span>
<span id="LC170" class="line" lang="java"><span class="cm"> * is matched against the original callee method's symbolic type descriptor,</span></span>
<span id="LC171" class="line" lang="java"><span class="cm"> * as resolved in {@code L1}.</span></span>
<span id="LC172" class="line" lang="java"><span class="cm"> * The resolution in {@code L1} happens when {@code M} is created</span></span>
<span id="LC173" class="line" lang="java"><span class="cm"> * and its type is assigned, while the resolution in {@code L2} happens</span></span>
<span id="LC174" class="line" lang="java"><span class="cm"> * when the {@code invokevirtual} instruction is linked.</span></span>
<span id="LC175" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC176" class="line" lang="java"><span class="cm"> * Apart from the checking of type descriptors,</span></span>
<span id="LC177" class="line" lang="java"><span class="cm"> * a method handle's capability to call its underlying method is unrestricted.</span></span>
<span id="LC178" class="line" lang="java"><span class="cm"> * If a method handle is formed on a non-public method by a class</span></span>
<span id="LC179" class="line" lang="java"><span class="cm"> * that has access to that method, the resulting handle can be used</span></span>
<span id="LC180" class="line" lang="java"><span class="cm"> * in any place by any caller who receives a reference to it.</span></span>
<span id="LC181" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC182" class="line" lang="java"><span class="cm"> * Unlike with the Core Reflection API, where access is checked every time</span></span>
<span id="LC183" class="line" lang="java"><span class="cm"> * a reflective method is invoked,</span></span>
<span id="LC184" class="line" lang="java"><span class="cm"> * method handle access checking is performed</span></span>
<span id="LC185" class="line" lang="java"><span class="cm"> * &lt;a href="MethodHandles.Lookup.html#access"&gt;when the method handle is created&lt;/a&gt;.</span></span>
<span id="LC186" class="line" lang="java"><span class="cm"> * In the case of {@code ldc} (see below), access checking is performed as part of linking</span></span>
<span id="LC187" class="line" lang="java"><span class="cm"> * the constant pool entry underlying the constant method handle.</span></span>
<span id="LC188" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC189" class="line" lang="java"><span class="cm"> * Thus, handles to non-public methods, or to methods in non-public classes,</span></span>
<span id="LC190" class="line" lang="java"><span class="cm"> * should generally be kept secret.</span></span>
<span id="LC191" class="line" lang="java"><span class="cm"> * They should not be passed to untrusted code unless their use from</span></span>
<span id="LC192" class="line" lang="java"><span class="cm"> * the untrusted code would be harmless.</span></span>
<span id="LC193" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC194" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Method handle creation&lt;/h1&gt;</span></span>
<span id="LC195" class="line" lang="java"><span class="cm"> * Java code can create a method handle that directly accesses</span></span>
<span id="LC196" class="line" lang="java"><span class="cm"> * any method, constructor, or field that is accessible to that code.</span></span>
<span id="LC197" class="line" lang="java"><span class="cm"> * This is done via a reflective, capability-based API called</span></span>
<span id="LC198" class="line" lang="java"><span class="cm"> * {@link java.lang.invoke.MethodHandles.Lookup MethodHandles.Lookup}</span></span>
<span id="LC199" class="line" lang="java"><span class="cm"> * For example, a static method handle can be obtained</span></span>
<span id="LC200" class="line" lang="java"><span class="cm"> * from {@link java.lang.invoke.MethodHandles.Lookup#findStatic Lookup.findStatic}.</span></span>
<span id="LC201" class="line" lang="java"><span class="cm"> * There are also conversion methods from Core Reflection API objects,</span></span>
<span id="LC202" class="line" lang="java"><span class="cm"> * such as {@link java.lang.invoke.MethodHandles.Lookup#unreflect Lookup.unreflect}.</span></span>
<span id="LC203" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC204" class="line" lang="java"><span class="cm"> * Like classes and strings, method handles that correspond to accessible</span></span>
<span id="LC205" class="line" lang="java"><span class="cm"> * fields, methods, and constructors can also be represented directly</span></span>
<span id="LC206" class="line" lang="java"><span class="cm"> * in a class file's constant pool as constants to be loaded by {@code ldc} bytecodes.</span></span>
<span id="LC207" class="line" lang="java"><span class="cm"> * A new type of constant pool entry, {@code CONSTANT_MethodHandle},</span></span>
<span id="LC208" class="line" lang="java"><span class="cm"> * refers directly to an associated {@code CONSTANT_Methodref},</span></span>
<span id="LC209" class="line" lang="java"><span class="cm"> * {@code CONSTANT_InterfaceMethodref}, or {@code CONSTANT_Fieldref}</span></span>
<span id="LC210" class="line" lang="java"><span class="cm"> * constant pool entry.</span></span>
<span id="LC211" class="line" lang="java"><span class="cm"> * (For full details on method handle constants,</span></span>
<span id="LC212" class="line" lang="java"><span class="cm"> * see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)</span></span>
<span id="LC213" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC214" class="line" lang="java"><span class="cm"> * Method handles produced by lookups or constant loads from methods or</span></span>
<span id="LC215" class="line" lang="java"><span class="cm"> * constructors with the variable arity modifier bit ({@code 0x0080})</span></span>
<span id="LC216" class="line" lang="java"><span class="cm"> * have a corresponding variable arity, as if they were defined with</span></span>
<span id="LC217" class="line" lang="java"><span class="cm"> * the help of {@link #asVarargsCollector asVarargsCollector}.</span></span>
<span id="LC218" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC219" class="line" lang="java"><span class="cm"> * A method reference may refer either to a static or non-static method.</span></span>
<span id="LC220" class="line" lang="java"><span class="cm"> * In the non-static case, the method handle type includes an explicit</span></span>
<span id="LC221" class="line" lang="java"><span class="cm"> * receiver argument, prepended before any other arguments.</span></span>
<span id="LC222" class="line" lang="java"><span class="cm"> * In the method handle's type, the initial receiver argument is typed</span></span>
<span id="LC223" class="line" lang="java"><span class="cm"> * according to the class under which the method was initially requested.</span></span>
<span id="LC224" class="line" lang="java"><span class="cm"> * (E.g., if a non-static method handle is obtained via {@code ldc},</span></span>
<span id="LC225" class="line" lang="java"><span class="cm"> * the type of the receiver is the class named in the constant pool entry.)</span></span>
<span id="LC226" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC227" class="line" lang="java"><span class="cm"> * Method handle constants are subject to the same link-time access checks</span></span>
<span id="LC228" class="line" lang="java"><span class="cm"> * their corresponding bytecode instructions, and the {@code ldc} instruction</span></span>
<span id="LC229" class="line" lang="java"><span class="cm"> * will throw corresponding linkage errors if the bytecode behaviors would</span></span>
<span id="LC230" class="line" lang="java"><span class="cm"> * throw such errors.</span></span>
<span id="LC231" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC232" class="line" lang="java"><span class="cm"> * As a corollary of this, access to protected members is restricted</span></span>
<span id="LC233" class="line" lang="java"><span class="cm"> * to receivers only of the accessing class, or one of its subclasses,</span></span>
<span id="LC234" class="line" lang="java"><span class="cm"> * and the accessing class must in turn be a subclass (or package sibling)</span></span>
<span id="LC235" class="line" lang="java"><span class="cm"> * of the protected member's defining class.</span></span>
<span id="LC236" class="line" lang="java"><span class="cm"> * If a method reference refers to a protected non-static method or field</span></span>
<span id="LC237" class="line" lang="java"><span class="cm"> * of a class outside the current package, the receiver argument will</span></span>
<span id="LC238" class="line" lang="java"><span class="cm"> * be narrowed to the type of the accessing class.</span></span>
<span id="LC239" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC240" class="line" lang="java"><span class="cm"> * When a method handle to a virtual method is invoked, the method is</span></span>
<span id="LC241" class="line" lang="java"><span class="cm"> * always looked up in the receiver (that is, the first argument).</span></span>
<span id="LC242" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC243" class="line" lang="java"><span class="cm"> * A non-virtual method handle to a specific virtual method implementation</span></span>
<span id="LC244" class="line" lang="java"><span class="cm"> * can also be created.  These do not perform virtual lookup based on</span></span>
<span id="LC245" class="line" lang="java"><span class="cm"> * receiver type.  Such a method handle simulates the effect of</span></span>
<span id="LC246" class="line" lang="java"><span class="cm"> * an {@code invokespecial} instruction to the same method.</span></span>
<span id="LC247" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC248" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Usage examples&lt;/h1&gt;</span></span>
<span id="LC249" class="line" lang="java"><span class="cm"> * Here are some examples of usage:</span></span>
<span id="LC250" class="line" lang="java"><span class="cm"> * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC251" class="line" lang="java"><span class="cm">Object x, y; String s; int i;</span></span>
<span id="LC252" class="line" lang="java"><span class="cm">MethodType mt; MethodHandle mh;</span></span>
<span id="LC253" class="line" lang="java"><span class="cm">MethodHandles.Lookup lookup = MethodHandles.lookup();</span></span>
<span id="LC254" class="line" lang="java"><span class="cm">// mt is (char,char)String</span></span>
<span id="LC255" class="line" lang="java"><span class="cm">mt = MethodType.methodType(String.class, char.class, char.class);</span></span>
<span id="LC256" class="line" lang="java"><span class="cm">mh = lookup.findVirtual(String.class, "replace", mt);</span></span>
<span id="LC257" class="line" lang="java"><span class="cm">s = (String) mh.invokeExact("daddy",'d','n');</span></span>
<span id="LC258" class="line" lang="java"><span class="cm">// invokeExact(Ljava/lang/String;CC)Ljava/lang/String;</span></span>
<span id="LC259" class="line" lang="java"><span class="cm">assertEquals(s, "nanny");</span></span>
<span id="LC260" class="line" lang="java"><span class="cm">// weakly typed invocation (using MHs.invoke)</span></span>
<span id="LC261" class="line" lang="java"><span class="cm">s = (String) mh.invokeWithArguments("sappy", 'p', 'v');</span></span>
<span id="LC262" class="line" lang="java"><span class="cm">assertEquals(s, "savvy");</span></span>
<span id="LC263" class="line" lang="java"><span class="cm">// mt is (Object[])List</span></span>
<span id="LC264" class="line" lang="java"><span class="cm">mt = MethodType.methodType(java.util.List.class, Object[].class);</span></span>
<span id="LC265" class="line" lang="java"><span class="cm">mh = lookup.findStatic(java.util.Arrays.class, "asList", mt);</span></span>
<span id="LC266" class="line" lang="java"><span class="cm">assert(mh.isVarargsCollector());</span></span>
<span id="LC267" class="line" lang="java"><span class="cm">x = mh.invoke("one", "two");</span></span>
<span id="LC268" class="line" lang="java"><span class="cm">// invoke(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;</span></span>
<span id="LC269" class="line" lang="java"><span class="cm">assertEquals(x, java.util.Arrays.asList("one","two"));</span></span>
<span id="LC270" class="line" lang="java"><span class="cm">// mt is (Object,Object,Object)Object</span></span>
<span id="LC271" class="line" lang="java"><span class="cm">mt = MethodType.genericMethodType(3);</span></span>
<span id="LC272" class="line" lang="java"><span class="cm">mh = mh.asType(mt);</span></span>
<span id="LC273" class="line" lang="java"><span class="cm">x = mh.invokeExact((Object)1, (Object)2, (Object)3);</span></span>
<span id="LC274" class="line" lang="java"><span class="cm">// invokeExact(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;</span></span>
<span id="LC275" class="line" lang="java"><span class="cm">assertEquals(x, java.util.Arrays.asList(1,2,3));</span></span>
<span id="LC276" class="line" lang="java"><span class="cm">// mt is ()int</span></span>
<span id="LC277" class="line" lang="java"><span class="cm">mt = MethodType.methodType(int.class);</span></span>
<span id="LC278" class="line" lang="java"><span class="cm">mh = lookup.findVirtual(java.util.List.class, "size", mt);</span></span>
<span id="LC279" class="line" lang="java"><span class="cm">i = (int) mh.invokeExact(java.util.Arrays.asList(1,2,3));</span></span>
<span id="LC280" class="line" lang="java"><span class="cm">// invokeExact(Ljava/util/List;)I</span></span>
<span id="LC281" class="line" lang="java"><span class="cm">assert(i == 3);</span></span>
<span id="LC282" class="line" lang="java"><span class="cm">mt = MethodType.methodType(void.class, String.class);</span></span>
<span id="LC283" class="line" lang="java"><span class="cm">mh = lookup.findVirtual(java.io.PrintStream.class, "println", mt);</span></span>
<span id="LC284" class="line" lang="java"><span class="cm">mh.invokeExact(System.out, "Hello, world.");</span></span>
<span id="LC285" class="line" lang="java"><span class="cm">// invokeExact(Ljava/io/PrintStream;Ljava/lang/String;)V</span></span>
<span id="LC286" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC287" class="line" lang="java"><span class="cm"> * Each of the above calls to {@code invokeExact} or plain {@code invoke}</span></span>
<span id="LC288" class="line" lang="java"><span class="cm"> * generates a single invokevirtual instruction with</span></span>
<span id="LC289" class="line" lang="java"><span class="cm"> * the symbolic type descriptor indicated in the following comment.</span></span>
<span id="LC290" class="line" lang="java"><span class="cm"> * In these examples, the helper method {@code assertEquals} is assumed to</span></span>
<span id="LC291" class="line" lang="java"><span class="cm"> * be a method which calls {@link java.util.Objects#equals(Object,Object) Objects.equals}</span></span>
<span id="LC292" class="line" lang="java"><span class="cm"> * on its arguments, and asserts that the result is true.</span></span>
<span id="LC293" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC294" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Exceptions&lt;/h1&gt;</span></span>
<span id="LC295" class="line" lang="java"><span class="cm"> * The methods {@code invokeExact} and {@code invoke} are declared</span></span>
<span id="LC296" class="line" lang="java"><span class="cm"> * to throw {@link java.lang.Throwable Throwable},</span></span>
<span id="LC297" class="line" lang="java"><span class="cm"> * which is to say that there is no static restriction on what a method handle</span></span>
<span id="LC298" class="line" lang="java"><span class="cm"> * can throw.  Since the JVM does not distinguish between checked</span></span>
<span id="LC299" class="line" lang="java"><span class="cm"> * and unchecked exceptions (other than by their class, of course),</span></span>
<span id="LC300" class="line" lang="java"><span class="cm"> * there is no particular effect on bytecode shape from ascribing</span></span>
<span id="LC301" class="line" lang="java"><span class="cm"> * checked exceptions to method handle invocations.  But in Java source</span></span>
<span id="LC302" class="line" lang="java"><span class="cm"> * code, methods which perform method handle calls must either explicitly</span></span>
<span id="LC303" class="line" lang="java"><span class="cm"> * throw {@code Throwable}, or else must catch all</span></span>
<span id="LC304" class="line" lang="java"><span class="cm"> * throwables locally, rethrowing only those which are legal in the context,</span></span>
<span id="LC305" class="line" lang="java"><span class="cm"> * and wrapping ones which are illegal.</span></span>
<span id="LC306" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC307" class="line" lang="java"><span class="cm"> * &lt;h1&gt;&lt;a name="sigpoly"&gt;&lt;/a&gt;Signature polymorphism&lt;/h1&gt;</span></span>
<span id="LC308" class="line" lang="java"><span class="cm"> * The unusual compilation and linkage behavior of</span></span>
<span id="LC309" class="line" lang="java"><span class="cm"> * {@code invokeExact} and plain {@code invoke}</span></span>
<span id="LC310" class="line" lang="java"><span class="cm"> * is referenced by the term &lt;em&gt;signature polymorphism&lt;/em&gt;.</span></span>
<span id="LC311" class="line" lang="java"><span class="cm"> * As defined in the Java Language Specification,</span></span>
<span id="LC312" class="line" lang="java"><span class="cm"> * a signature polymorphic method is one which can operate with</span></span>
<span id="LC313" class="line" lang="java"><span class="cm"> * any of a wide range of call signatures and return types.</span></span>
<span id="LC314" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC315" class="line" lang="java"><span class="cm"> * In source code, a call to a signature polymorphic method will</span></span>
<span id="LC316" class="line" lang="java"><span class="cm"> * compile, regardless of the requested symbolic type descriptor.</span></span>
<span id="LC317" class="line" lang="java"><span class="cm"> * As usual, the Java compiler emits an {@code invokevirtual}</span></span>
<span id="LC318" class="line" lang="java"><span class="cm"> * instruction with the given symbolic type descriptor against the named method.</span></span>
<span id="LC319" class="line" lang="java"><span class="cm"> * The unusual part is that the symbolic type descriptor is derived from</span></span>
<span id="LC320" class="line" lang="java"><span class="cm"> * the actual argument and return types, not from the method declaration.</span></span>
<span id="LC321" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC322" class="line" lang="java"><span class="cm"> * When the JVM processes bytecode containing signature polymorphic calls,</span></span>
<span id="LC323" class="line" lang="java"><span class="cm"> * it will successfully link any such call, regardless of its symbolic type descriptor.</span></span>
<span id="LC324" class="line" lang="java"><span class="cm"> * (In order to retain type safety, the JVM will guard such calls with suitable</span></span>
<span id="LC325" class="line" lang="java"><span class="cm"> * dynamic type checks, as described elsewhere.)</span></span>
<span id="LC326" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC327" class="line" lang="java"><span class="cm"> * Bytecode generators, including the compiler back end, are required to emit</span></span>
<span id="LC328" class="line" lang="java"><span class="cm"> * untransformed symbolic type descriptors for these methods.</span></span>
<span id="LC329" class="line" lang="java"><span class="cm"> * Tools which determine symbolic linkage are required to accept such</span></span>
<span id="LC330" class="line" lang="java"><span class="cm"> * untransformed descriptors, without reporting linkage errors.</span></span>
<span id="LC331" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC332" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Interoperation between method handles and the Core Reflection API&lt;/h1&gt;</span></span>
<span id="LC333" class="line" lang="java"><span class="cm"> * Using factory methods in the {@link java.lang.invoke.MethodHandles.Lookup Lookup} API,</span></span>
<span id="LC334" class="line" lang="java"><span class="cm"> * any class member represented by a Core Reflection API object</span></span>
<span id="LC335" class="line" lang="java"><span class="cm"> * can be converted to a behaviorally equivalent method handle.</span></span>
<span id="LC336" class="line" lang="java"><span class="cm"> * For example, a reflective {@link java.lang.reflect.Method Method} can</span></span>
<span id="LC337" class="line" lang="java"><span class="cm"> * be converted to a method handle using</span></span>
<span id="LC338" class="line" lang="java"><span class="cm"> * {@link java.lang.invoke.MethodHandles.Lookup#unreflect Lookup.unreflect}.</span></span>
<span id="LC339" class="line" lang="java"><span class="cm"> * The resulting method handles generally provide more direct and efficient</span></span>
<span id="LC340" class="line" lang="java"><span class="cm"> * access to the underlying class members.</span></span>
<span id="LC341" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC342" class="line" lang="java"><span class="cm"> * As a special case,</span></span>
<span id="LC343" class="line" lang="java"><span class="cm"> * when the Core Reflection API is used to view the signature polymorphic</span></span>
<span id="LC344" class="line" lang="java"><span class="cm"> * methods {@code invokeExact} or plain {@code invoke} in this class,</span></span>
<span id="LC345" class="line" lang="java"><span class="cm"> * they appear as ordinary non-polymorphic methods.</span></span>
<span id="LC346" class="line" lang="java"><span class="cm"> * Their reflective appearance, as viewed by</span></span>
<span id="LC347" class="line" lang="java"><span class="cm"> * {@link java.lang.Class#getDeclaredMethod Class.getDeclaredMethod},</span></span>
<span id="LC348" class="line" lang="java"><span class="cm"> * is unaffected by their special status in this API.</span></span>
<span id="LC349" class="line" lang="java"><span class="cm"> * For example, {@link java.lang.reflect.Method#getModifiers Method.getModifiers}</span></span>
<span id="LC350" class="line" lang="java"><span class="cm"> * will report exactly those modifier bits required for any similarly</span></span>
<span id="LC351" class="line" lang="java"><span class="cm"> * declared method, including in this case {@code native} and {@code varargs} bits.</span></span>
<span id="LC352" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC353" class="line" lang="java"><span class="cm"> * As with any reflected method, these methods (when reflected) may be</span></span>
<span id="LC354" class="line" lang="java"><span class="cm"> * invoked via {@link java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}.</span></span>
<span id="LC355" class="line" lang="java"><span class="cm"> * However, such reflective calls do not result in method handle invocations.</span></span>
<span id="LC356" class="line" lang="java"><span class="cm"> * Such a call, if passed the required argument</span></span>
<span id="LC357" class="line" lang="java"><span class="cm"> * (a single one, of type {@code Object[]}), will ignore the argument and</span></span>
<span id="LC358" class="line" lang="java"><span class="cm"> * will throw an {@code UnsupportedOperationException}.</span></span>
<span id="LC359" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC360" class="line" lang="java"><span class="cm"> * Since {@code invokevirtual} instructions can natively</span></span>
<span id="LC361" class="line" lang="java"><span class="cm"> * invoke method handles under any symbolic type descriptor, this reflective view conflicts</span></span>
<span id="LC362" class="line" lang="java"><span class="cm"> * with the normal presentation of these methods via bytecodes.</span></span>
<span id="LC363" class="line" lang="java"><span class="cm"> * Thus, these two native methods, when reflectively viewed by</span></span>
<span id="LC364" class="line" lang="java"><span class="cm"> * {@code Class.getDeclaredMethod}, may be regarded as placeholders only.</span></span>
<span id="LC365" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC366" class="line" lang="java"><span class="cm"> * In order to obtain an invoker method for a particular type descriptor,</span></span>
<span id="LC367" class="line" lang="java"><span class="cm"> * use {@link java.lang.invoke.MethodHandles#exactInvoker MethodHandles.exactInvoker},</span></span>
<span id="LC368" class="line" lang="java"><span class="cm"> * or {@link java.lang.invoke.MethodHandles#invoker MethodHandles.invoker}.</span></span>
<span id="LC369" class="line" lang="java"><span class="cm"> * The {@link java.lang.invoke.MethodHandles.Lookup#findVirtual Lookup.findVirtual}</span></span>
<span id="LC370" class="line" lang="java"><span class="cm"> * API is also able to return a method handle</span></span>
<span id="LC371" class="line" lang="java"><span class="cm"> * to call {@code invokeExact} or plain {@code invoke},</span></span>
<span id="LC372" class="line" lang="java"><span class="cm"> * for any specified type descriptor .</span></span>
<span id="LC373" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC374" class="line" lang="java"><span class="cm"> * &lt;h1&gt;Interoperation between method handles and Java generics&lt;/h1&gt;</span></span>
<span id="LC375" class="line" lang="java"><span class="cm"> * A method handle can be obtained on a method, constructor, or field</span></span>
<span id="LC376" class="line" lang="java"><span class="cm"> * which is declared with Java generic types.</span></span>
<span id="LC377" class="line" lang="java"><span class="cm"> * As with the Core Reflection API, the type of the method handle</span></span>
<span id="LC378" class="line" lang="java"><span class="cm"> * will constructed from the erasure of the source-level type.</span></span>
<span id="LC379" class="line" lang="java"><span class="cm"> * When a method handle is invoked, the types of its arguments</span></span>
<span id="LC380" class="line" lang="java"><span class="cm"> * or the return value cast type may be generic types or type instances.</span></span>
<span id="LC381" class="line" lang="java"><span class="cm"> * If this occurs, the compiler will replace those</span></span>
<span id="LC382" class="line" lang="java"><span class="cm"> * types by their erasures when it constructs the symbolic type descriptor</span></span>
<span id="LC383" class="line" lang="java"><span class="cm"> * for the {@code invokevirtual} instruction.</span></span>
<span id="LC384" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC385" class="line" lang="java"><span class="cm"> * Method handles do not represent</span></span>
<span id="LC386" class="line" lang="java"><span class="cm"> * their function-like types in terms of Java parameterized (generic) types,</span></span>
<span id="LC387" class="line" lang="java"><span class="cm"> * because there are three mismatches between function-like types and parameterized</span></span>
<span id="LC388" class="line" lang="java"><span class="cm"> * Java types.</span></span>
<span id="LC389" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC390" class="line" lang="java"><span class="cm"> * &lt;li&gt;Method types range over all possible arities,</span></span>
<span id="LC391" class="line" lang="java"><span class="cm"> * from no arguments to up to the  &lt;a href="MethodHandle.html#maxarity"&gt;maximum number&lt;/a&gt; of allowed arguments.</span></span>
<span id="LC392" class="line" lang="java"><span class="cm"> * Generics are not variadic, and so cannot represent this.&lt;/li&gt;</span></span>
<span id="LC393" class="line" lang="java"><span class="cm"> * &lt;li&gt;Method types can specify arguments of primitive types,</span></span>
<span id="LC394" class="line" lang="java"><span class="cm"> * which Java generic types cannot range over.&lt;/li&gt;</span></span>
<span id="LC395" class="line" lang="java"><span class="cm"> * &lt;li&gt;Higher order functions over method handles (combinators) are</span></span>
<span id="LC396" class="line" lang="java"><span class="cm"> * often generic across a wide range of function types, including</span></span>
<span id="LC397" class="line" lang="java"><span class="cm"> * those of multiple arities.  It is impossible to represent such</span></span>
<span id="LC398" class="line" lang="java"><span class="cm"> * genericity with a Java type parameter.&lt;/li&gt;</span></span>
<span id="LC399" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC400" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC401" class="line" lang="java"><span class="cm"> * &lt;h1&gt;&lt;a name="maxarity"&gt;&lt;/a&gt;Arity limits&lt;/h1&gt;</span></span>
<span id="LC402" class="line" lang="java"><span class="cm"> * The JVM imposes on all methods and constructors of any kind an absolute</span></span>
<span id="LC403" class="line" lang="java"><span class="cm"> * limit of 255 stacked arguments.  This limit can appear more restrictive</span></span>
<span id="LC404" class="line" lang="java"><span class="cm"> * in certain cases:</span></span>
<span id="LC405" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC406" class="line" lang="java"><span class="cm"> * &lt;li&gt;A {@code long} or {@code double} argument counts (for purposes of arity limits) as two argument slots.</span></span>
<span id="LC407" class="line" lang="java"><span class="cm"> * &lt;li&gt;A non-static method consumes an extra argument for the object on which the method is called.</span></span>
<span id="LC408" class="line" lang="java"><span class="cm"> * &lt;li&gt;A constructor consumes an extra argument for the object which is being constructed.</span></span>
<span id="LC409" class="line" lang="java"><span class="cm"> * &lt;li&gt;Since a method handle&amp;rsquo;s {@code invoke} method (or other signature-polymorphic method) is non-virtual,</span></span>
<span id="LC410" class="line" lang="java"><span class="cm"> *     it consumes an extra argument for the method handle itself, in addition to any non-virtual receiver object.</span></span>
<span id="LC411" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC412" class="line" lang="java"><span class="cm"> * These limits imply that certain method handles cannot be created, solely because of the JVM limit on stacked arguments.</span></span>
<span id="LC413" class="line" lang="java"><span class="cm"> * For example, if a static JVM method accepts exactly 255 arguments, a method handle cannot be created for it.</span></span>
<span id="LC414" class="line" lang="java"><span class="cm"> * Attempts to create method handles with impossible method types lead to an {@link IllegalArgumentException}.</span></span>
<span id="LC415" class="line" lang="java"><span class="cm"> * In particular, a method handle&amp;rsquo;s type must not have an arity of the exact maximum 255.</span></span>
<span id="LC416" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC417" class="line" lang="java"><span class="cm"> * @see MethodType</span></span>
<span id="LC418" class="line" lang="java"><span class="cm"> * @see MethodHandles</span></span>
<span id="LC419" class="line" lang="java"><span class="cm"> * @author John Rose, JSR 292 EG</span></span>
<span id="LC420" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC421" class="line" lang="java"><span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">class</span> <span class="nc">MethodHandle</span> <span class="o">{</span></span>
<span id="LC422" class="line" lang="java">    <span class="kd">static</span> <span class="o">{</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">initStatics</span><span class="o">();</span> <span class="o">}</span></span>
<span id="LC423" class="line" lang="java"></span>
<span id="LC424" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC425" class="line" lang="java"><span class="cm">     * Internal marker interface which distinguishes (to the Java compiler)</span></span>
<span id="LC426" class="line" lang="java"><span class="cm">     * those methods which are &lt;a href="MethodHandle.html#sigpoly"&gt;signature polymorphic&lt;/a&gt;.</span></span>
<span id="LC427" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC428" class="line" lang="java">    <span class="nd">@java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">annotation</span><span class="o">.</span><span class="na">Target</span><span class="o">({</span><span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">annotation</span><span class="o">.</span><span class="na">ElementType</span><span class="o">.</span><span class="na">METHOD</span><span class="o">})</span></span>
<span id="LC429" class="line" lang="java">    <span class="nd">@java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">annotation</span><span class="o">.</span><span class="na">Retention</span><span class="o">(</span><span class="n">java</span><span class="o">.</span><span class="na">lang</span><span class="o">.</span><span class="na">annotation</span><span class="o">.</span><span class="na">RetentionPolicy</span><span class="o">.</span><span class="na">RUNTIME</span><span class="o">)</span></span>
<span id="LC430" class="line" lang="java">    <span class="nd">@interface</span> <span class="nc">PolymorphicSignature</span> <span class="o">{</span> <span class="o">}</span></span>
<span id="LC431" class="line" lang="java"></span>
<span id="LC432" class="line" lang="java">    <span class="kd">private</span> <span class="kd">final</span> <span class="nc">MethodType</span> <span class="n">type</span><span class="o">;</span></span>
<span id="LC433" class="line" lang="java">    <span class="cm">/*private*/</span> <span class="kd">final</span> <span class="nc">LambdaForm</span> <span class="n">form</span><span class="o">;</span></span>
<span id="LC434" class="line" lang="java">    <span class="c1">// form is not private so that invokers can easily fetch it</span></span>
<span id="LC435" class="line" lang="java">    <span class="cm">/*private*/</span> <span class="nc">MethodHandle</span> <span class="n">asTypeCache</span><span class="o">;</span></span>
<span id="LC436" class="line" lang="java">    <span class="c1">// asTypeCache is not private so that invokers can easily fetch it</span></span>
<span id="LC437" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kt">byte</span> <span class="n">customizationCount</span><span class="o">;</span></span>
<span id="LC438" class="line" lang="java">    <span class="c1">// customizationCount should be accessible from invokers</span></span>
<span id="LC439" class="line" lang="java"></span>
<span id="LC440" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC441" class="line" lang="java"><span class="cm">     * Reports the type of this method handle.</span></span>
<span id="LC442" class="line" lang="java"><span class="cm">     * Every invocation of this method handle via {@code invokeExact} must exactly match this type.</span></span>
<span id="LC443" class="line" lang="java"><span class="cm">     * @return the method handle type</span></span>
<span id="LC444" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC445" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodType</span> <span class="nf">type</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC446" class="line" lang="java">        <span class="k">return</span> <span class="n">type</span><span class="o">;</span></span>
<span id="LC447" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC448" class="line" lang="java"></span>
<span id="LC449" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC450" class="line" lang="java"><span class="cm">     * Package-private constructor for the method handle implementation hierarchy.</span></span>
<span id="LC451" class="line" lang="java"><span class="cm">     * Method handle inheritance will be contained completely within</span></span>
<span id="LC452" class="line" lang="java"><span class="cm">     * the {@code java.lang.invoke} package.</span></span>
<span id="LC453" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC454" class="line" lang="java">    <span class="c1">// @param type type (permanently assigned) of the new method handle</span></span>
<span id="LC455" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="nc">MethodHandle</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">type</span><span class="o">,</span> <span class="nc">LambdaForm</span> <span class="n">form</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC456" class="line" lang="java">        <span class="n">type</span><span class="o">.</span><span class="na">getClass</span><span class="o">();</span>  <span class="c1">// explicit NPE</span></span>
<span id="LC457" class="line" lang="java">        <span class="n">form</span><span class="o">.</span><span class="na">getClass</span><span class="o">();</span>  <span class="c1">// explicit NPE</span></span>
<span id="LC458" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">type</span> <span class="o">=</span> <span class="n">type</span><span class="o">;</span></span>
<span id="LC459" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">form</span> <span class="o">=</span> <span class="n">form</span><span class="o">.</span><span class="na">uncustomize</span><span class="o">();</span></span>
<span id="LC460" class="line" lang="java"></span>
<span id="LC461" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">form</span><span class="o">.</span><span class="na">prepare</span><span class="o">();</span>  <span class="c1">// TO DO:  Try to delay this step until just before invocation.</span></span>
<span id="LC462" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC463" class="line" lang="java"></span>
<span id="LC464" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC465" class="line" lang="java"><span class="cm">     * Invokes the method handle, allowing any caller type descriptor, but requiring an exact type match.</span></span>
<span id="LC466" class="line" lang="java"><span class="cm">     * The symbolic type descriptor at the call site of {@code invokeExact} must</span></span>
<span id="LC467" class="line" lang="java"><span class="cm">     * exactly match this method handle's {@link #type type}.</span></span>
<span id="LC468" class="line" lang="java"><span class="cm">     * No conversions are allowed on arguments or return values.</span></span>
<span id="LC469" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC470" class="line" lang="java"><span class="cm">     * When this method is observed via the Core Reflection API,</span></span>
<span id="LC471" class="line" lang="java"><span class="cm">     * it will appear as a single native method, taking an object array and returning an object.</span></span>
<span id="LC472" class="line" lang="java"><span class="cm">     * If this native method is invoked directly via</span></span>
<span id="LC473" class="line" lang="java"><span class="cm">     * {@link java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}, via JNI,</span></span>
<span id="LC474" class="line" lang="java"><span class="cm">     * or indirectly via {@link java.lang.invoke.MethodHandles.Lookup#unreflect Lookup.unreflect},</span></span>
<span id="LC475" class="line" lang="java"><span class="cm">     * it will throw an {@code UnsupportedOperationException}.</span></span>
<span id="LC476" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC477" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC478" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the target's type is not identical with the caller's symbolic type descriptor</span></span>
<span id="LC479" class="line" lang="java"><span class="cm">     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call</span></span>
<span id="LC480" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC481" class="line" lang="java">    <span class="kd">public</span> <span class="kd">final</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">invokeExact</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC482" class="line" lang="java"></span>
<span id="LC483" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC484" class="line" lang="java"><span class="cm">     * Invokes the method handle, allowing any caller type descriptor,</span></span>
<span id="LC485" class="line" lang="java"><span class="cm">     * and optionally performing conversions on arguments and return values.</span></span>
<span id="LC486" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC487" class="line" lang="java"><span class="cm">     * If the call site's symbolic type descriptor exactly matches this method handle's {@link #type type},</span></span>
<span id="LC488" class="line" lang="java"><span class="cm">     * the call proceeds as if by {@link #invokeExact invokeExact}.</span></span>
<span id="LC489" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC490" class="line" lang="java"><span class="cm">     * Otherwise, the call proceeds as if this method handle were first</span></span>
<span id="LC491" class="line" lang="java"><span class="cm">     * adjusted by calling {@link #asType asType} to adjust this method handle</span></span>
<span id="LC492" class="line" lang="java"><span class="cm">     * to the required type, and then the call proceeds as if by</span></span>
<span id="LC493" class="line" lang="java"><span class="cm">     * {@link #invokeExact invokeExact} on the adjusted method handle.</span></span>
<span id="LC494" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC495" class="line" lang="java"><span class="cm">     * There is no guarantee that the {@code asType} call is actually made.</span></span>
<span id="LC496" class="line" lang="java"><span class="cm">     * If the JVM can predict the results of making the call, it may perform</span></span>
<span id="LC497" class="line" lang="java"><span class="cm">     * adaptations directly on the caller's arguments,</span></span>
<span id="LC498" class="line" lang="java"><span class="cm">     * and call the target method handle according to its own exact type.</span></span>
<span id="LC499" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC500" class="line" lang="java"><span class="cm">     * The resolved type descriptor at the call site of {@code invoke} must</span></span>
<span id="LC501" class="line" lang="java"><span class="cm">     * be a valid argument to the receivers {@code asType} method.</span></span>
<span id="LC502" class="line" lang="java"><span class="cm">     * In particular, the caller must specify the same argument arity</span></span>
<span id="LC503" class="line" lang="java"><span class="cm">     * as the callee's type,</span></span>
<span id="LC504" class="line" lang="java"><span class="cm">     * if the callee is not a {@linkplain #asVarargsCollector variable arity collector}.</span></span>
<span id="LC505" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC506" class="line" lang="java"><span class="cm">     * When this method is observed via the Core Reflection API,</span></span>
<span id="LC507" class="line" lang="java"><span class="cm">     * it will appear as a single native method, taking an object array and returning an object.</span></span>
<span id="LC508" class="line" lang="java"><span class="cm">     * If this native method is invoked directly via</span></span>
<span id="LC509" class="line" lang="java"><span class="cm">     * {@link java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}, via JNI,</span></span>
<span id="LC510" class="line" lang="java"><span class="cm">     * or indirectly via {@link java.lang.invoke.MethodHandles.Lookup#unreflect Lookup.unreflect},</span></span>
<span id="LC511" class="line" lang="java"><span class="cm">     * it will throw an {@code UnsupportedOperationException}.</span></span>
<span id="LC512" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC513" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC514" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the target's type cannot be adjusted to the caller's symbolic type descriptor</span></span>
<span id="LC515" class="line" lang="java"><span class="cm">     * @throws ClassCastException if the target's type can be adjusted to the caller, but a reference cast fails</span></span>
<span id="LC516" class="line" lang="java"><span class="cm">     * @throws Throwable anything thrown by the underlying method propagates unchanged through the method handle call</span></span>
<span id="LC517" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC518" class="line" lang="java">    <span class="kd">public</span> <span class="kd">final</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">invoke</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC519" class="line" lang="java"></span>
<span id="LC520" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC521" class="line" lang="java"><span class="cm">     * Private method for trusted invocation of a method handle respecting simplified signatures.</span></span>
<span id="LC522" class="line" lang="java"><span class="cm">     * Type mismatches will not throw {@code WrongMethodTypeException}, but could crash the JVM.</span></span>
<span id="LC523" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC524" class="line" lang="java"><span class="cm">     * The caller signature is restricted to the following basic types:</span></span>
<span id="LC525" class="line" lang="java"><span class="cm">     * Object, int, long, float, double, and void return.</span></span>
<span id="LC526" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC527" class="line" lang="java"><span class="cm">     * The caller is responsible for maintaining type correctness by ensuring</span></span>
<span id="LC528" class="line" lang="java"><span class="cm">     * that the each outgoing argument value is a member of the range of the corresponding</span></span>
<span id="LC529" class="line" lang="java"><span class="cm">     * callee argument type.</span></span>
<span id="LC530" class="line" lang="java"><span class="cm">     * (The caller should therefore issue appropriate casts and integer narrowing</span></span>
<span id="LC531" class="line" lang="java"><span class="cm">     * operations on outgoing argument values.)</span></span>
<span id="LC532" class="line" lang="java"><span class="cm">     * The caller can assume that the incoming result value is part of the range</span></span>
<span id="LC533" class="line" lang="java"><span class="cm">     * of the callee's return type.</span></span>
<span id="LC534" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC535" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC536" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC537" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kd">final</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">invokeBasic</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC538" class="line" lang="java"></span>
<span id="LC539" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC540" class="line" lang="java"><span class="cm">     * Private method for trusted invocation of a MemberName of kind {@code REF_invokeVirtual}.</span></span>
<span id="LC541" class="line" lang="java"><span class="cm">     * The caller signature is restricted to basic types as with {@code invokeBasic}.</span></span>
<span id="LC542" class="line" lang="java"><span class="cm">     * The trailing (not leading) argument must be a MemberName.</span></span>
<span id="LC543" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC544" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC545" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC546" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kd">static</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">linkToVirtual</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC547" class="line" lang="java"></span>
<span id="LC548" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC549" class="line" lang="java"><span class="cm">     * Private method for trusted invocation of a MemberName of kind {@code REF_invokeStatic}.</span></span>
<span id="LC550" class="line" lang="java"><span class="cm">     * The caller signature is restricted to basic types as with {@code invokeBasic}.</span></span>
<span id="LC551" class="line" lang="java"><span class="cm">     * The trailing (not leading) argument must be a MemberName.</span></span>
<span id="LC552" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC553" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC554" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC555" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kd">static</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">linkToStatic</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC556" class="line" lang="java"></span>
<span id="LC557" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC558" class="line" lang="java"><span class="cm">     * Private method for trusted invocation of a MemberName of kind {@code REF_invokeSpecial}.</span></span>
<span id="LC559" class="line" lang="java"><span class="cm">     * The caller signature is restricted to basic types as with {@code invokeBasic}.</span></span>
<span id="LC560" class="line" lang="java"><span class="cm">     * The trailing (not leading) argument must be a MemberName.</span></span>
<span id="LC561" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC562" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC563" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC564" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kd">static</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">linkToSpecial</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC565" class="line" lang="java"></span>
<span id="LC566" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC567" class="line" lang="java"><span class="cm">     * Private method for trusted invocation of a MemberName of kind {@code REF_invokeInterface}.</span></span>
<span id="LC568" class="line" lang="java"><span class="cm">     * The caller signature is restricted to basic types as with {@code invokeBasic}.</span></span>
<span id="LC569" class="line" lang="java"><span class="cm">     * The trailing (not leading) argument must be a MemberName.</span></span>
<span id="LC570" class="line" lang="java"><span class="cm">     * @param args the signature-polymorphic parameter list, statically represented using varargs</span></span>
<span id="LC571" class="line" lang="java"><span class="cm">     * @return the signature-polymorphic result, statically represented using {@code Object}</span></span>
<span id="LC572" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC573" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kd">static</span> <span class="kd">native</span> <span class="nd">@PolymorphicSignature</span> <span class="nc">Object</span> <span class="nf">linkToInterface</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span><span class="o">;</span></span>
<span id="LC574" class="line" lang="java"></span>
<span id="LC575" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC576" class="line" lang="java"><span class="cm">     * Performs a variable arity invocation, passing the arguments in the given list</span></span>
<span id="LC577" class="line" lang="java"><span class="cm">     * to the method handle, as if via an inexact {@link #invoke invoke} from a call site</span></span>
<span id="LC578" class="line" lang="java"><span class="cm">     * which mentions only the type {@code Object}, and whose arity is the length</span></span>
<span id="LC579" class="line" lang="java"><span class="cm">     * of the argument list.</span></span>
<span id="LC580" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC581" class="line" lang="java"><span class="cm">     * Specifically, execution proceeds as if by the following steps,</span></span>
<span id="LC582" class="line" lang="java"><span class="cm">     * although the methods are not guaranteed to be called if the JVM</span></span>
<span id="LC583" class="line" lang="java"><span class="cm">     * can predict their effects.</span></span>
<span id="LC584" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC585" class="line" lang="java"><span class="cm">     * &lt;li&gt;Determine the length of the argument array as {@code N}.</span></span>
<span id="LC586" class="line" lang="java"><span class="cm">     *     For a null reference, {@code N=0}. &lt;/li&gt;</span></span>
<span id="LC587" class="line" lang="java"><span class="cm">     * &lt;li&gt;Determine the general type {@code TN} of {@code N} arguments as</span></span>
<span id="LC588" class="line" lang="java"><span class="cm">     *     as {@code TN=MethodType.genericMethodType(N)}.&lt;/li&gt;</span></span>
<span id="LC589" class="line" lang="java"><span class="cm">     * &lt;li&gt;Force the original target method handle {@code MH0} to the</span></span>
<span id="LC590" class="line" lang="java"><span class="cm">     *     required type, as {@code MH1 = MH0.asType(TN)}. &lt;/li&gt;</span></span>
<span id="LC591" class="line" lang="java"><span class="cm">     * &lt;li&gt;Spread the array into {@code N} separate arguments {@code A0, ...}. &lt;/li&gt;</span></span>
<span id="LC592" class="line" lang="java"><span class="cm">     * &lt;li&gt;Invoke the type-adjusted method handle on the unpacked arguments:</span></span>
<span id="LC593" class="line" lang="java"><span class="cm">     *     MH1.invokeExact(A0, ...). &lt;/li&gt;</span></span>
<span id="LC594" class="line" lang="java"><span class="cm">     * &lt;li&gt;Take the return value as an {@code Object} reference. &lt;/li&gt;</span></span>
<span id="LC595" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC596" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC597" class="line" lang="java"><span class="cm">     * Because of the action of the {@code asType} step, the following argument</span></span>
<span id="LC598" class="line" lang="java"><span class="cm">     * conversions are applied as necessary:</span></span>
<span id="LC599" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC600" class="line" lang="java"><span class="cm">     * &lt;li&gt;reference casting</span></span>
<span id="LC601" class="line" lang="java"><span class="cm">     * &lt;li&gt;unboxing</span></span>
<span id="LC602" class="line" lang="java"><span class="cm">     * &lt;li&gt;widening primitive conversions</span></span>
<span id="LC603" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC604" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC605" class="line" lang="java"><span class="cm">     * The result returned by the call is boxed if it is a primitive,</span></span>
<span id="LC606" class="line" lang="java"><span class="cm">     * or forced to null if the return type is void.</span></span>
<span id="LC607" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC608" class="line" lang="java"><span class="cm">     * This call is equivalent to the following code:</span></span>
<span id="LC609" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC610" class="line" lang="java"><span class="cm">     * MethodHandle invoker = MethodHandles.spreadInvoker(this.type(), 0);</span></span>
<span id="LC611" class="line" lang="java"><span class="cm">     * Object result = invoker.invokeExact(this, arguments);</span></span>
<span id="LC612" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC613" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC614" class="line" lang="java"><span class="cm">     * Unlike the signature polymorphic methods {@code invokeExact} and {@code invoke},</span></span>
<span id="LC615" class="line" lang="java"><span class="cm">     * {@code invokeWithArguments} can be accessed normally via the Core Reflection API and JNI.</span></span>
<span id="LC616" class="line" lang="java"><span class="cm">     * It can therefore be used as a bridge between native or reflective code and method handles.</span></span>
<span id="LC617" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC618" class="line" lang="java"><span class="cm">     * @param arguments the arguments to pass to the target</span></span>
<span id="LC619" class="line" lang="java"><span class="cm">     * @return the result returned by the target</span></span>
<span id="LC620" class="line" lang="java"><span class="cm">     * @throws ClassCastException if an argument cannot be converted by reference casting</span></span>
<span id="LC621" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the target's type cannot be adjusted to take the given number of {@code Object} arguments</span></span>
<span id="LC622" class="line" lang="java"><span class="cm">     * @throws Throwable anything thrown by the target method invocation</span></span>
<span id="LC623" class="line" lang="java"><span class="cm">     * @see MethodHandles#spreadInvoker</span></span>
<span id="LC624" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC625" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Object</span> <span class="nf">invokeWithArguments</span><span class="o">(</span><span class="nc">Object</span><span class="o">...</span> <span class="n">arguments</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span> <span class="o">{</span></span>
<span id="LC626" class="line" lang="java">        <span class="nc">MethodType</span> <span class="n">invocationType</span> <span class="o">=</span> <span class="nc">MethodType</span><span class="o">.</span><span class="na">genericMethodType</span><span class="o">(</span><span class="n">arguments</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">?</span> <span class="mi">0</span> <span class="o">:</span> <span class="n">arguments</span><span class="o">.</span><span class="na">length</span><span class="o">);</span></span>
<span id="LC627" class="line" lang="java">        <span class="k">return</span> <span class="n">invocationType</span><span class="o">.</span><span class="na">invokers</span><span class="o">().</span><span class="na">spreadInvoker</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">invokeExact</span><span class="o">(</span><span class="n">asType</span><span class="o">(</span><span class="n">invocationType</span><span class="o">),</span> <span class="n">arguments</span><span class="o">);</span></span>
<span id="LC628" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC629" class="line" lang="java"></span>
<span id="LC630" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC631" class="line" lang="java"><span class="cm">     * Performs a variable arity invocation, passing the arguments in the given array</span></span>
<span id="LC632" class="line" lang="java"><span class="cm">     * to the method handle, as if via an inexact {@link #invoke invoke} from a call site</span></span>
<span id="LC633" class="line" lang="java"><span class="cm">     * which mentions only the type {@code Object}, and whose arity is the length</span></span>
<span id="LC634" class="line" lang="java"><span class="cm">     * of the argument array.</span></span>
<span id="LC635" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC636" class="line" lang="java"><span class="cm">     * This method is also equivalent to the following code:</span></span>
<span id="LC637" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC638" class="line" lang="java"><span class="cm">     *   invokeWithArguments(arguments.toArray()</span></span>
<span id="LC639" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC640" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC641" class="line" lang="java"><span class="cm">     * @param arguments the arguments to pass to the target</span></span>
<span id="LC642" class="line" lang="java"><span class="cm">     * @return the result returned by the target</span></span>
<span id="LC643" class="line" lang="java"><span class="cm">     * @throws NullPointerException if {@code arguments} is a null reference</span></span>
<span id="LC644" class="line" lang="java"><span class="cm">     * @throws ClassCastException if an argument cannot be converted by reference casting</span></span>
<span id="LC645" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the target's type cannot be adjusted to take the given number of {@code Object} arguments</span></span>
<span id="LC646" class="line" lang="java"><span class="cm">     * @throws Throwable anything thrown by the target method invocation</span></span>
<span id="LC647" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC648" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Object</span> <span class="nf">invokeWithArguments</span><span class="o">(</span><span class="n">java</span><span class="o">.</span><span class="na">util</span><span class="o">.</span><span class="na">List</span><span class="o">&lt;?&gt;</span> <span class="n">arguments</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">Throwable</span> <span class="o">{</span></span>
<span id="LC649" class="line" lang="java">        <span class="k">return</span> <span class="nf">invokeWithArguments</span><span class="o">(</span><span class="n">arguments</span><span class="o">.</span><span class="na">toArray</span><span class="o">());</span></span>
<span id="LC650" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC651" class="line" lang="java"></span>
<span id="LC652" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC653" class="line" lang="java"><span class="cm">     * Produces an adapter method handle which adapts the type of the</span></span>
<span id="LC654" class="line" lang="java"><span class="cm">     * current method handle to a new type.</span></span>
<span id="LC655" class="line" lang="java"><span class="cm">     * The resulting method handle is guaranteed to report a type</span></span>
<span id="LC656" class="line" lang="java"><span class="cm">     * which is equal to the desired new type.</span></span>
<span id="LC657" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC658" class="line" lang="java"><span class="cm">     * If the original type and new type are equal, returns {@code this}.</span></span>
<span id="LC659" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC660" class="line" lang="java"><span class="cm">     * The new method handle, when invoked, will perform the following</span></span>
<span id="LC661" class="line" lang="java"><span class="cm">     * steps:</span></span>
<span id="LC662" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC663" class="line" lang="java"><span class="cm">     * &lt;li&gt;Convert the incoming argument list to match the original</span></span>
<span id="LC664" class="line" lang="java"><span class="cm">     *     method handle's argument list.</span></span>
<span id="LC665" class="line" lang="java"><span class="cm">     * &lt;li&gt;Invoke the original method handle on the converted argument list.</span></span>
<span id="LC666" class="line" lang="java"><span class="cm">     * &lt;li&gt;Convert any result returned by the original method handle</span></span>
<span id="LC667" class="line" lang="java"><span class="cm">     *     to the return type of new method handle.</span></span>
<span id="LC668" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC669" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC670" class="line" lang="java"><span class="cm">     * This method provides the crucial behavioral difference between</span></span>
<span id="LC671" class="line" lang="java"><span class="cm">     * {@link #invokeExact invokeExact} and plain, inexact {@link #invoke invoke}.</span></span>
<span id="LC672" class="line" lang="java"><span class="cm">     * The two methods</span></span>
<span id="LC673" class="line" lang="java"><span class="cm">     * perform the same steps when the caller's type descriptor exactly m atches</span></span>
<span id="LC674" class="line" lang="java"><span class="cm">     * the callee's, but when the types differ, plain {@link #invoke invoke}</span></span>
<span id="LC675" class="line" lang="java"><span class="cm">     * also calls {@code asType} (or some internal equivalent) in order</span></span>
<span id="LC676" class="line" lang="java"><span class="cm">     * to match up the caller's and callee's types.</span></span>
<span id="LC677" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC678" class="line" lang="java"><span class="cm">     * If the current method is a variable arity method handle</span></span>
<span id="LC679" class="line" lang="java"><span class="cm">     * argument list conversion may involve the conversion and collection</span></span>
<span id="LC680" class="line" lang="java"><span class="cm">     * of several arguments into an array, as</span></span>
<span id="LC681" class="line" lang="java"><span class="cm">     * {@linkplain #asVarargsCollector described elsewhere}.</span></span>
<span id="LC682" class="line" lang="java"><span class="cm">     * In every other case, all conversions are applied &lt;em&gt;pairwise&lt;/em&gt;,</span></span>
<span id="LC683" class="line" lang="java"><span class="cm">     * which means that each argument or return value is converted to</span></span>
<span id="LC684" class="line" lang="java"><span class="cm">     * exactly one argument or return value (or no return value).</span></span>
<span id="LC685" class="line" lang="java"><span class="cm">     * The applied conversions are defined by consulting the</span></span>
<span id="LC686" class="line" lang="java"><span class="cm">     * the corresponding component types of the old and new</span></span>
<span id="LC687" class="line" lang="java"><span class="cm">     * method handle types.</span></span>
<span id="LC688" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC689" class="line" lang="java"><span class="cm">     * Let &lt;em&gt;T0&lt;/em&gt; and &lt;em&gt;T1&lt;/em&gt; be corresponding new and old parameter types,</span></span>
<span id="LC690" class="line" lang="java"><span class="cm">     * or old and new return types.  Specifically, for some valid index {@code i}, let</span></span>
<span id="LC691" class="line" lang="java"><span class="cm">     * &lt;em&gt;T0&lt;/em&gt;{@code =newType.parameterType(i)} and &lt;em&gt;T1&lt;/em&gt;{@code =this.type().parameterType(i)}.</span></span>
<span id="LC692" class="line" lang="java"><span class="cm">     * Or else, going the other way for return values, let</span></span>
<span id="LC693" class="line" lang="java"><span class="cm">     * &lt;em&gt;T0&lt;/em&gt;{@code =this.type().returnType()} and &lt;em&gt;T1&lt;/em&gt;{@code =newType.returnType()}.</span></span>
<span id="LC694" class="line" lang="java"><span class="cm">     * If the types are the same, the new method handle makes no change</span></span>
<span id="LC695" class="line" lang="java"><span class="cm">     * to the corresponding argument or return value (if any).</span></span>
<span id="LC696" class="line" lang="java"><span class="cm">     * Otherwise, one of the following conversions is applied</span></span>
<span id="LC697" class="line" lang="java"><span class="cm">     * if possible:</span></span>
<span id="LC698" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC699" class="line" lang="java"><span class="cm">     * &lt;li&gt;If &lt;em&gt;T0&lt;/em&gt; and &lt;em&gt;T1&lt;/em&gt; are references, then a cast to &lt;em&gt;T1&lt;/em&gt; is applied.</span></span>
<span id="LC700" class="line" lang="java"><span class="cm">     *     (The types do not need to be related in any particular way.</span></span>
<span id="LC701" class="line" lang="java"><span class="cm">     *     This is because a dynamic value of null can convert to any reference type.)</span></span>
<span id="LC702" class="line" lang="java"><span class="cm">     * &lt;li&gt;If &lt;em&gt;T0&lt;/em&gt; and &lt;em&gt;T1&lt;/em&gt; are primitives, then a Java method invocation</span></span>
<span id="LC703" class="line" lang="java"><span class="cm">     *     conversion (JLS 5.3) is applied, if one exists.</span></span>
<span id="LC704" class="line" lang="java"><span class="cm">     *     (Specifically, &lt;em&gt;T0&lt;/em&gt; must convert to &lt;em&gt;T1&lt;/em&gt; by a widening primitive conversion.)</span></span>
<span id="LC705" class="line" lang="java"><span class="cm">     * &lt;li&gt;If &lt;em&gt;T0&lt;/em&gt; is a primitive and &lt;em&gt;T1&lt;/em&gt; a reference,</span></span>
<span id="LC706" class="line" lang="java"><span class="cm">     *     a Java casting conversion (JLS 5.5) is applied if one exists.</span></span>
<span id="LC707" class="line" lang="java"><span class="cm">     *     (Specifically, the value is boxed from &lt;em&gt;T0&lt;/em&gt; to its wrapper class,</span></span>
<span id="LC708" class="line" lang="java"><span class="cm">     *     which is then widened as needed to &lt;em&gt;T1&lt;/em&gt;.)</span></span>
<span id="LC709" class="line" lang="java"><span class="cm">     * &lt;li&gt;If &lt;em&gt;T0&lt;/em&gt; is a reference and &lt;em&gt;T1&lt;/em&gt; a primitive, an unboxing</span></span>
<span id="LC710" class="line" lang="java"><span class="cm">     *     conversion will be applied at runtime, possibly followed</span></span>
<span id="LC711" class="line" lang="java"><span class="cm">     *     by a Java method invocation conversion (JLS 5.3)</span></span>
<span id="LC712" class="line" lang="java"><span class="cm">     *     on the primitive value.  (These are the primitive widening conversions.)</span></span>
<span id="LC713" class="line" lang="java"><span class="cm">     *     &lt;em&gt;T0&lt;/em&gt; must be a wrapper class or a supertype of one.</span></span>
<span id="LC714" class="line" lang="java"><span class="cm">     *     (In the case where &lt;em&gt;T0&lt;/em&gt; is Object, these are the conversions</span></span>
<span id="LC715" class="line" lang="java"><span class="cm">     *     allowed by {@link java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}.)</span></span>
<span id="LC716" class="line" lang="java"><span class="cm">     *     The unboxing conversion must have a possibility of success, which means that</span></span>
<span id="LC717" class="line" lang="java"><span class="cm">     *     if &lt;em&gt;T0&lt;/em&gt; is not itself a wrapper class, there must exist at least one</span></span>
<span id="LC718" class="line" lang="java"><span class="cm">     *     wrapper class &lt;em&gt;TW&lt;/em&gt; which is a subtype of &lt;em&gt;T0&lt;/em&gt; and whose unboxed</span></span>
<span id="LC719" class="line" lang="java"><span class="cm">     *     primitive value can be widened to &lt;em&gt;T1&lt;/em&gt;.</span></span>
<span id="LC720" class="line" lang="java"><span class="cm">     * &lt;li&gt;If the return type &lt;em&gt;T1&lt;/em&gt; is marked as void, any returned value is discarded</span></span>
<span id="LC721" class="line" lang="java"><span class="cm">     * &lt;li&gt;If the return type &lt;em&gt;T0&lt;/em&gt; is void and &lt;em&gt;T1&lt;/em&gt; a reference, a null value is introduced.</span></span>
<span id="LC722" class="line" lang="java"><span class="cm">     * &lt;li&gt;If the return type &lt;em&gt;T0&lt;/em&gt; is void and &lt;em&gt;T1&lt;/em&gt; a primitive,</span></span>
<span id="LC723" class="line" lang="java"><span class="cm">     *     a zero value is introduced.</span></span>
<span id="LC724" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC725" class="line" lang="java"><span class="cm">     * (&lt;em&gt;Note:&lt;/em&gt; Both &lt;em&gt;T0&lt;/em&gt; and &lt;em&gt;T1&lt;/em&gt; may be regarded as static types,</span></span>
<span id="LC726" class="line" lang="java"><span class="cm">     * because neither corresponds specifically to the &lt;em&gt;dynamic type&lt;/em&gt; of any</span></span>
<span id="LC727" class="line" lang="java"><span class="cm">     * actual argument or return value.)</span></span>
<span id="LC728" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC729" class="line" lang="java"><span class="cm">     * The method handle conversion cannot be made if any one of the required</span></span>
<span id="LC730" class="line" lang="java"><span class="cm">     * pairwise conversions cannot be made.</span></span>
<span id="LC731" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC732" class="line" lang="java"><span class="cm">     * At runtime, the conversions applied to reference arguments</span></span>
<span id="LC733" class="line" lang="java"><span class="cm">     * or return values may require additional runtime checks which can fail.</span></span>
<span id="LC734" class="line" lang="java"><span class="cm">     * An unboxing operation may fail because the original reference is null,</span></span>
<span id="LC735" class="line" lang="java"><span class="cm">     * causing a {@link java.lang.NullPointerException NullPointerException}.</span></span>
<span id="LC736" class="line" lang="java"><span class="cm">     * An unboxing operation or a reference cast may also fail on a reference</span></span>
<span id="LC737" class="line" lang="java"><span class="cm">     * to an object of the wrong type,</span></span>
<span id="LC738" class="line" lang="java"><span class="cm">     * causing a {@link java.lang.ClassCastException ClassCastException}.</span></span>
<span id="LC739" class="line" lang="java"><span class="cm">     * Although an unboxing operation may accept several kinds of wrappers,</span></span>
<span id="LC740" class="line" lang="java"><span class="cm">     * if none are available, a {@code ClassCastException} will be thrown.</span></span>
<span id="LC741" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC742" class="line" lang="java"><span class="cm">     * @param newType the expected type of the new method handle</span></span>
<span id="LC743" class="line" lang="java"><span class="cm">     * @return a method handle which delegates to {@code this} after performing</span></span>
<span id="LC744" class="line" lang="java"><span class="cm">     *           any necessary argument conversions, and arranges for any</span></span>
<span id="LC745" class="line" lang="java"><span class="cm">     *           necessary return value conversions</span></span>
<span id="LC746" class="line" lang="java"><span class="cm">     * @throws NullPointerException if {@code newType} is a null reference</span></span>
<span id="LC747" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the conversion cannot be made</span></span>
<span id="LC748" class="line" lang="java"><span class="cm">     * @see MethodHandles#explicitCastArguments</span></span>
<span id="LC749" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC750" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodHandle</span> <span class="nf">asType</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">newType</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC751" class="line" lang="java">        <span class="c1">// Fast path alternative to a heavyweight {@code asType} call.</span></span>
<span id="LC752" class="line" lang="java">        <span class="c1">// Return 'this' if the conversion will be a no-op.</span></span>
<span id="LC753" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">newType</span> <span class="o">==</span> <span class="n">type</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC754" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC755" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC756" class="line" lang="java">        <span class="c1">// Return 'this.asTypeCache' if the conversion is already memoized.</span></span>
<span id="LC757" class="line" lang="java">        <span class="nc">MethodHandle</span> <span class="n">atc</span> <span class="o">=</span> <span class="n">asTypeCached</span><span class="o">(</span><span class="n">newType</span><span class="o">);</span></span>
<span id="LC758" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">atc</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC759" class="line" lang="java">            <span class="k">return</span> <span class="n">atc</span><span class="o">;</span></span>
<span id="LC760" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC761" class="line" lang="java">        <span class="k">return</span> <span class="nf">asTypeUncached</span><span class="o">(</span><span class="n">newType</span><span class="o">);</span></span>
<span id="LC762" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC763" class="line" lang="java"></span>
<span id="LC764" class="line" lang="java">    <span class="kd">private</span> <span class="nc">MethodHandle</span> <span class="nf">asTypeCached</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">newType</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC765" class="line" lang="java">        <span class="nc">MethodHandle</span> <span class="n">atc</span> <span class="o">=</span> <span class="n">asTypeCache</span><span class="o">;</span></span>
<span id="LC766" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">atc</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">newType</span> <span class="o">==</span> <span class="n">atc</span><span class="o">.</span><span class="na">type</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC767" class="line" lang="java">            <span class="k">return</span> <span class="n">atc</span><span class="o">;</span></span>
<span id="LC768" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC769" class="line" lang="java">        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC770" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC771" class="line" lang="java"></span>
<span id="LC772" class="line" lang="java">    <span class="cm">/** Override this to change asType behavior. */</span></span>
<span id="LC773" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="nc">MethodHandle</span> <span class="nf">asTypeUncached</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">newType</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC774" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">type</span><span class="o">.</span><span class="na">isConvertibleTo</span><span class="o">(</span><span class="n">newType</span><span class="o">))</span></span>
<span id="LC775" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">WrongMethodTypeException</span><span class="o">(</span><span class="s">"cannot convert "</span><span class="o">+</span><span class="k">this</span><span class="o">+</span><span class="s">" to "</span><span class="o">+</span><span class="n">newType</span><span class="o">);</span></span>
<span id="LC776" class="line" lang="java">        <span class="k">return</span> <span class="n">asTypeCache</span> <span class="o">=</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">makePairwiseConvert</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">newType</span><span class="o">,</span> <span class="kc">true</span><span class="o">);</span></span>
<span id="LC777" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC778" class="line" lang="java"></span>
<span id="LC779" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC780" class="line" lang="java"><span class="cm">     * Makes an &lt;em&gt;array-spreading&lt;/em&gt; method handle, which accepts a trailing array argument</span></span>
<span id="LC781" class="line" lang="java"><span class="cm">     * and spreads its elements as positional arguments.</span></span>
<span id="LC782" class="line" lang="java"><span class="cm">     * The new method handle adapts, as its &lt;i&gt;target&lt;/i&gt;,</span></span>
<span id="LC783" class="line" lang="java"><span class="cm">     * the current method handle.  The type of the adapter will be</span></span>
<span id="LC784" class="line" lang="java"><span class="cm">     * the same as the type of the target, except that the final</span></span>
<span id="LC785" class="line" lang="java"><span class="cm">     * {@code arrayLength} parameters of the target's type are replaced</span></span>
<span id="LC786" class="line" lang="java"><span class="cm">     * by a single array parameter of type {@code arrayType}.</span></span>
<span id="LC787" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC788" class="line" lang="java"><span class="cm">     * If the array element type differs from any of the corresponding</span></span>
<span id="LC789" class="line" lang="java"><span class="cm">     * argument types on the original target,</span></span>
<span id="LC790" class="line" lang="java"><span class="cm">     * the original target is adapted to take the array elements directly,</span></span>
<span id="LC791" class="line" lang="java"><span class="cm">     * as if by a call to {@link #asType asType}.</span></span>
<span id="LC792" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC793" class="line" lang="java"><span class="cm">     * When called, the adapter replaces a trailing array argument</span></span>
<span id="LC794" class="line" lang="java"><span class="cm">     * by the array's elements, each as its own argument to the target.</span></span>
<span id="LC795" class="line" lang="java"><span class="cm">     * (The order of the arguments is preserved.)</span></span>
<span id="LC796" class="line" lang="java"><span class="cm">     * They are converted pairwise by casting and/or unboxing</span></span>
<span id="LC797" class="line" lang="java"><span class="cm">     * to the types of the trailing parameters of the target.</span></span>
<span id="LC798" class="line" lang="java"><span class="cm">     * Finally the target is called.</span></span>
<span id="LC799" class="line" lang="java"><span class="cm">     * What the target eventually returns is returned unchanged by the adapter.</span></span>
<span id="LC800" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC801" class="line" lang="java"><span class="cm">     * Before calling the target, the adapter verifies that the array</span></span>
<span id="LC802" class="line" lang="java"><span class="cm">     * contains exactly enough elements to provide a correct argument count</span></span>
<span id="LC803" class="line" lang="java"><span class="cm">     * to the target method handle.</span></span>
<span id="LC804" class="line" lang="java"><span class="cm">     * (The array may also be null when zero elements are required.)</span></span>
<span id="LC805" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC806" class="line" lang="java"><span class="cm">     * If, when the adapter is called, the supplied array argument does</span></span>
<span id="LC807" class="line" lang="java"><span class="cm">     * not have the correct number of elements, the adapter will throw</span></span>
<span id="LC808" class="line" lang="java"><span class="cm">     * an {@link IllegalArgumentException} instead of invoking the target.</span></span>
<span id="LC809" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC810" class="line" lang="java"><span class="cm">     * Here are some simple examples of array-spreading method handles:</span></span>
<span id="LC811" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC812" class="line" lang="java"><span class="cm">MethodHandle equals = publicLookup()</span></span>
<span id="LC813" class="line" lang="java"><span class="cm">  .findVirtual(String.class, "equals", methodType(boolean.class, Object.class));</span></span>
<span id="LC814" class="line" lang="java"><span class="cm">assert( (boolean) equals.invokeExact("me", (Object)"me"));</span></span>
<span id="LC815" class="line" lang="java"><span class="cm">assert(!(boolean) equals.invokeExact("me", (Object)"thee"));</span></span>
<span id="LC816" class="line" lang="java"><span class="cm">// spread both arguments from a 2-array:</span></span>
<span id="LC817" class="line" lang="java"><span class="cm">MethodHandle eq2 = equals.asSpreader(Object[].class, 2);</span></span>
<span id="LC818" class="line" lang="java"><span class="cm">assert( (boolean) eq2.invokeExact(new Object[]{ "me", "me" }));</span></span>
<span id="LC819" class="line" lang="java"><span class="cm">assert(!(boolean) eq2.invokeExact(new Object[]{ "me", "thee" }));</span></span>
<span id="LC820" class="line" lang="java"><span class="cm">// try to spread from anything but a 2-array:</span></span>
<span id="LC821" class="line" lang="java"><span class="cm">for (int n = 0; n &lt;= 10; n++) {</span></span>
<span id="LC822" class="line" lang="java"><span class="cm">  Object[] badArityArgs = (n == 2 ? null : new Object[n]);</span></span>
<span id="LC823" class="line" lang="java"><span class="cm">  try { assert((boolean) eq2.invokeExact(badArityArgs) &amp;&amp; false); }</span></span>
<span id="LC824" class="line" lang="java"><span class="cm">  catch (IllegalArgumentException ex) { } // OK</span></span>
<span id="LC825" class="line" lang="java"><span class="cm">}</span></span>
<span id="LC826" class="line" lang="java"><span class="cm">// spread both arguments from a String array:</span></span>
<span id="LC827" class="line" lang="java"><span class="cm">MethodHandle eq2s = equals.asSpreader(String[].class, 2);</span></span>
<span id="LC828" class="line" lang="java"><span class="cm">assert( (boolean) eq2s.invokeExact(new String[]{ "me", "me" }));</span></span>
<span id="LC829" class="line" lang="java"><span class="cm">assert(!(boolean) eq2s.invokeExact(new String[]{ "me", "thee" }));</span></span>
<span id="LC830" class="line" lang="java"><span class="cm">// spread second arguments from a 1-array:</span></span>
<span id="LC831" class="line" lang="java"><span class="cm">MethodHandle eq1 = equals.asSpreader(Object[].class, 1);</span></span>
<span id="LC832" class="line" lang="java"><span class="cm">assert( (boolean) eq1.invokeExact("me", new Object[]{ "me" }));</span></span>
<span id="LC833" class="line" lang="java"><span class="cm">assert(!(boolean) eq1.invokeExact("me", new Object[]{ "thee" }));</span></span>
<span id="LC834" class="line" lang="java"><span class="cm">// spread no arguments from a 0-array or null:</span></span>
<span id="LC835" class="line" lang="java"><span class="cm">MethodHandle eq0 = equals.asSpreader(Object[].class, 0);</span></span>
<span id="LC836" class="line" lang="java"><span class="cm">assert( (boolean) eq0.invokeExact("me", (Object)"me", new Object[0]));</span></span>
<span id="LC837" class="line" lang="java"><span class="cm">assert(!(boolean) eq0.invokeExact("me", (Object)"thee", (Object[])null));</span></span>
<span id="LC838" class="line" lang="java"><span class="cm">// asSpreader and asCollector are approximate inverses:</span></span>
<span id="LC839" class="line" lang="java"><span class="cm">for (int n = 0; n &lt;= 2; n++) {</span></span>
<span id="LC840" class="line" lang="java"><span class="cm">    for (Class&lt;?&gt; a : new Class&lt;?&gt;[]{Object[].class, String[].class, CharSequence[].class}) {</span></span>
<span id="LC841" class="line" lang="java"><span class="cm">        MethodHandle equals2 = equals.asSpreader(a, n).asCollector(a, n);</span></span>
<span id="LC842" class="line" lang="java"><span class="cm">        assert( (boolean) equals2.invokeWithArguments("me", "me"));</span></span>
<span id="LC843" class="line" lang="java"><span class="cm">        assert(!(boolean) equals2.invokeWithArguments("me", "thee"));</span></span>
<span id="LC844" class="line" lang="java"><span class="cm">    }</span></span>
<span id="LC845" class="line" lang="java"><span class="cm">}</span></span>
<span id="LC846" class="line" lang="java"><span class="cm">MethodHandle caToString = publicLookup()</span></span>
<span id="LC847" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "toString", methodType(String.class, char[].class));</span></span>
<span id="LC848" class="line" lang="java"><span class="cm">assertEquals("[A, B, C]", (String) caToString.invokeExact("ABC".toCharArray()));</span></span>
<span id="LC849" class="line" lang="java"><span class="cm">MethodHandle caString3 = caToString.asCollector(char[].class, 3);</span></span>
<span id="LC850" class="line" lang="java"><span class="cm">assertEquals("[A, B, C]", (String) caString3.invokeExact('A', 'B', 'C'));</span></span>
<span id="LC851" class="line" lang="java"><span class="cm">MethodHandle caToString2 = caString3.asSpreader(char[].class, 2);</span></span>
<span id="LC852" class="line" lang="java"><span class="cm">assertEquals("[A, B, C]", (String) caToString2.invokeExact('A', "BC".toCharArray()));</span></span>
<span id="LC853" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC854" class="line" lang="java"><span class="cm">     * @param arrayType usually {@code Object[]}, the type of the array argument from which to extract the spread arguments</span></span>
<span id="LC855" class="line" lang="java"><span class="cm">     * @param arrayLength the number of arguments to spread from an incoming array argument</span></span>
<span id="LC856" class="line" lang="java"><span class="cm">     * @return a new method handle which spreads its final array argument,</span></span>
<span id="LC857" class="line" lang="java"><span class="cm">     *         before calling the original method handle</span></span>
<span id="LC858" class="line" lang="java"><span class="cm">     * @throws NullPointerException if {@code arrayType} is a null reference</span></span>
<span id="LC859" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if {@code arrayType} is not an array type,</span></span>
<span id="LC860" class="line" lang="java"><span class="cm">     *         or if target does not have at least</span></span>
<span id="LC861" class="line" lang="java"><span class="cm">     *         {@code arrayLength} parameter types,</span></span>
<span id="LC862" class="line" lang="java"><span class="cm">     *         or if {@code arrayLength} is negative,</span></span>
<span id="LC863" class="line" lang="java"><span class="cm">     *         or if the resulting method handle's type would have</span></span>
<span id="LC864" class="line" lang="java"><span class="cm">     *         &lt;a href="MethodHandle.html#maxarity"&gt;too many parameters&lt;/a&gt;</span></span>
<span id="LC865" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the implied {@code asType} call fails</span></span>
<span id="LC866" class="line" lang="java"><span class="cm">     * @see #asCollector</span></span>
<span id="LC867" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC868" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodHandle</span> <span class="nf">asSpreader</span><span class="o">(</span><span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span><span class="o">,</span> <span class="kt">int</span> <span class="n">arrayLength</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC869" class="line" lang="java">        <span class="nc">MethodType</span> <span class="n">postSpreadType</span> <span class="o">=</span> <span class="n">asSpreaderChecks</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC870" class="line" lang="java">        <span class="kt">int</span> <span class="n">arity</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">parameterCount</span><span class="o">();</span></span>
<span id="LC871" class="line" lang="java">        <span class="kt">int</span> <span class="n">spreadArgPos</span> <span class="o">=</span> <span class="n">arity</span> <span class="o">-</span> <span class="n">arrayLength</span><span class="o">;</span></span>
<span id="LC872" class="line" lang="java">        <span class="nc">MethodHandle</span> <span class="n">afterSpread</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">asType</span><span class="o">(</span><span class="n">postSpreadType</span><span class="o">);</span></span>
<span id="LC873" class="line" lang="java">        <span class="nc">BoundMethodHandle</span> <span class="n">mh</span> <span class="o">=</span> <span class="n">afterSpread</span><span class="o">.</span><span class="na">rebind</span><span class="o">();</span></span>
<span id="LC874" class="line" lang="java">        <span class="nc">LambdaForm</span> <span class="n">lform</span> <span class="o">=</span> <span class="n">mh</span><span class="o">.</span><span class="na">editor</span><span class="o">().</span><span class="na">spreadArgumentsForm</span><span class="o">(</span><span class="mi">1</span> <span class="o">+</span> <span class="n">spreadArgPos</span><span class="o">,</span> <span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC875" class="line" lang="java">        <span class="nc">MethodType</span> <span class="n">preSpreadType</span> <span class="o">=</span> <span class="n">postSpreadType</span><span class="o">.</span><span class="na">replaceParameterTypes</span><span class="o">(</span><span class="n">spreadArgPos</span><span class="o">,</span> <span class="n">arity</span><span class="o">,</span> <span class="n">arrayType</span><span class="o">);</span></span>
<span id="LC876" class="line" lang="java">        <span class="k">return</span> <span class="n">mh</span><span class="o">.</span><span class="na">copyWith</span><span class="o">(</span><span class="n">preSpreadType</span><span class="o">,</span> <span class="n">lform</span><span class="o">);</span></span>
<span id="LC877" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC878" class="line" lang="java"></span>
<span id="LC879" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC880" class="line" lang="java"><span class="cm">     * See if {@code asSpreader} can be validly called with the given arguments.</span></span>
<span id="LC881" class="line" lang="java"><span class="cm">     * Return the type of the method handle call after spreading but before conversions.</span></span>
<span id="LC882" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC883" class="line" lang="java">    <span class="kd">private</span> <span class="nc">MethodType</span> <span class="nf">asSpreaderChecks</span><span class="o">(</span><span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span><span class="o">,</span> <span class="kt">int</span> <span class="n">arrayLength</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC884" class="line" lang="java">        <span class="n">spreadArrayChecks</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC885" class="line" lang="java">        <span class="kt">int</span> <span class="n">nargs</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">parameterCount</span><span class="o">();</span></span>
<span id="LC886" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">nargs</span> <span class="o">&lt;</span> <span class="n">arrayLength</span> <span class="o">||</span> <span class="n">arrayLength</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">)</span></span>
<span id="LC887" class="line" lang="java">            <span class="k">throw</span> <span class="nf">newIllegalArgumentException</span><span class="o">(</span><span class="s">"bad spread array length"</span><span class="o">);</span></span>
<span id="LC888" class="line" lang="java">        <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayElement</span> <span class="o">=</span> <span class="n">arrayType</span><span class="o">.</span><span class="na">getComponentType</span><span class="o">();</span></span>
<span id="LC889" class="line" lang="java">        <span class="nc">MethodType</span> <span class="n">mtype</span> <span class="o">=</span> <span class="n">type</span><span class="o">();</span></span>
<span id="LC890" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">match</span> <span class="o">=</span> <span class="kc">true</span><span class="o">,</span> <span class="n">fail</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC891" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">nargs</span> <span class="o">-</span> <span class="n">arrayLength</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nargs</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC892" class="line" lang="java">            <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">ptype</span> <span class="o">=</span> <span class="n">mtype</span><span class="o">.</span><span class="na">parameterType</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></span>
<span id="LC893" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">ptype</span> <span class="o">!=</span> <span class="n">arrayElement</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC894" class="line" lang="java">                <span class="n">match</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC895" class="line" lang="java">                <span class="k">if</span> <span class="o">(!</span><span class="nc">MethodType</span><span class="o">.</span><span class="na">canConvert</span><span class="o">(</span><span class="n">arrayElement</span><span class="o">,</span> <span class="n">ptype</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC896" class="line" lang="java">                    <span class="n">fail</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC897" class="line" lang="java">                    <span class="k">break</span><span class="o">;</span></span>
<span id="LC898" class="line" lang="java">                <span class="o">}</span></span>
<span id="LC899" class="line" lang="java">            <span class="o">}</span></span>
<span id="LC900" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC901" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">match</span><span class="o">)</span>  <span class="k">return</span> <span class="n">mtype</span><span class="o">;</span></span>
<span id="LC902" class="line" lang="java">        <span class="nc">MethodType</span> <span class="n">needType</span> <span class="o">=</span> <span class="n">mtype</span><span class="o">.</span><span class="na">asSpreaderType</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC903" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">fail</span><span class="o">)</span>  <span class="k">return</span> <span class="n">needType</span><span class="o">;</span></span>
<span id="LC904" class="line" lang="java">        <span class="c1">// elicit an error:</span></span>
<span id="LC905" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">asType</span><span class="o">(</span><span class="n">needType</span><span class="o">);</span></span>
<span id="LC906" class="line" lang="java">        <span class="k">throw</span> <span class="nf">newInternalError</span><span class="o">(</span><span class="s">"should not return"</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></span>
<span id="LC907" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC908" class="line" lang="java"></span>
<span id="LC909" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">spreadArrayChecks</span><span class="o">(</span><span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span><span class="o">,</span> <span class="kt">int</span> <span class="n">arrayLength</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC910" class="line" lang="java">        <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayElement</span> <span class="o">=</span> <span class="n">arrayType</span><span class="o">.</span><span class="na">getComponentType</span><span class="o">();</span></span>
<span id="LC911" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">arrayElement</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></span>
<span id="LC912" class="line" lang="java">            <span class="k">throw</span> <span class="nf">newIllegalArgumentException</span><span class="o">(</span><span class="s">"not an array type"</span><span class="o">,</span> <span class="n">arrayType</span><span class="o">);</span></span>
<span id="LC913" class="line" lang="java">        <span class="k">if</span> <span class="o">((</span><span class="n">arrayLength</span> <span class="o">&amp;</span> <span class="mh">0x7F</span><span class="o">)</span> <span class="o">!=</span> <span class="n">arrayLength</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC914" class="line" lang="java">            <span class="k">if</span> <span class="o">((</span><span class="n">arrayLength</span> <span class="o">&amp;</span> <span class="mh">0xFF</span><span class="o">)</span> <span class="o">!=</span> <span class="n">arrayLength</span><span class="o">)</span></span>
<span id="LC915" class="line" lang="java">                <span class="k">throw</span> <span class="nf">newIllegalArgumentException</span><span class="o">(</span><span class="s">"array length is not legal"</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC916" class="line" lang="java">            <span class="k">assert</span><span class="o">(</span><span class="n">arrayLength</span> <span class="o">&gt;=</span> <span class="mi">128</span><span class="o">);</span></span>
<span id="LC917" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">arrayElement</span> <span class="o">==</span> <span class="kt">long</span><span class="o">.</span><span class="na">class</span> <span class="o">||</span></span>
<span id="LC918" class="line" lang="java">                <span class="n">arrayElement</span> <span class="o">==</span> <span class="kt">double</span><span class="o">.</span><span class="na">class</span><span class="o">)</span></span>
<span id="LC919" class="line" lang="java">                <span class="k">throw</span> <span class="nf">newIllegalArgumentException</span><span class="o">(</span><span class="s">"array length is not legal for long[] or double[]"</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC920" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC921" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC922" class="line" lang="java"></span>
<span id="LC923" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC924" class="line" lang="java"><span class="cm">     * Makes an &lt;em&gt;array-collecting&lt;/em&gt; method handle, which accepts a given number of trailing</span></span>
<span id="LC925" class="line" lang="java"><span class="cm">     * positional arguments and collects them into an array argument.</span></span>
<span id="LC926" class="line" lang="java"><span class="cm">     * The new method handle adapts, as its &lt;i&gt;target&lt;/i&gt;,</span></span>
<span id="LC927" class="line" lang="java"><span class="cm">     * the current method handle.  The type of the adapter will be</span></span>
<span id="LC928" class="line" lang="java"><span class="cm">     * the same as the type of the target, except that a single trailing</span></span>
<span id="LC929" class="line" lang="java"><span class="cm">     * parameter (usually of type {@code arrayType}) is replaced by</span></span>
<span id="LC930" class="line" lang="java"><span class="cm">     * {@code arrayLength} parameters whose type is element type of {@code arrayType}.</span></span>
<span id="LC931" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC932" class="line" lang="java"><span class="cm">     * If the array type differs from the final argument type on the original target,</span></span>
<span id="LC933" class="line" lang="java"><span class="cm">     * the original target is adapted to take the array type directly,</span></span>
<span id="LC934" class="line" lang="java"><span class="cm">     * as if by a call to {@link #asType asType}.</span></span>
<span id="LC935" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC936" class="line" lang="java"><span class="cm">     * When called, the adapter replaces its trailing {@code arrayLength}</span></span>
<span id="LC937" class="line" lang="java"><span class="cm">     * arguments by a single new array of type {@code arrayType}, whose elements</span></span>
<span id="LC938" class="line" lang="java"><span class="cm">     * comprise (in order) the replaced arguments.</span></span>
<span id="LC939" class="line" lang="java"><span class="cm">     * Finally the target is called.</span></span>
<span id="LC940" class="line" lang="java"><span class="cm">     * What the target eventually returns is returned unchanged by the adapter.</span></span>
<span id="LC941" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC942" class="line" lang="java"><span class="cm">     * (The array may also be a shared constant when {@code arrayLength} is zero.)</span></span>
<span id="LC943" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC944" class="line" lang="java"><span class="cm">     * (&lt;em&gt;Note:&lt;/em&gt; The {@code arrayType} is often identical to the last</span></span>
<span id="LC945" class="line" lang="java"><span class="cm">     * parameter type of the original target.</span></span>
<span id="LC946" class="line" lang="java"><span class="cm">     * It is an explicit argument for symmetry with {@code asSpreader}, and also</span></span>
<span id="LC947" class="line" lang="java"><span class="cm">     * to allow the target to use a simple {@code Object} as its last parameter type.)</span></span>
<span id="LC948" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC949" class="line" lang="java"><span class="cm">     * In order to create a collecting adapter which is not restricted to a particular</span></span>
<span id="LC950" class="line" lang="java"><span class="cm">     * number of collected arguments, use {@link #asVarargsCollector asVarargsCollector} instead.</span></span>
<span id="LC951" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC952" class="line" lang="java"><span class="cm">     * Here are some examples of array-collecting method handles:</span></span>
<span id="LC953" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC954" class="line" lang="java"><span class="cm">MethodHandle deepToString = publicLookup()</span></span>
<span id="LC955" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "deepToString", methodType(String.class, Object[].class));</span></span>
<span id="LC956" class="line" lang="java"><span class="cm">assertEquals("[won]",   (String) deepToString.invokeExact(new Object[]{"won"}));</span></span>
<span id="LC957" class="line" lang="java"><span class="cm">MethodHandle ts1 = deepToString.asCollector(Object[].class, 1);</span></span>
<span id="LC958" class="line" lang="java"><span class="cm">assertEquals(methodType(String.class, Object.class), ts1.type());</span></span>
<span id="LC959" class="line" lang="java"><span class="cm">//assertEquals("[won]", (String) ts1.invokeExact(         new Object[]{"won"})); //FAIL</span></span>
<span id="LC960" class="line" lang="java"><span class="cm">assertEquals("[[won]]", (String) ts1.invokeExact((Object) new Object[]{"won"}));</span></span>
<span id="LC961" class="line" lang="java"><span class="cm">// arrayType can be a subtype of Object[]</span></span>
<span id="LC962" class="line" lang="java"><span class="cm">MethodHandle ts2 = deepToString.asCollector(String[].class, 2);</span></span>
<span id="LC963" class="line" lang="java"><span class="cm">assertEquals(methodType(String.class, String.class, String.class), ts2.type());</span></span>
<span id="LC964" class="line" lang="java"><span class="cm">assertEquals("[two, too]", (String) ts2.invokeExact("two", "too"));</span></span>
<span id="LC965" class="line" lang="java"><span class="cm">MethodHandle ts0 = deepToString.asCollector(Object[].class, 0);</span></span>
<span id="LC966" class="line" lang="java"><span class="cm">assertEquals("[]", (String) ts0.invokeExact());</span></span>
<span id="LC967" class="line" lang="java"><span class="cm">// collectors can be nested, Lisp-style</span></span>
<span id="LC968" class="line" lang="java"><span class="cm">MethodHandle ts22 = deepToString.asCollector(Object[].class, 3).asCollector(String[].class, 2);</span></span>
<span id="LC969" class="line" lang="java"><span class="cm">assertEquals("[A, B, [C, D]]", ((String) ts22.invokeExact((Object)'A', (Object)"B", "C", "D")));</span></span>
<span id="LC970" class="line" lang="java"><span class="cm">// arrayType can be any primitive array type</span></span>
<span id="LC971" class="line" lang="java"><span class="cm">MethodHandle bytesToString = publicLookup()</span></span>
<span id="LC972" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "toString", methodType(String.class, byte[].class))</span></span>
<span id="LC973" class="line" lang="java"><span class="cm">  .asCollector(byte[].class, 3);</span></span>
<span id="LC974" class="line" lang="java"><span class="cm">assertEquals("[1, 2, 3]", (String) bytesToString.invokeExact((byte)1, (byte)2, (byte)3));</span></span>
<span id="LC975" class="line" lang="java"><span class="cm">MethodHandle longsToString = publicLookup()</span></span>
<span id="LC976" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "toString", methodType(String.class, long[].class))</span></span>
<span id="LC977" class="line" lang="java"><span class="cm">  .asCollector(long[].class, 1);</span></span>
<span id="LC978" class="line" lang="java"><span class="cm">assertEquals("[123]", (String) longsToString.invokeExact((long)123));</span></span>
<span id="LC979" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC980" class="line" lang="java"><span class="cm">     * @param arrayType often {@code Object[]}, the type of the array argument which will collect the arguments</span></span>
<span id="LC981" class="line" lang="java"><span class="cm">     * @param arrayLength the number of arguments to collect into a new array argument</span></span>
<span id="LC982" class="line" lang="java"><span class="cm">     * @return a new method handle which collects some trailing argument</span></span>
<span id="LC983" class="line" lang="java"><span class="cm">     *         into an array, before calling the original method handle</span></span>
<span id="LC984" class="line" lang="java"><span class="cm">     * @throws NullPointerException if {@code arrayType} is a null reference</span></span>
<span id="LC985" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if {@code arrayType} is not an array type</span></span>
<span id="LC986" class="line" lang="java"><span class="cm">     *         or {@code arrayType} is not assignable to this method handle's trailing parameter type,</span></span>
<span id="LC987" class="line" lang="java"><span class="cm">     *         or {@code arrayLength} is not a legal array size,</span></span>
<span id="LC988" class="line" lang="java"><span class="cm">     *         or the resulting method handle's type would have</span></span>
<span id="LC989" class="line" lang="java"><span class="cm">     *         &lt;a href="MethodHandle.html#maxarity"&gt;too many parameters&lt;/a&gt;</span></span>
<span id="LC990" class="line" lang="java"><span class="cm">     * @throws WrongMethodTypeException if the implied {@code asType} call fails</span></span>
<span id="LC991" class="line" lang="java"><span class="cm">     * @see #asSpreader</span></span>
<span id="LC992" class="line" lang="java"><span class="cm">     * @see #asVarargsCollector</span></span>
<span id="LC993" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC994" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodHandle</span> <span class="nf">asCollector</span><span class="o">(</span><span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span><span class="o">,</span> <span class="kt">int</span> <span class="n">arrayLength</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC995" class="line" lang="java">        <span class="n">asCollectorChecks</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC996" class="line" lang="java">        <span class="kt">int</span> <span class="n">collectArgPos</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">parameterCount</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">;</span></span>
<span id="LC997" class="line" lang="java">        <span class="nc">BoundMethodHandle</span> <span class="n">mh</span> <span class="o">=</span> <span class="n">rebind</span><span class="o">();</span></span>
<span id="LC998" class="line" lang="java">        <span class="nc">MethodType</span> <span class="n">resultType</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">asCollectorType</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC999" class="line" lang="java">        <span class="nc">MethodHandle</span> <span class="n">newArray</span> <span class="o">=</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">varargsArray</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC1000" class="line" lang="java">        <span class="nc">LambdaForm</span> <span class="n">lform</span> <span class="o">=</span> <span class="n">mh</span><span class="o">.</span><span class="na">editor</span><span class="o">().</span><span class="na">collectArgumentArrayForm</span><span class="o">(</span><span class="mi">1</span> <span class="o">+</span> <span class="n">collectArgPos</span><span class="o">,</span> <span class="n">newArray</span><span class="o">);</span></span>
<span id="LC1001" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">lform</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1002" class="line" lang="java">            <span class="k">return</span> <span class="n">mh</span><span class="o">.</span><span class="na">copyWith</span><span class="o">(</span><span class="n">resultType</span><span class="o">,</span> <span class="n">lform</span><span class="o">);</span></span>
<span id="LC1003" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1004" class="line" lang="java">        <span class="n">lform</span> <span class="o">=</span> <span class="n">mh</span><span class="o">.</span><span class="na">editor</span><span class="o">().</span><span class="na">collectArgumentsForm</span><span class="o">(</span><span class="mi">1</span> <span class="o">+</span> <span class="n">collectArgPos</span><span class="o">,</span> <span class="n">newArray</span><span class="o">.</span><span class="na">type</span><span class="o">().</span><span class="na">basicType</span><span class="o">());</span></span>
<span id="LC1005" class="line" lang="java">        <span class="k">return</span> <span class="n">mh</span><span class="o">.</span><span class="na">copyWithExtendL</span><span class="o">(</span><span class="n">resultType</span><span class="o">,</span> <span class="n">lform</span><span class="o">,</span> <span class="n">newArray</span><span class="o">);</span></span>
<span id="LC1006" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1007" class="line" lang="java"></span>
<span id="LC1008" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1009" class="line" lang="java"><span class="cm">     * See if {@code asCollector} can be validly called with the given arguments.</span></span>
<span id="LC1010" class="line" lang="java"><span class="cm">     * Return false if the last parameter is not an exact match to arrayType.</span></span>
<span id="LC1011" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1012" class="line" lang="java">    <span class="cm">/*non-public*/</span> <span class="kt">boolean</span> <span class="nf">asCollectorChecks</span><span class="o">(</span><span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span><span class="o">,</span> <span class="kt">int</span> <span class="n">arrayLength</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1013" class="line" lang="java">        <span class="n">spreadArrayChecks</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="n">arrayLength</span><span class="o">);</span></span>
<span id="LC1014" class="line" lang="java">        <span class="kt">int</span> <span class="n">nargs</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">parameterCount</span><span class="o">();</span></span>
<span id="LC1015" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">nargs</span> <span class="o">!=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1016" class="line" lang="java">            <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">lastParam</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">parameterType</span><span class="o">(</span><span class="n">nargs</span><span class="o">-</span><span class="mi">1</span><span class="o">);</span></span>
<span id="LC1017" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">lastParam</span> <span class="o">==</span> <span class="n">arrayType</span><span class="o">)</span>  <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1018" class="line" lang="java">            <span class="k">if</span> <span class="o">(</span><span class="n">lastParam</span><span class="o">.</span><span class="na">isAssignableFrom</span><span class="o">(</span><span class="n">arrayType</span><span class="o">))</span>  <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1019" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1020" class="line" lang="java">        <span class="k">throw</span> <span class="nf">newIllegalArgumentException</span><span class="o">(</span><span class="s">"array type not assignable to trailing argument"</span><span class="o">,</span> <span class="k">this</span><span class="o">,</span> <span class="n">arrayType</span><span class="o">);</span></span>
<span id="LC1021" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1022" class="line" lang="java"></span>
<span id="LC1023" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1024" class="line" lang="java"><span class="cm">     * Makes a &lt;em&gt;variable arity&lt;/em&gt; adapter which is able to accept</span></span>
<span id="LC1025" class="line" lang="java"><span class="cm">     * any number of trailing positional arguments and collect them</span></span>
<span id="LC1026" class="line" lang="java"><span class="cm">     * into an array argument.</span></span>
<span id="LC1027" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1028" class="line" lang="java"><span class="cm">     * The type and behavior of the adapter will be the same as</span></span>
<span id="LC1029" class="line" lang="java"><span class="cm">     * the type and behavior of the target, except that certain</span></span>
<span id="LC1030" class="line" lang="java"><span class="cm">     * {@code invoke} and {@code asType} requests can lead to</span></span>
<span id="LC1031" class="line" lang="java"><span class="cm">     * trailing positional arguments being collected into target's</span></span>
<span id="LC1032" class="line" lang="java"><span class="cm">     * trailing parameter.</span></span>
<span id="LC1033" class="line" lang="java"><span class="cm">     * Also, the last parameter type of the adapter will be</span></span>
<span id="LC1034" class="line" lang="java"><span class="cm">     * {@code arrayType}, even if the target has a different</span></span>
<span id="LC1035" class="line" lang="java"><span class="cm">     * last parameter type.</span></span>
<span id="LC1036" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1037" class="line" lang="java"><span class="cm">     * This transformation may return {@code this} if the method handle is</span></span>
<span id="LC1038" class="line" lang="java"><span class="cm">     * already of variable arity and its trailing parameter type</span></span>
<span id="LC1039" class="line" lang="java"><span class="cm">     * is identical to {@code arrayType}.</span></span>
<span id="LC1040" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1041" class="line" lang="java"><span class="cm">     * When called with {@link #invokeExact invokeExact}, the adapter invokes</span></span>
<span id="LC1042" class="line" lang="java"><span class="cm">     * the target with no argument changes.</span></span>
<span id="LC1043" class="line" lang="java"><span class="cm">     * (&lt;em&gt;Note:&lt;/em&gt; This behavior is different from a</span></span>
<span id="LC1044" class="line" lang="java"><span class="cm">     * {@linkplain #asCollector fixed arity collector},</span></span>
<span id="LC1045" class="line" lang="java"><span class="cm">     * since it accepts a whole array of indeterminate length,</span></span>
<span id="LC1046" class="line" lang="java"><span class="cm">     * rather than a fixed number of arguments.)</span></span>
<span id="LC1047" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1048" class="line" lang="java"><span class="cm">     * When called with plain, inexact {@link #invoke invoke}, if the caller</span></span>
<span id="LC1049" class="line" lang="java"><span class="cm">     * type is the same as the adapter, the adapter invokes the target as with</span></span>
<span id="LC1050" class="line" lang="java"><span class="cm">     * {@code invokeExact}.</span></span>
<span id="LC1051" class="line" lang="java"><span class="cm">     * (This is the normal behavior for {@code invoke} when types match.)</span></span>
<span id="LC1052" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1053" class="line" lang="java"><span class="cm">     * Otherwise, if the caller and adapter arity are the same, and the</span></span>
<span id="LC1054" class="line" lang="java"><span class="cm">     * trailing parameter type of the caller is a reference type identical to</span></span>
<span id="LC1055" class="line" lang="java"><span class="cm">     * or assignable to the trailing parameter type of the adapter,</span></span>
<span id="LC1056" class="line" lang="java"><span class="cm">     * the arguments and return values are converted pairwise,</span></span>
<span id="LC1057" class="line" lang="java"><span class="cm">     * as if by {@link #asType asType} on a fixed arity</span></span>
<span id="LC1058" class="line" lang="java"><span class="cm">     * method handle.</span></span>
<span id="LC1059" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1060" class="line" lang="java"><span class="cm">     * Otherwise, the arities differ, or the adapter's trailing parameter</span></span>
<span id="LC1061" class="line" lang="java"><span class="cm">     * type is not assignable from the corresponding caller type.</span></span>
<span id="LC1062" class="line" lang="java"><span class="cm">     * In this case, the adapter replaces all trailing arguments from</span></span>
<span id="LC1063" class="line" lang="java"><span class="cm">     * the original trailing argument position onward, by</span></span>
<span id="LC1064" class="line" lang="java"><span class="cm">     * a new array of type {@code arrayType}, whose elements</span></span>
<span id="LC1065" class="line" lang="java"><span class="cm">     * comprise (in order) the replaced arguments.</span></span>
<span id="LC1066" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1067" class="line" lang="java"><span class="cm">     * The caller type must provides as least enough arguments,</span></span>
<span id="LC1068" class="line" lang="java"><span class="cm">     * and of the correct type, to satisfy the target's requirement for</span></span>
<span id="LC1069" class="line" lang="java"><span class="cm">     * positional arguments before the trailing array argument.</span></span>
<span id="LC1070" class="line" lang="java"><span class="cm">     * Thus, the caller must supply, at a minimum, {@code N-1} arguments,</span></span>
<span id="LC1071" class="line" lang="java"><span class="cm">     * where {@code N} is the arity of the target.</span></span>
<span id="LC1072" class="line" lang="java"><span class="cm">     * Also, there must exist conversions from the incoming arguments</span></span>
<span id="LC1073" class="line" lang="java"><span class="cm">     * to the target's arguments.</span></span>
<span id="LC1074" class="line" lang="java"><span class="cm">     * As with other uses of plain {@code invoke}, if these basic</span></span>
<span id="LC1075" class="line" lang="java"><span class="cm">     * requirements are not fulfilled, a {@code WrongMethodTypeException}</span></span>
<span id="LC1076" class="line" lang="java"><span class="cm">     * may be thrown.</span></span>
<span id="LC1077" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1078" class="line" lang="java"><span class="cm">     * In all cases, what the target eventually returns is returned unchanged by the adapter.</span></span>
<span id="LC1079" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1080" class="line" lang="java"><span class="cm">     * In the final case, it is exactly as if the target method handle were</span></span>
<span id="LC1081" class="line" lang="java"><span class="cm">     * temporarily adapted with a {@linkplain #asCollector fixed arity collector}</span></span>
<span id="LC1082" class="line" lang="java"><span class="cm">     * to the arity required by the caller type.</span></span>
<span id="LC1083" class="line" lang="java"><span class="cm">     * (As with {@code asCollector}, if the array length is zero,</span></span>
<span id="LC1084" class="line" lang="java"><span class="cm">     * a shared constant may be used instead of a new array.</span></span>
<span id="LC1085" class="line" lang="java"><span class="cm">     * If the implied call to {@code asCollector} would throw</span></span>
<span id="LC1086" class="line" lang="java"><span class="cm">     * an {@code IllegalArgumentException} or {@code WrongMethodTypeException},</span></span>
<span id="LC1087" class="line" lang="java"><span class="cm">     * the call to the variable arity adapter must throw</span></span>
<span id="LC1088" class="line" lang="java"><span class="cm">     * {@code WrongMethodTypeException}.)</span></span>
<span id="LC1089" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1090" class="line" lang="java"><span class="cm">     * The behavior of {@link #asType asType} is also specialized for</span></span>
<span id="LC1091" class="line" lang="java"><span class="cm">     * variable arity adapters, to maintain the invariant that</span></span>
<span id="LC1092" class="line" lang="java"><span class="cm">     * plain, inexact {@code invoke} is always equivalent to an {@code asType}</span></span>
<span id="LC1093" class="line" lang="java"><span class="cm">     * call to adjust the target type, followed by {@code invokeExact}.</span></span>
<span id="LC1094" class="line" lang="java"><span class="cm">     * Therefore, a variable arity adapter responds</span></span>
<span id="LC1095" class="line" lang="java"><span class="cm">     * to an {@code asType} request by building a fixed arity collector,</span></span>
<span id="LC1096" class="line" lang="java"><span class="cm">     * if and only if the adapter and requested type differ either</span></span>
<span id="LC1097" class="line" lang="java"><span class="cm">     * in arity or trailing argument type.</span></span>
<span id="LC1098" class="line" lang="java"><span class="cm">     * The resulting fixed arity collector has its type further adjusted</span></span>
<span id="LC1099" class="line" lang="java"><span class="cm">     * (if necessary) to the requested type by pairwise conversion,</span></span>
<span id="LC1100" class="line" lang="java"><span class="cm">     * as if by another application of {@code asType}.</span></span>
<span id="LC1101" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1102" class="line" lang="java"><span class="cm">     * When a method handle is obtained by executing an {@code ldc} instruction</span></span>
<span id="LC1103" class="line" lang="java"><span class="cm">     * of a {@code CONSTANT_MethodHandle} constant, and the target method is marked</span></span>
<span id="LC1104" class="line" lang="java"><span class="cm">     * as a variable arity method (with the modifier bit {@code 0x0080}),</span></span>
<span id="LC1105" class="line" lang="java"><span class="cm">     * the method handle will accept multiple arities, as if the method handle</span></span>
<span id="LC1106" class="line" lang="java"><span class="cm">     * constant were created by means of a call to {@code asVarargsCollector}.</span></span>
<span id="LC1107" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1108" class="line" lang="java"><span class="cm">     * In order to create a collecting adapter which collects a predetermined</span></span>
<span id="LC1109" class="line" lang="java"><span class="cm">     * number of arguments, and whose type reflects this predetermined number,</span></span>
<span id="LC1110" class="line" lang="java"><span class="cm">     * use {@link #asCollector asCollector} instead.</span></span>
<span id="LC1111" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1112" class="line" lang="java"><span class="cm">     * No method handle transformations produce new method handles with</span></span>
<span id="LC1113" class="line" lang="java"><span class="cm">     * variable arity, unless they are documented as doing so.</span></span>
<span id="LC1114" class="line" lang="java"><span class="cm">     * Therefore, besides {@code asVarargsCollector},</span></span>
<span id="LC1115" class="line" lang="java"><span class="cm">     * all methods in {@code MethodHandle} and {@code MethodHandles}</span></span>
<span id="LC1116" class="line" lang="java"><span class="cm">     * will return a method handle with fixed arity,</span></span>
<span id="LC1117" class="line" lang="java"><span class="cm">     * except in the cases where they are specified to return their original</span></span>
<span id="LC1118" class="line" lang="java"><span class="cm">     * operand (e.g., {@code asType} of the method handle's own type).</span></span>
<span id="LC1119" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1120" class="line" lang="java"><span class="cm">     * Calling {@code asVarargsCollector} on a method handle which is already</span></span>
<span id="LC1121" class="line" lang="java"><span class="cm">     * of variable arity will produce a method handle with the same type and behavior.</span></span>
<span id="LC1122" class="line" lang="java"><span class="cm">     * It may (or may not) return the original variable arity method handle.</span></span>
<span id="LC1123" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1124" class="line" lang="java"><span class="cm">     * Here is an example, of a list-making variable arity method handle:</span></span>
<span id="LC1125" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC1126" class="line" lang="java"><span class="cm">MethodHandle deepToString = publicLookup()</span></span>
<span id="LC1127" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "deepToString", methodType(String.class, Object[].class));</span></span>
<span id="LC1128" class="line" lang="java"><span class="cm">MethodHandle ts1 = deepToString.asVarargsCollector(Object[].class);</span></span>
<span id="LC1129" class="line" lang="java"><span class="cm">assertEquals("[won]",   (String) ts1.invokeExact(    new Object[]{"won"}));</span></span>
<span id="LC1130" class="line" lang="java"><span class="cm">assertEquals("[won]",   (String) ts1.invoke(         new Object[]{"won"}));</span></span>
<span id="LC1131" class="line" lang="java"><span class="cm">assertEquals("[won]",   (String) ts1.invoke(                      "won" ));</span></span>
<span id="LC1132" class="line" lang="java"><span class="cm">assertEquals("[[won]]", (String) ts1.invoke((Object) new Object[]{"won"}));</span></span>
<span id="LC1133" class="line" lang="java"><span class="cm">// findStatic of Arrays.asList(...) produces a variable arity method handle:</span></span>
<span id="LC1134" class="line" lang="java"><span class="cm">MethodHandle asList = publicLookup()</span></span>
<span id="LC1135" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "asList", methodType(List.class, Object[].class));</span></span>
<span id="LC1136" class="line" lang="java"><span class="cm">assertEquals(methodType(List.class, Object[].class), asList.type());</span></span>
<span id="LC1137" class="line" lang="java"><span class="cm">assert(asList.isVarargsCollector());</span></span>
<span id="LC1138" class="line" lang="java"><span class="cm">assertEquals("[]", asList.invoke().toString());</span></span>
<span id="LC1139" class="line" lang="java"><span class="cm">assertEquals("[1]", asList.invoke(1).toString());</span></span>
<span id="LC1140" class="line" lang="java"><span class="cm">assertEquals("[two, too]", asList.invoke("two", "too").toString());</span></span>
<span id="LC1141" class="line" lang="java"><span class="cm">String[] argv = { "three", "thee", "tee" };</span></span>
<span id="LC1142" class="line" lang="java"><span class="cm">assertEquals("[three, thee, tee]", asList.invoke(argv).toString());</span></span>
<span id="LC1143" class="line" lang="java"><span class="cm">assertEquals("[three, thee, tee]", asList.invoke((Object[])argv).toString());</span></span>
<span id="LC1144" class="line" lang="java"><span class="cm">List ls = (List) asList.invoke((Object)argv);</span></span>
<span id="LC1145" class="line" lang="java"><span class="cm">assertEquals(1, ls.size());</span></span>
<span id="LC1146" class="line" lang="java"><span class="cm">assertEquals("[three, thee, tee]", Arrays.toString((Object[])ls.get(0)));</span></span>
<span id="LC1147" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC1148" class="line" lang="java"><span class="cm">     * &lt;p style="font-size:smaller;"&gt;</span></span>
<span id="LC1149" class="line" lang="java"><span class="cm">     * &lt;em&gt;Discussion:&lt;/em&gt;</span></span>
<span id="LC1150" class="line" lang="java"><span class="cm">     * These rules are designed as a dynamically-typed variation</span></span>
<span id="LC1151" class="line" lang="java"><span class="cm">     * of the Java rules for variable arity methods.</span></span>
<span id="LC1152" class="line" lang="java"><span class="cm">     * In both cases, callers to a variable arity method or method handle</span></span>
<span id="LC1153" class="line" lang="java"><span class="cm">     * can either pass zero or more positional arguments, or else pass</span></span>
<span id="LC1154" class="line" lang="java"><span class="cm">     * pre-collected arrays of any length.  Users should be aware of the</span></span>
<span id="LC1155" class="line" lang="java"><span class="cm">     * special role of the final argument, and of the effect of a</span></span>
<span id="LC1156" class="line" lang="java"><span class="cm">     * type match on that final argument, which determines whether</span></span>
<span id="LC1157" class="line" lang="java"><span class="cm">     * or not a single trailing argument is interpreted as a whole</span></span>
<span id="LC1158" class="line" lang="java"><span class="cm">     * array or a single element of an array to be collected.</span></span>
<span id="LC1159" class="line" lang="java"><span class="cm">     * Note that the dynamic type of the trailing argument has no</span></span>
<span id="LC1160" class="line" lang="java"><span class="cm">     * effect on this decision, only a comparison between the symbolic</span></span>
<span id="LC1161" class="line" lang="java"><span class="cm">     * type descriptor of the call site and the type descriptor of the method handle.)</span></span>
<span id="LC1162" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1163" class="line" lang="java"><span class="cm">     * @param arrayType often {@code Object[]}, the type of the array argument which will collect the arguments</span></span>
<span id="LC1164" class="line" lang="java"><span class="cm">     * @return a new method handle which can collect any number of trailing arguments</span></span>
<span id="LC1165" class="line" lang="java"><span class="cm">     *         into an array, before calling the original method handle</span></span>
<span id="LC1166" class="line" lang="java"><span class="cm">     * @throws NullPointerException if {@code arrayType} is a null reference</span></span>
<span id="LC1167" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if {@code arrayType} is not an array type</span></span>
<span id="LC1168" class="line" lang="java"><span class="cm">     *         or {@code arrayType} is not assignable to this method handle's trailing parameter type</span></span>
<span id="LC1169" class="line" lang="java"><span class="cm">     * @see #asCollector</span></span>
<span id="LC1170" class="line" lang="java"><span class="cm">     * @see #isVarargsCollector</span></span>
<span id="LC1171" class="line" lang="java"><span class="cm">     * @see #asFixedArity</span></span>
<span id="LC1172" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1173" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodHandle</span> <span class="nf">asVarargsCollector</span><span class="o">(</span><span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1174" class="line" lang="java">        <span class="n">arrayType</span><span class="o">.</span><span class="na">getClass</span><span class="o">();</span> <span class="c1">// explicit NPE</span></span>
<span id="LC1175" class="line" lang="java">        <span class="kt">boolean</span> <span class="n">lastMatch</span> <span class="o">=</span> <span class="n">asCollectorChecks</span><span class="o">(</span><span class="n">arrayType</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></span>
<span id="LC1176" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">isVarargsCollector</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">lastMatch</span><span class="o">)</span></span>
<span id="LC1177" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC1178" class="line" lang="java">        <span class="k">return</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">makeVarargsCollector</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">arrayType</span><span class="o">);</span></span>
<span id="LC1179" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1180" class="line" lang="java"></span>
<span id="LC1181" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1182" class="line" lang="java"><span class="cm">     * Determines if this method handle</span></span>
<span id="LC1183" class="line" lang="java"><span class="cm">     * supports {@linkplain #asVarargsCollector variable arity} calls.</span></span>
<span id="LC1184" class="line" lang="java"><span class="cm">     * Such method handles arise from the following sources:</span></span>
<span id="LC1185" class="line" lang="java"><span class="cm">     * &lt;ul&gt;</span></span>
<span id="LC1186" class="line" lang="java"><span class="cm">     * &lt;li&gt;a call to {@linkplain #asVarargsCollector asVarargsCollector}</span></span>
<span id="LC1187" class="line" lang="java"><span class="cm">     * &lt;li&gt;a call to a {@linkplain java.lang.invoke.MethodHandles.Lookup lookup method}</span></span>
<span id="LC1188" class="line" lang="java"><span class="cm">     *     which resolves to a variable arity Java method or constructor</span></span>
<span id="LC1189" class="line" lang="java"><span class="cm">     * &lt;li&gt;an {@code ldc} instruction of a {@code CONSTANT_MethodHandle}</span></span>
<span id="LC1190" class="line" lang="java"><span class="cm">     *     which resolves to a variable arity Java method or constructor</span></span>
<span id="LC1191" class="line" lang="java"><span class="cm">     * &lt;/ul&gt;</span></span>
<span id="LC1192" class="line" lang="java"><span class="cm">     * @return true if this method handle accepts more than one arity of plain, inexact {@code invoke} calls</span></span>
<span id="LC1193" class="line" lang="java"><span class="cm">     * @see #asVarargsCollector</span></span>
<span id="LC1194" class="line" lang="java"><span class="cm">     * @see #asFixedArity</span></span>
<span id="LC1195" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1196" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isVarargsCollector</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1197" class="line" lang="java">        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC1198" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1199" class="line" lang="java"></span>
<span id="LC1200" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1201" class="line" lang="java"><span class="cm">     * Makes a &lt;em&gt;fixed arity&lt;/em&gt; method handle which is otherwise</span></span>
<span id="LC1202" class="line" lang="java"><span class="cm">     * equivalent to the current method handle.</span></span>
<span id="LC1203" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1204" class="line" lang="java"><span class="cm">     * If the current method handle is not of</span></span>
<span id="LC1205" class="line" lang="java"><span class="cm">     * {@linkplain #asVarargsCollector variable arity},</span></span>
<span id="LC1206" class="line" lang="java"><span class="cm">     * the current method handle is returned.</span></span>
<span id="LC1207" class="line" lang="java"><span class="cm">     * This is true even if the current method handle</span></span>
<span id="LC1208" class="line" lang="java"><span class="cm">     * could not be a valid input to {@code asVarargsCollector}.</span></span>
<span id="LC1209" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1210" class="line" lang="java"><span class="cm">     * Otherwise, the resulting fixed-arity method handle has the same</span></span>
<span id="LC1211" class="line" lang="java"><span class="cm">     * type and behavior of the current method handle,</span></span>
<span id="LC1212" class="line" lang="java"><span class="cm">     * except that {@link #isVarargsCollector isVarargsCollector}</span></span>
<span id="LC1213" class="line" lang="java"><span class="cm">     * will be false.</span></span>
<span id="LC1214" class="line" lang="java"><span class="cm">     * The fixed-arity method handle may (or may not) be the</span></span>
<span id="LC1215" class="line" lang="java"><span class="cm">     * a previous argument to {@code asVarargsCollector}.</span></span>
<span id="LC1216" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1217" class="line" lang="java"><span class="cm">     * Here is an example, of a list-making variable arity method handle:</span></span>
<span id="LC1218" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC1219" class="line" lang="java"><span class="cm">MethodHandle asListVar = publicLookup()</span></span>
<span id="LC1220" class="line" lang="java"><span class="cm">  .findStatic(Arrays.class, "asList", methodType(List.class, Object[].class))</span></span>
<span id="LC1221" class="line" lang="java"><span class="cm">  .asVarargsCollector(Object[].class);</span></span>
<span id="LC1222" class="line" lang="java"><span class="cm">MethodHandle asListFix = asListVar.asFixedArity();</span></span>
<span id="LC1223" class="line" lang="java"><span class="cm">assertEquals("[1]", asListVar.invoke(1).toString());</span></span>
<span id="LC1224" class="line" lang="java"><span class="cm">Exception caught = null;</span></span>
<span id="LC1225" class="line" lang="java"><span class="cm">try { asListFix.invoke((Object)1); }</span></span>
<span id="LC1226" class="line" lang="java"><span class="cm">catch (Exception ex) { caught = ex; }</span></span>
<span id="LC1227" class="line" lang="java"><span class="cm">assert(caught instanceof ClassCastException);</span></span>
<span id="LC1228" class="line" lang="java"><span class="cm">assertEquals("[two, too]", asListVar.invoke("two", "too").toString());</span></span>
<span id="LC1229" class="line" lang="java"><span class="cm">try { asListFix.invoke("two", "too"); }</span></span>
<span id="LC1230" class="line" lang="java"><span class="cm">catch (Exception ex) { caught = ex; }</span></span>
<span id="LC1231" class="line" lang="java"><span class="cm">assert(caught instanceof WrongMethodTypeException);</span></span>
<span id="LC1232" class="line" lang="java"><span class="cm">Object[] argv = { "three", "thee", "tee" };</span></span>
<span id="LC1233" class="line" lang="java"><span class="cm">assertEquals("[three, thee, tee]", asListVar.invoke(argv).toString());</span></span>
<span id="LC1234" class="line" lang="java"><span class="cm">assertEquals("[three, thee, tee]", asListFix.invoke(argv).toString());</span></span>
<span id="LC1235" class="line" lang="java"><span class="cm">assertEquals(1, ((List) asListVar.invoke((Object)argv)).size());</span></span>
<span id="LC1236" class="line" lang="java"><span class="cm">assertEquals("[three, thee, tee]", asListFix.invoke((Object)argv).toString());</span></span>
<span id="LC1237" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC1238" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1239" class="line" lang="java"><span class="cm">     * @return a new method handle which accepts only a fixed number of arguments</span></span>
<span id="LC1240" class="line" lang="java"><span class="cm">     * @see #asVarargsCollector</span></span>
<span id="LC1241" class="line" lang="java"><span class="cm">     * @see #isVarargsCollector</span></span>
<span id="LC1242" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1243" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodHandle</span> <span class="nf">asFixedArity</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1244" class="line" lang="java">        <span class="k">assert</span><span class="o">(!</span><span class="n">isVarargsCollector</span><span class="o">());</span></span>
<span id="LC1245" class="line" lang="java">        <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC1246" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1247" class="line" lang="java"></span>
<span id="LC1248" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1249" class="line" lang="java"><span class="cm">     * Binds a value {@code x} to the first argument of a method handle, without invoking it.</span></span>
<span id="LC1250" class="line" lang="java"><span class="cm">     * The new method handle adapts, as its &lt;i&gt;target&lt;/i&gt;,</span></span>
<span id="LC1251" class="line" lang="java"><span class="cm">     * the current method handle by binding it to the given argument.</span></span>
<span id="LC1252" class="line" lang="java"><span class="cm">     * The type of the bound handle will be</span></span>
<span id="LC1253" class="line" lang="java"><span class="cm">     * the same as the type of the target, except that a single leading</span></span>
<span id="LC1254" class="line" lang="java"><span class="cm">     * reference parameter will be omitted.</span></span>
<span id="LC1255" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1256" class="line" lang="java"><span class="cm">     * When called, the bound handle inserts the given value {@code x}</span></span>
<span id="LC1257" class="line" lang="java"><span class="cm">     * as a new leading argument to the target.  The other arguments are</span></span>
<span id="LC1258" class="line" lang="java"><span class="cm">     * also passed unchanged.</span></span>
<span id="LC1259" class="line" lang="java"><span class="cm">     * What the target eventually returns is returned unchanged by the bound handle.</span></span>
<span id="LC1260" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1261" class="line" lang="java"><span class="cm">     * The reference {@code x} must be convertible to the first parameter</span></span>
<span id="LC1262" class="line" lang="java"><span class="cm">     * type of the target.</span></span>
<span id="LC1263" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1264" class="line" lang="java"><span class="cm">     * (&lt;em&gt;Note:&lt;/em&gt;  Because method handles are immutable, the target method handle</span></span>
<span id="LC1265" class="line" lang="java"><span class="cm">     * retains its original type and behavior.)</span></span>
<span id="LC1266" class="line" lang="java"><span class="cm">     * @param x  the value to bind to the first argument of the target</span></span>
<span id="LC1267" class="line" lang="java"><span class="cm">     * @return a new method handle which prepends the given value to the incoming</span></span>
<span id="LC1268" class="line" lang="java"><span class="cm">     *         argument list, before calling the original method handle</span></span>
<span id="LC1269" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if the target does not have a</span></span>
<span id="LC1270" class="line" lang="java"><span class="cm">     *         leading parameter type that is a reference type</span></span>
<span id="LC1271" class="line" lang="java"><span class="cm">     * @throws ClassCastException if {@code x} cannot be converted</span></span>
<span id="LC1272" class="line" lang="java"><span class="cm">     *         to the leading parameter type of the target</span></span>
<span id="LC1273" class="line" lang="java"><span class="cm">     * @see MethodHandles#insertArguments</span></span>
<span id="LC1274" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1275" class="line" lang="java">    <span class="kd">public</span> <span class="nc">MethodHandle</span> <span class="nf">bindTo</span><span class="o">(</span><span class="nc">Object</span> <span class="n">x</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1276" class="line" lang="java">        <span class="n">x</span> <span class="o">=</span> <span class="n">type</span><span class="o">.</span><span class="na">leadingReferenceParameter</span><span class="o">().</span><span class="na">cast</span><span class="o">(</span><span class="n">x</span><span class="o">);</span>  <span class="c1">// throw CCE if needed</span></span>
<span id="LC1277" class="line" lang="java">        <span class="k">return</span> <span class="nf">bindArgumentL</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">x</span><span class="o">);</span></span>
<span id="LC1278" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1279" class="line" lang="java"></span>
<span id="LC1280" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1281" class="line" lang="java"><span class="cm">     * Returns a string representation of the method handle,</span></span>
<span id="LC1282" class="line" lang="java"><span class="cm">     * starting with the string {@code "MethodHandle"} and</span></span>
<span id="LC1283" class="line" lang="java"><span class="cm">     * ending with the string representation of the method handle's type.</span></span>
<span id="LC1284" class="line" lang="java"><span class="cm">     * In other words, this method returns a string equal to the value of:</span></span>
<span id="LC1285" class="line" lang="java"><span class="cm">     * &lt;blockquote&gt;&lt;pre&gt;{@code</span></span>
<span id="LC1286" class="line" lang="java"><span class="cm">     * "MethodHandle" + type().toString()</span></span>
<span id="LC1287" class="line" lang="java"><span class="cm">     * }&lt;/pre&gt;&lt;/blockquote&gt;</span></span>
<span id="LC1288" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC1289" class="line" lang="java"><span class="cm">     * (&lt;em&gt;Note:&lt;/em&gt;  Future releases of this API may add further information</span></span>
<span id="LC1290" class="line" lang="java"><span class="cm">     * to the string representation.</span></span>
<span id="LC1291" class="line" lang="java"><span class="cm">     * Therefore, the present syntax should not be parsed by applications.)</span></span>
<span id="LC1292" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC1293" class="line" lang="java"><span class="cm">     * @return a string representation of the method handle</span></span>
<span id="LC1294" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1295" class="line" lang="java">    <span class="nd">@Override</span></span>
<span id="LC1296" class="line" lang="java">    <span class="kd">public</span> <span class="nc">String</span> <span class="nf">toString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1297" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="no">DEBUG_METHOD_HANDLE_NAMES</span><span class="o">)</span>  <span class="k">return</span> <span class="s">"MethodHandle"</span><span class="o">+</span><span class="n">debugString</span><span class="o">();</span></span>
<span id="LC1298" class="line" lang="java">        <span class="k">return</span> <span class="nf">standardString</span><span class="o">();</span></span>
<span id="LC1299" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1300" class="line" lang="java">    <span class="nc">String</span> <span class="nf">standardString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1301" class="line" lang="java">        <span class="k">return</span> <span class="s">"MethodHandle"</span><span class="o">+</span><span class="n">type</span><span class="o">;</span></span>
<span id="LC1302" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1303" class="line" lang="java">    <span class="cm">/** Return a string with a several lines describing the method handle structure.</span></span>
<span id="LC1304" class="line" lang="java"><span class="cm">     *  This string would be suitable for display in an IDE debugger.</span></span>
<span id="LC1305" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1306" class="line" lang="java">    <span class="nc">String</span> <span class="nf">debugString</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1307" class="line" lang="java">        <span class="k">return</span> <span class="n">type</span><span class="o">+</span><span class="s">" : "</span><span class="o">+</span><span class="n">internalForm</span><span class="o">()+</span><span class="n">internalProperties</span><span class="o">();</span></span>
<span id="LC1308" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1309" class="line" lang="java"></span>
<span id="LC1310" class="line" lang="java">    <span class="c1">//// Implementation methods.</span></span>
<span id="LC1311" class="line" lang="java">    <span class="c1">//// Sub-classes can override these default implementations.</span></span>
<span id="LC1312" class="line" lang="java">    <span class="c1">//// All these methods assume arguments are already validated.</span></span>
<span id="LC1313" class="line" lang="java"></span>
<span id="LC1314" class="line" lang="java">    <span class="c1">// Other transforms to do:  convert, explicitCast, permute, drop, filter, fold, GWT, catch</span></span>
<span id="LC1315" class="line" lang="java"></span>
<span id="LC1316" class="line" lang="java">    <span class="nc">BoundMethodHandle</span> <span class="nf">bindArgumentL</span><span class="o">(</span><span class="kt">int</span> <span class="n">pos</span><span class="o">,</span> <span class="nc">Object</span> <span class="n">value</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1317" class="line" lang="java">        <span class="k">return</span> <span class="nf">rebind</span><span class="o">().</span><span class="na">bindArgumentL</span><span class="o">(</span><span class="n">pos</span><span class="o">,</span> <span class="n">value</span><span class="o">);</span></span>
<span id="LC1318" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1319" class="line" lang="java"></span>
<span id="LC1320" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1321" class="line" lang="java">    <span class="nc">MethodHandle</span> <span class="nf">setVarargs</span><span class="o">(</span><span class="nc">MemberName</span> <span class="n">member</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">IllegalAccessException</span> <span class="o">{</span></span>
<span id="LC1322" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">member</span><span class="o">.</span><span class="na">isVarargs</span><span class="o">())</span>  <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC1323" class="line" lang="java">        <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">arrayType</span> <span class="o">=</span> <span class="n">type</span><span class="o">().</span><span class="na">lastParameterType</span><span class="o">();</span></span>
<span id="LC1324" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">arrayType</span><span class="o">.</span><span class="na">isArray</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC1325" class="line" lang="java">            <span class="k">return</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">makeVarargsCollector</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">arrayType</span><span class="o">);</span></span>
<span id="LC1326" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1327" class="line" lang="java">        <span class="k">throw</span> <span class="n">member</span><span class="o">.</span><span class="na">makeAccessException</span><span class="o">(</span><span class="s">"cannot make variable arity"</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></span>
<span id="LC1328" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1329" class="line" lang="java"></span>
<span id="LC1330" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1331" class="line" lang="java">    <span class="nc">MethodHandle</span> <span class="nf">viewAsType</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">newType</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">strict</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1332" class="line" lang="java">        <span class="c1">// No actual conversions, just a new view of the same method.</span></span>
<span id="LC1333" class="line" lang="java">        <span class="c1">// Note that this operation must not produce a DirectMethodHandle,</span></span>
<span id="LC1334" class="line" lang="java">        <span class="c1">// because retyped DMHs, like any transformed MHs,</span></span>
<span id="LC1335" class="line" lang="java">        <span class="c1">// cannot be cracked into MethodHandleInfo.</span></span>
<span id="LC1336" class="line" lang="java">        <span class="k">assert</span> <span class="nf">viewAsTypeChecks</span><span class="o">(</span><span class="n">newType</span><span class="o">,</span> <span class="n">strict</span><span class="o">);</span></span>
<span id="LC1337" class="line" lang="java">        <span class="nc">BoundMethodHandle</span> <span class="n">mh</span> <span class="o">=</span> <span class="n">rebind</span><span class="o">();</span></span>
<span id="LC1338" class="line" lang="java">        <span class="k">assert</span><span class="o">(!((</span><span class="nc">MethodHandle</span><span class="o">)</span><span class="n">mh</span> <span class="k">instanceof</span> <span class="nc">DirectMethodHandle</span><span class="o">));</span></span>
<span id="LC1339" class="line" lang="java">        <span class="k">return</span> <span class="n">mh</span><span class="o">.</span><span class="na">copyWith</span><span class="o">(</span><span class="n">newType</span><span class="o">,</span> <span class="n">mh</span><span class="o">.</span><span class="na">form</span><span class="o">);</span></span>
<span id="LC1340" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1341" class="line" lang="java"></span>
<span id="LC1342" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1343" class="line" lang="java">    <span class="kt">boolean</span> <span class="nf">viewAsTypeChecks</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">newType</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">strict</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1344" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">strict</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1345" class="line" lang="java">            <span class="k">assert</span><span class="o">(</span><span class="n">type</span><span class="o">().</span><span class="na">isViewableAs</span><span class="o">(</span><span class="n">newType</span><span class="o">,</span> <span class="kc">true</span><span class="o">))</span></span>
<span id="LC1346" class="line" lang="java">                <span class="o">:</span> <span class="nc">Arrays</span><span class="o">.</span><span class="na">asList</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">newType</span><span class="o">);</span></span>
<span id="LC1347" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1348" class="line" lang="java">            <span class="k">assert</span><span class="o">(</span><span class="n">type</span><span class="o">().</span><span class="na">basicType</span><span class="o">().</span><span class="na">isViewableAs</span><span class="o">(</span><span class="n">newType</span><span class="o">.</span><span class="na">basicType</span><span class="o">(),</span> <span class="kc">true</span><span class="o">))</span></span>
<span id="LC1349" class="line" lang="java">                <span class="o">:</span> <span class="nc">Arrays</span><span class="o">.</span><span class="na">asList</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">newType</span><span class="o">);</span></span>
<span id="LC1350" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1351" class="line" lang="java">        <span class="k">return</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC1352" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1353" class="line" lang="java"></span>
<span id="LC1354" class="line" lang="java">    <span class="c1">// Decoding</span></span>
<span id="LC1355" class="line" lang="java"></span>
<span id="LC1356" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1357" class="line" lang="java">    <span class="nc">LambdaForm</span> <span class="nf">internalForm</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1358" class="line" lang="java">        <span class="k">return</span> <span class="n">form</span><span class="o">;</span></span>
<span id="LC1359" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1360" class="line" lang="java"></span>
<span id="LC1361" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1362" class="line" lang="java">    <span class="nc">MemberName</span> <span class="nf">internalMemberName</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1363" class="line" lang="java">        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span>  <span class="c1">// DMH returns DMH.member</span></span>
<span id="LC1364" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1365" class="line" lang="java"></span>
<span id="LC1366" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1367" class="line" lang="java">    <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">internalCallerClass</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1368" class="line" lang="java">        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span>  <span class="c1">// caller-bound MH for @CallerSensitive method returns caller</span></span>
<span id="LC1369" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1370" class="line" lang="java"></span>
<span id="LC1371" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1372" class="line" lang="java">    <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">Intrinsic</span> <span class="nf">intrinsicName</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1373" class="line" lang="java">        <span class="c1">// no special intrinsic meaning to most MHs</span></span>
<span id="LC1374" class="line" lang="java">        <span class="k">return</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">Intrinsic</span><span class="o">.</span><span class="na">NONE</span><span class="o">;</span></span>
<span id="LC1375" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1376" class="line" lang="java"></span>
<span id="LC1377" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1378" class="line" lang="java">    <span class="nc">MethodHandle</span> <span class="nf">withInternalMemberName</span><span class="o">(</span><span class="nc">MemberName</span> <span class="n">member</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">isInvokeSpecial</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1379" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">member</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1380" class="line" lang="java">            <span class="k">return</span> <span class="nc">MethodHandleImpl</span><span class="o">.</span><span class="na">makeWrappedMember</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="n">member</span><span class="o">,</span> <span class="n">isInvokeSpecial</span><span class="o">);</span></span>
<span id="LC1381" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">internalMemberName</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1382" class="line" lang="java">            <span class="c1">// The required internaMemberName is null, and this MH (like most) doesn't have one.</span></span>
<span id="LC1383" class="line" lang="java">            <span class="k">return</span> <span class="k">this</span><span class="o">;</span></span>
<span id="LC1384" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1385" class="line" lang="java">            <span class="c1">// The following case is rare. Mask the internalMemberName by wrapping the MH in a BMH.</span></span>
<span id="LC1386" class="line" lang="java">            <span class="nc">MethodHandle</span> <span class="n">result</span> <span class="o">=</span> <span class="n">rebind</span><span class="o">();</span></span>
<span id="LC1387" class="line" lang="java">            <span class="k">assert</span> <span class="o">(</span><span class="n">result</span><span class="o">.</span><span class="na">internalMemberName</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">);</span></span>
<span id="LC1388" class="line" lang="java">            <span class="k">return</span> <span class="n">result</span><span class="o">;</span></span>
<span id="LC1389" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1390" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1391" class="line" lang="java"></span>
<span id="LC1392" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1393" class="line" lang="java">    <span class="kt">boolean</span> <span class="nf">isInvokeSpecial</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1394" class="line" lang="java">        <span class="k">return</span> <span class="kc">false</span><span class="o">;</span>  <span class="c1">// DMH.Special returns true</span></span>
<span id="LC1395" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1396" class="line" lang="java"></span>
<span id="LC1397" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1398" class="line" lang="java">    <span class="nc">Object</span> <span class="nf">internalValues</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1399" class="line" lang="java">        <span class="k">return</span> <span class="kc">null</span><span class="o">;</span></span>
<span id="LC1400" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1401" class="line" lang="java"></span>
<span id="LC1402" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1403" class="line" lang="java">    <span class="nc">Object</span> <span class="nf">internalProperties</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1404" class="line" lang="java">        <span class="c1">// Override to something to follow this.form, like "\n&amp; FOO=bar"</span></span>
<span id="LC1405" class="line" lang="java">        <span class="k">return</span> <span class="s">""</span><span class="o">;</span></span>
<span id="LC1406" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1407" class="line" lang="java"></span>
<span id="LC1408" class="line" lang="java">    <span class="c1">//// Method handle implementation methods.</span></span>
<span id="LC1409" class="line" lang="java">    <span class="c1">//// Sub-classes can override these default implementations.</span></span>
<span id="LC1410" class="line" lang="java">    <span class="c1">//// All these methods assume arguments are already validated.</span></span>
<span id="LC1411" class="line" lang="java"></span>
<span id="LC1412" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1413" class="line" lang="java">    <span class="kd">abstract</span> <span class="nc">MethodHandle</span> <span class="nf">copyWith</span><span class="o">(</span><span class="nc">MethodType</span> <span class="n">mt</span><span class="o">,</span> <span class="nc">LambdaForm</span> <span class="n">lf</span><span class="o">);</span></span>
<span id="LC1414" class="line" lang="java"></span>
<span id="LC1415" class="line" lang="java">    <span class="cm">/** Require this method handle to be a BMH, or else replace it with a "wrapper" BMH.</span></span>
<span id="LC1416" class="line" lang="java"><span class="cm">     *  Many transforms are implemented only for BMHs.</span></span>
<span id="LC1417" class="line" lang="java"><span class="cm">     *  @return a behaviorally equivalent BMH</span></span>
<span id="LC1418" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1419" class="line" lang="java">    <span class="kd">abstract</span> <span class="nc">BoundMethodHandle</span> <span class="nf">rebind</span><span class="o">();</span></span>
<span id="LC1420" class="line" lang="java"></span>
<span id="LC1421" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC1422" class="line" lang="java"><span class="cm">     * Replace the old lambda form of this method handle with a new one.</span></span>
<span id="LC1423" class="line" lang="java"><span class="cm">     * The new one must be functionally equivalent to the old one.</span></span>
<span id="LC1424" class="line" lang="java"><span class="cm">     * Threads may continue running the old form indefinitely,</span></span>
<span id="LC1425" class="line" lang="java"><span class="cm">     * but it is likely that the new one will be preferred for new executions.</span></span>
<span id="LC1426" class="line" lang="java"><span class="cm">     * Use with discretion.</span></span>
<span id="LC1427" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC1428" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1429" class="line" lang="java">    <span class="kt">void</span> <span class="nf">updateForm</span><span class="o">(</span><span class="nc">LambdaForm</span> <span class="n">newForm</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1430" class="line" lang="java">        <span class="k">assert</span><span class="o">(</span><span class="n">newForm</span><span class="o">.</span><span class="na">customized</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">newForm</span><span class="o">.</span><span class="na">customized</span> <span class="o">==</span> <span class="k">this</span><span class="o">);</span></span>
<span id="LC1431" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">form</span> <span class="o">==</span> <span class="n">newForm</span><span class="o">)</span>  <span class="k">return</span><span class="o">;</span></span>
<span id="LC1432" class="line" lang="java">        <span class="n">newForm</span><span class="o">.</span><span class="na">prepare</span><span class="o">();</span>  <span class="c1">// as in MethodHandle.&lt;init&gt;</span></span>
<span id="LC1433" class="line" lang="java">        <span class="no">UNSAFE</span><span class="o">.</span><span class="na">putObject</span><span class="o">(</span><span class="k">this</span><span class="o">,</span> <span class="no">FORM_OFFSET</span><span class="o">,</span> <span class="n">newForm</span><span class="o">);</span></span>
<span id="LC1434" class="line" lang="java">        <span class="no">UNSAFE</span><span class="o">.</span><span class="na">fullFence</span><span class="o">();</span></span>
<span id="LC1435" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1436" class="line" lang="java"></span>
<span id="LC1437" class="line" lang="java">    <span class="cm">/** Craft a LambdaForm customized for this particular MethodHandle */</span></span>
<span id="LC1438" class="line" lang="java">    <span class="cm">/*non-public*/</span></span>
<span id="LC1439" class="line" lang="java">    <span class="kt">void</span> <span class="nf">customize</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC1440" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">form</span><span class="o">.</span><span class="na">customized</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1441" class="line" lang="java">            <span class="nc">LambdaForm</span> <span class="n">newForm</span> <span class="o">=</span> <span class="n">form</span><span class="o">.</span><span class="na">customize</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></span>
<span id="LC1442" class="line" lang="java">            <span class="n">updateForm</span><span class="o">(</span><span class="n">newForm</span><span class="o">);</span></span>
<span id="LC1443" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC1444" class="line" lang="java">            <span class="k">assert</span><span class="o">(</span><span class="n">form</span><span class="o">.</span><span class="na">customized</span> <span class="o">==</span> <span class="k">this</span><span class="o">);</span></span>
<span id="LC1445" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1446" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1447" class="line" lang="java"></span>
<span id="LC1448" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> <span class="no">FORM_OFFSET</span><span class="o">;</span></span>
<span id="LC1449" class="line" lang="java">    <span class="kd">static</span> <span class="o">{</span></span>
<span id="LC1450" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC1451" class="line" lang="java">            <span class="no">FORM_OFFSET</span> <span class="o">=</span> <span class="no">UNSAFE</span><span class="o">.</span><span class="na">objectFieldOffset</span><span class="o">(</span><span class="nc">MethodHandle</span><span class="o">.</span><span class="na">class</span><span class="o">.</span><span class="na">getDeclaredField</span><span class="o">(</span><span class="s">"form"</span><span class="o">));</span></span>
<span id="LC1452" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">ReflectiveOperationException</span> <span class="n">ex</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC1453" class="line" lang="java">            <span class="k">throw</span> <span class="nf">newInternalError</span><span class="o">(</span><span class="n">ex</span><span class="o">);</span></span>
<span id="LC1454" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC1455" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC1456" class="line" lang="java"><span class="o">}</span></span>
