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
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.</span></span>
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
<span id="LC26" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC27" class="line" lang="java"><span class="cm"> * Classes to support functional-style operations on streams of elements, such</span></span>
<span id="LC28" class="line" lang="java"><span class="cm"> * as map-reduce transformations on collections.  For example:</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> *     int sum = widgets.stream()</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> *                      .filter(b -&gt; b.getColor() == RED)</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> *                      .mapToInt(b -&gt; b.getWeight())</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> *                      .sum();</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> * &lt;p&gt;Here we use {@code widgets}, a {@code Collection&lt;Widget&gt;},</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * as a source for a stream, and then perform a filter-map-reduce on the stream</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> * to obtain the sum of the weights of the red widgets.  (Summation is an</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * example of a &lt;a href="package-summary.html#Reduction"&gt;reduction&lt;/a&gt;</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * operation.)</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> * &lt;p&gt;The key abstraction introduced in this package is &lt;em&gt;stream&lt;/em&gt;.  The</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> * classes {@link java.util.stream.Stream}, {@link java.util.stream.IntStream},</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * {@link java.util.stream.LongStream}, and {@link java.util.stream.DoubleStream}</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> * are streams over objects and the primitive {@code int}, {@code long} and</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> * {@code double} types.  Streams differ from collections in several ways:</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> *     &lt;li&gt;No storage.  A stream is not a data structure that stores elements;</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> *     instead, it conveys elements from a source such as a data structure,</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> *     an array, a generator function, or an I/O channel, through a pipeline of</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> *     computational operations.&lt;/li&gt;</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Functional in nature.  An operation on a stream produces a result,</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> *     but does not modify its source.  For example, filtering a {@code Stream}</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> *     obtained from a collection produces a new {@code Stream} without the</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> *     filtered elements, rather than removing elements from the source</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> *     collection.&lt;/li&gt;</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Laziness-seeking.  Many stream operations, such as filtering, mapping,</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> *     or duplicate removal, can be implemented lazily, exposing opportunities</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> *     for optimization.  For example, "find the first {@code String} with</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> *     three consecutive vowels" need not examine all the input strings.</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> *     Stream operations are divided into intermediate ({@code Stream}-producing)</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> *     operations and terminal (value- or side-effect-producing) operations.</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> *     Intermediate operations are always lazy.&lt;/li&gt;</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Possibly unbounded.  While collections have a finite size, streams</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> *     need not.  Short-circuiting operations such as {@code limit(n)} or</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> *     {@code findFirst()} can allow computations on infinite streams to</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> *     complete in finite time.&lt;/li&gt;</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Consumable. The elements of a stream are only visited once during</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> *     the life of a stream. Like an {@link java.util.Iterator}, a new stream</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> *     must be generated to revisit the same elements of the source.</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> *     &lt;/li&gt;</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> * Streams can be obtained in a number of ways. Some examples include:</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> *     &lt;li&gt;From a {@link java.util.Collection} via the {@code stream()} and</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> *     {@code parallelStream()} methods;&lt;/li&gt;</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> *     &lt;li&gt;From an array via {@link java.util.Arrays#stream(Object[])};&lt;/li&gt;</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> *     &lt;li&gt;From static factory methods on the stream classes, such as</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> *     {@link java.util.stream.Stream#of(Object[])},</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> *     {@link java.util.stream.IntStream#range(int, int)}</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> *     or {@link java.util.stream.Stream#iterate(Object, UnaryOperator)};&lt;/li&gt;</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> *     &lt;li&gt;The lines of a file can be obtained from {@link java.io.BufferedReader#lines()};&lt;/li&gt;</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Streams of file paths can be obtained from methods in {@link java.nio.file.Files};&lt;/li&gt;</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Streams of random numbers can be obtained from {@link java.util.Random#ints()};&lt;/li&gt;</span></span>
<span id="LC88" class="line" lang="java"><span class="cm"> *     &lt;li&gt;Numerous other stream-bearing methods in the JDK, including</span></span>
<span id="LC89" class="line" lang="java"><span class="cm"> *     {@link java.util.BitSet#stream()},</span></span>
<span id="LC90" class="line" lang="java"><span class="cm"> *     {@link java.util.regex.Pattern#splitAsStream(java.lang.CharSequence)},</span></span>
<span id="LC91" class="line" lang="java"><span class="cm"> *     and {@link java.util.jar.JarFile#stream()}.&lt;/li&gt;</span></span>
<span id="LC92" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC93" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC94" class="line" lang="java"><span class="cm"> * &lt;p&gt;Additional stream sources can be provided by third-party libraries using</span></span>
<span id="LC95" class="line" lang="java"><span class="cm"> * &lt;a href="package-summary.html#StreamSources"&gt;these techniques&lt;/a&gt;.</span></span>
<span id="LC96" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC97" class="line" lang="java"><span class="cm"> * &lt;h2&gt;&lt;a name="StreamOps"&gt;Stream operations and pipelines&lt;/a&gt;&lt;/h2&gt;</span></span>
<span id="LC98" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC99" class="line" lang="java"><span class="cm"> * &lt;p&gt;Stream operations are divided into &lt;em&gt;intermediate&lt;/em&gt; and</span></span>
<span id="LC100" class="line" lang="java"><span class="cm"> * &lt;em&gt;terminal&lt;/em&gt; operations, and are combined to form &lt;em&gt;stream</span></span>
<span id="LC101" class="line" lang="java"><span class="cm"> * pipelines&lt;/em&gt;.  A stream pipeline consists of a source (such as a</span></span>
<span id="LC102" class="line" lang="java"><span class="cm"> * {@code Collection}, an array, a generator function, or an I/O channel);</span></span>
<span id="LC103" class="line" lang="java"><span class="cm"> * followed by zero or more intermediate operations such as</span></span>
<span id="LC104" class="line" lang="java"><span class="cm"> * {@code Stream.filter} or {@code Stream.map}; and a terminal operation such</span></span>
<span id="LC105" class="line" lang="java"><span class="cm"> * as {@code Stream.forEach} or {@code Stream.reduce}.</span></span>
<span id="LC106" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC107" class="line" lang="java"><span class="cm"> * &lt;p&gt;Intermediate operations return a new stream.  They are always</span></span>
<span id="LC108" class="line" lang="java"><span class="cm"> * &lt;em&gt;lazy&lt;/em&gt;; executing an intermediate operation such as</span></span>
<span id="LC109" class="line" lang="java"><span class="cm"> * {@code filter()} does not actually perform any filtering, but instead</span></span>
<span id="LC110" class="line" lang="java"><span class="cm"> * creates a new stream that, when traversed, contains the elements of</span></span>
<span id="LC111" class="line" lang="java"><span class="cm"> * the initial stream that match the given predicate.  Traversal</span></span>
<span id="LC112" class="line" lang="java"><span class="cm"> * of the pipeline source does not begin until the terminal operation of the</span></span>
<span id="LC113" class="line" lang="java"><span class="cm"> * pipeline is executed.</span></span>
<span id="LC114" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC115" class="line" lang="java"><span class="cm"> * &lt;p&gt;Terminal operations, such as {@code Stream.forEach} or</span></span>
<span id="LC116" class="line" lang="java"><span class="cm"> * {@code IntStream.sum}, may traverse the stream to produce a result or a</span></span>
<span id="LC117" class="line" lang="java"><span class="cm"> * side-effect. After the terminal operation is performed, the stream pipeline</span></span>
<span id="LC118" class="line" lang="java"><span class="cm"> * is considered consumed, and can no longer be used; if you need to traverse</span></span>
<span id="LC119" class="line" lang="java"><span class="cm"> * the same data source again, you must return to the data source to get a new</span></span>
<span id="LC120" class="line" lang="java"><span class="cm"> * stream.  In almost all cases, terminal operations are &lt;em&gt;eager&lt;/em&gt;,</span></span>
<span id="LC121" class="line" lang="java"><span class="cm"> * completing their traversal of the data source and processing of the pipeline</span></span>
<span id="LC122" class="line" lang="java"><span class="cm"> * before returning.  Only the terminal operations {@code iterator()} and</span></span>
<span id="LC123" class="line" lang="java"><span class="cm"> * {@code spliterator()} are not; these are provided as an "escape hatch" to enable</span></span>
<span id="LC124" class="line" lang="java"><span class="cm"> * arbitrary client-controlled pipeline traversals in the event that the</span></span>
<span id="LC125" class="line" lang="java"><span class="cm"> * existing operations are not sufficient to the task.</span></span>
<span id="LC126" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC127" class="line" lang="java"><span class="cm"> * &lt;p&gt; Processing streams lazily allows for significant efficiencies; in a</span></span>
<span id="LC128" class="line" lang="java"><span class="cm"> * pipeline such as the filter-map-sum example above, filtering, mapping, and</span></span>
<span id="LC129" class="line" lang="java"><span class="cm"> * summing can be fused into a single pass on the data, with minimal</span></span>
<span id="LC130" class="line" lang="java"><span class="cm"> * intermediate state. Laziness also allows avoiding examining all the data</span></span>
<span id="LC131" class="line" lang="java"><span class="cm"> * when it is not necessary; for operations such as "find the first string</span></span>
<span id="LC132" class="line" lang="java"><span class="cm"> * longer than 1000 characters", it is only necessary to examine just enough</span></span>
<span id="LC133" class="line" lang="java"><span class="cm"> * strings to find one that has the desired characteristics without examining</span></span>
<span id="LC134" class="line" lang="java"><span class="cm"> * all of the strings available from the source. (This behavior becomes even</span></span>
<span id="LC135" class="line" lang="java"><span class="cm"> * more important when the input stream is infinite and not merely large.)</span></span>
<span id="LC136" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC137" class="line" lang="java"><span class="cm"> * &lt;p&gt;Intermediate operations are further divided into &lt;em&gt;stateless&lt;/em&gt;</span></span>
<span id="LC138" class="line" lang="java"><span class="cm"> * and &lt;em&gt;stateful&lt;/em&gt; operations. Stateless operations, such as {@code filter}</span></span>
<span id="LC139" class="line" lang="java"><span class="cm"> * and {@code map}, retain no state from previously seen element when processing</span></span>
<span id="LC140" class="line" lang="java"><span class="cm"> * a new element -- each element can be processed</span></span>
<span id="LC141" class="line" lang="java"><span class="cm"> * independently of operations on other elements.  Stateful operations, such as</span></span>
<span id="LC142" class="line" lang="java"><span class="cm"> * {@code distinct} and {@code sorted}, may incorporate state from previously</span></span>
<span id="LC143" class="line" lang="java"><span class="cm"> * seen elements when processing new elements.</span></span>
<span id="LC144" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC145" class="line" lang="java"><span class="cm"> * &lt;p&gt;Stateful operations may need to process the entire input</span></span>
<span id="LC146" class="line" lang="java"><span class="cm"> * before producing a result.  For example, one cannot produce any results from</span></span>
<span id="LC147" class="line" lang="java"><span class="cm"> * sorting a stream until one has seen all elements of the stream.  As a result,</span></span>
<span id="LC148" class="line" lang="java"><span class="cm"> * under parallel computation, some pipelines containing stateful intermediate</span></span>
<span id="LC149" class="line" lang="java"><span class="cm"> * operations may require multiple passes on the data or may need to buffer</span></span>
<span id="LC150" class="line" lang="java"><span class="cm"> * significant data.  Pipelines containing exclusively stateless intermediate</span></span>
<span id="LC151" class="line" lang="java"><span class="cm"> * operations can be processed in a single pass, whether sequential or parallel,</span></span>
<span id="LC152" class="line" lang="java"><span class="cm"> * with minimal data buffering.</span></span>
<span id="LC153" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC154" class="line" lang="java"><span class="cm"> * &lt;p&gt;Further, some operations are deemed &lt;em&gt;short-circuiting&lt;/em&gt; operations.</span></span>
<span id="LC155" class="line" lang="java"><span class="cm"> * An intermediate operation is short-circuiting if, when presented with</span></span>
<span id="LC156" class="line" lang="java"><span class="cm"> * infinite input, it may produce a finite stream as a result.  A terminal</span></span>
<span id="LC157" class="line" lang="java"><span class="cm"> * operation is short-circuiting if, when presented with infinite input, it may</span></span>
<span id="LC158" class="line" lang="java"><span class="cm"> * terminate in finite time.  Having a short-circuiting operation in the pipeline</span></span>
<span id="LC159" class="line" lang="java"><span class="cm"> * is a necessary, but not sufficient, condition for the processing of an infinite</span></span>
<span id="LC160" class="line" lang="java"><span class="cm"> * stream to terminate normally in finite time.</span></span>
<span id="LC161" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC162" class="line" lang="java"><span class="cm"> * &lt;h3&gt;Parallelism&lt;/h3&gt;</span></span>
<span id="LC163" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC164" class="line" lang="java"><span class="cm"> * &lt;p&gt;Processing elements with an explicit {@code for-}loop is inherently serial.</span></span>
<span id="LC165" class="line" lang="java"><span class="cm"> * Streams facilitate parallel execution by reframing the computation as a pipeline of</span></span>
<span id="LC166" class="line" lang="java"><span class="cm"> * aggregate operations, rather than as imperative operations on each individual</span></span>
<span id="LC167" class="line" lang="java"><span class="cm"> * element.  All streams operations can execute either in serial or in parallel.</span></span>
<span id="LC168" class="line" lang="java"><span class="cm"> * The stream implementations in the JDK create serial streams unless parallelism is</span></span>
<span id="LC169" class="line" lang="java"><span class="cm"> * explicitly requested.  For example, {@code Collection} has methods</span></span>
<span id="LC170" class="line" lang="java"><span class="cm"> * {@link java.util.Collection#stream} and {@link java.util.Collection#parallelStream},</span></span>
<span id="LC171" class="line" lang="java"><span class="cm"> * which produce sequential and parallel streams respectively; other</span></span>
<span id="LC172" class="line" lang="java"><span class="cm"> * stream-bearing methods such as {@link java.util.stream.IntStream#range(int, int)}</span></span>
<span id="LC173" class="line" lang="java"><span class="cm"> * produce sequential streams but these streams can be efficiently parallelized by</span></span>
<span id="LC174" class="line" lang="java"><span class="cm"> * invoking their {@link java.util.stream.BaseStream#parallel()} method.</span></span>
<span id="LC175" class="line" lang="java"><span class="cm"> * To execute the prior "sum of weights of widgets" query in parallel, we would</span></span>
<span id="LC176" class="line" lang="java"><span class="cm"> * do:</span></span>
<span id="LC177" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC178" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC179" class="line" lang="java"><span class="cm"> *     int sumOfWeights = widgets.}&lt;code&gt;&lt;b&gt;parallelStream()&lt;/b&gt;&lt;/code&gt;{@code</span></span>
<span id="LC180" class="line" lang="java"><span class="cm"> *                               .filter(b -&gt; b.getColor() == RED)</span></span>
<span id="LC181" class="line" lang="java"><span class="cm"> *                               .mapToInt(b -&gt; b.getWeight())</span></span>
<span id="LC182" class="line" lang="java"><span class="cm"> *                               .sum();</span></span>
<span id="LC183" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC184" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC185" class="line" lang="java"><span class="cm"> * &lt;p&gt;The only difference between the serial and parallel versions of this</span></span>
<span id="LC186" class="line" lang="java"><span class="cm"> * example is the creation of the initial stream, using "{@code parallelStream()}"</span></span>
<span id="LC187" class="line" lang="java"><span class="cm"> * instead of "{@code stream()}".  When the terminal operation is initiated,</span></span>
<span id="LC188" class="line" lang="java"><span class="cm"> * the stream pipeline is executed sequentially or in parallel depending on the</span></span>
<span id="LC189" class="line" lang="java"><span class="cm"> * orientation of the stream on which it is invoked.  Whether a stream will execute in serial or</span></span>
<span id="LC190" class="line" lang="java"><span class="cm"> * parallel can be determined with the {@code isParallel()} method, and the</span></span>
<span id="LC191" class="line" lang="java"><span class="cm"> * orientation of a stream can be modified with the</span></span>
<span id="LC192" class="line" lang="java"><span class="cm"> * {@link java.util.stream.BaseStream#sequential()} and</span></span>
<span id="LC193" class="line" lang="java"><span class="cm"> * {@link java.util.stream.BaseStream#parallel()} operations.  When the terminal</span></span>
<span id="LC194" class="line" lang="java"><span class="cm"> * operation is initiated, the stream pipeline is executed sequentially or in</span></span>
<span id="LC195" class="line" lang="java"><span class="cm"> * parallel depending on the mode of the stream on which it is invoked.</span></span>
<span id="LC196" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC197" class="line" lang="java"><span class="cm"> * &lt;p&gt;Except for operations identified as explicitly nondeterministic, such</span></span>
<span id="LC198" class="line" lang="java"><span class="cm"> * as {@code findAny()}, whether a stream executes sequentially or in parallel</span></span>
<span id="LC199" class="line" lang="java"><span class="cm"> * should not change the result of the computation.</span></span>
<span id="LC200" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC201" class="line" lang="java"><span class="cm"> * &lt;p&gt;Most stream operations accept parameters that describe user-specified</span></span>
<span id="LC202" class="line" lang="java"><span class="cm"> * behavior, which are often lambda expressions.  To preserve correct behavior,</span></span>
<span id="LC203" class="line" lang="java"><span class="cm"> * these &lt;em&gt;behavioral parameters&lt;/em&gt; must be &lt;em&gt;non-interfering&lt;/em&gt;, and in</span></span>
<span id="LC204" class="line" lang="java"><span class="cm"> * most cases must be &lt;em&gt;stateless&lt;/em&gt;.  Such parameters are always instances</span></span>
<span id="LC205" class="line" lang="java"><span class="cm"> * of a &lt;a href="../function/package-summary.html"&gt;functional interface&lt;/a&gt; such</span></span>
<span id="LC206" class="line" lang="java"><span class="cm"> * as {@link java.util.function.Function}, and are often lambda expressions or</span></span>
<span id="LC207" class="line" lang="java"><span class="cm"> * method references.</span></span>
<span id="LC208" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC209" class="line" lang="java"><span class="cm"> * &lt;h3&gt;&lt;a name="NonInterference"&gt;Non-interference&lt;/a&gt;&lt;/h3&gt;</span></span>
<span id="LC210" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC211" class="line" lang="java"><span class="cm"> * Streams enable you to execute possibly-parallel aggregate operations over a</span></span>
<span id="LC212" class="line" lang="java"><span class="cm"> * variety of data sources, including even non-thread-safe collections such as</span></span>
<span id="LC213" class="line" lang="java"><span class="cm"> * {@code ArrayList}. This is possible only if we can prevent</span></span>
<span id="LC214" class="line" lang="java"><span class="cm"> * &lt;em&gt;interference&lt;/em&gt; with the data source during the execution of a stream</span></span>
<span id="LC215" class="line" lang="java"><span class="cm"> * pipeline.  Except for the escape-hatch operations {@code iterator()} and</span></span>
<span id="LC216" class="line" lang="java"><span class="cm"> * {@code spliterator()}, execution begins when the terminal operation is</span></span>
<span id="LC217" class="line" lang="java"><span class="cm"> * invoked, and ends when the terminal operation completes.  For most data</span></span>
<span id="LC218" class="line" lang="java"><span class="cm"> * sources, preventing interference means ensuring that the data source is</span></span>
<span id="LC219" class="line" lang="java"><span class="cm"> * &lt;em&gt;not modified at all&lt;/em&gt; during the execution of the stream pipeline.</span></span>
<span id="LC220" class="line" lang="java"><span class="cm"> * The notable exception to this are streams whose sources are concurrent</span></span>
<span id="LC221" class="line" lang="java"><span class="cm"> * collections, which are specifically designed to handle concurrent modification.</span></span>
<span id="LC222" class="line" lang="java"><span class="cm"> * Concurrent stream sources are those whose {@code Spliterator} reports the</span></span>
<span id="LC223" class="line" lang="java"><span class="cm"> * {@code CONCURRENT} characteristic.</span></span>
<span id="LC224" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC225" class="line" lang="java"><span class="cm"> * &lt;p&gt;Accordingly, behavioral parameters in stream pipelines whose source might</span></span>
<span id="LC226" class="line" lang="java"><span class="cm"> * not be concurrent should never modify the stream's data source.</span></span>
<span id="LC227" class="line" lang="java"><span class="cm"> * A behavioral parameter is said to &lt;em&gt;interfere&lt;/em&gt; with a non-concurrent</span></span>
<span id="LC228" class="line" lang="java"><span class="cm"> * data source if it modifies, or causes to be</span></span>
<span id="LC229" class="line" lang="java"><span class="cm"> * modified, the stream's data source.  The need for non-interference applies</span></span>
<span id="LC230" class="line" lang="java"><span class="cm"> * to all pipelines, not just parallel ones.  Unless the stream source is</span></span>
<span id="LC231" class="line" lang="java"><span class="cm"> * concurrent, modifying a stream's data source during execution of a stream</span></span>
<span id="LC232" class="line" lang="java"><span class="cm"> * pipeline can cause exceptions, incorrect answers, or nonconformant behavior.</span></span>
<span id="LC233" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC234" class="line" lang="java"><span class="cm"> * For well-behaved stream sources, the source can be modified before the</span></span>
<span id="LC235" class="line" lang="java"><span class="cm"> * terminal operation commences and those modifications will be reflected in</span></span>
<span id="LC236" class="line" lang="java"><span class="cm"> * the covered elements.  For example, consider the following code:</span></span>
<span id="LC237" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC238" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC239" class="line" lang="java"><span class="cm"> *     List&lt;String&gt; l = new ArrayList(Arrays.asList("one", "two"));</span></span>
<span id="LC240" class="line" lang="java"><span class="cm"> *     Stream&lt;String&gt; sl = l.stream();</span></span>
<span id="LC241" class="line" lang="java"><span class="cm"> *     l.add("three");</span></span>
<span id="LC242" class="line" lang="java"><span class="cm"> *     String s = sl.collect(joining(" "));</span></span>
<span id="LC243" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC244" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC245" class="line" lang="java"><span class="cm"> * First a list is created consisting of two strings: "one"; and "two". Then a</span></span>
<span id="LC246" class="line" lang="java"><span class="cm"> * stream is created from that list. Next the list is modified by adding a third</span></span>
<span id="LC247" class="line" lang="java"><span class="cm"> * string: "three". Finally the elements of the stream are collected and joined</span></span>
<span id="LC248" class="line" lang="java"><span class="cm"> * together. Since the list was modified before the terminal {@code collect}</span></span>
<span id="LC249" class="line" lang="java"><span class="cm"> * operation commenced the result will be a string of "one two three". All the</span></span>
<span id="LC250" class="line" lang="java"><span class="cm"> * streams returned from JDK collections, and most other JDK classes,</span></span>
<span id="LC251" class="line" lang="java"><span class="cm"> * are well-behaved in this manner; for streams generated by other libraries, see</span></span>
<span id="LC252" class="line" lang="java"><span class="cm"> * &lt;a href="package-summary.html#StreamSources"&gt;Low-level stream</span></span>
<span id="LC253" class="line" lang="java"><span class="cm"> * construction&lt;/a&gt; for requirements for building well-behaved streams.</span></span>
<span id="LC254" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC255" class="line" lang="java"><span class="cm"> * &lt;h3&gt;&lt;a name="Statelessness"&gt;Stateless behaviors&lt;/a&gt;&lt;/h3&gt;</span></span>
<span id="LC256" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC257" class="line" lang="java"><span class="cm"> * Stream pipeline results may be nondeterministic or incorrect if the behavioral</span></span>
<span id="LC258" class="line" lang="java"><span class="cm"> * parameters to the stream operations are &lt;em&gt;stateful&lt;/em&gt;.  A stateful lambda</span></span>
<span id="LC259" class="line" lang="java"><span class="cm"> * (or other object implementing the appropriate functional interface) is one</span></span>
<span id="LC260" class="line" lang="java"><span class="cm"> * whose result depends on any state which might change during the execution</span></span>
<span id="LC261" class="line" lang="java"><span class="cm"> * of the stream pipeline.  An example of a stateful lambda is the parameter</span></span>
<span id="LC262" class="line" lang="java"><span class="cm"> * to {@code map()} in:</span></span>
<span id="LC263" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC264" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC265" class="line" lang="java"><span class="cm"> *     Set&lt;Integer&gt; seen = Collections.synchronizedSet(new HashSet&lt;&gt;());</span></span>
<span id="LC266" class="line" lang="java"><span class="cm"> *     stream.parallel().map(e -&gt; { if (seen.add(e)) return 0; else return e; })...</span></span>
<span id="LC267" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC268" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC269" class="line" lang="java"><span class="cm"> * Here, if the mapping operation is performed in parallel, the results for the</span></span>
<span id="LC270" class="line" lang="java"><span class="cm"> * same input could vary from run to run, due to thread scheduling differences,</span></span>
<span id="LC271" class="line" lang="java"><span class="cm"> * whereas, with a stateless lambda expression the results would always be the</span></span>
<span id="LC272" class="line" lang="java"><span class="cm"> * same.</span></span>
<span id="LC273" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC274" class="line" lang="java"><span class="cm"> * &lt;p&gt;Note also that attempting to access mutable state from behavioral parameters</span></span>
<span id="LC275" class="line" lang="java"><span class="cm"> * presents you with a bad choice with respect to safety and performance; if</span></span>
<span id="LC276" class="line" lang="java"><span class="cm"> * you do not synchronize access to that state, you have a data race and</span></span>
<span id="LC277" class="line" lang="java"><span class="cm"> * therefore your code is broken, but if you do synchronize access to that</span></span>
<span id="LC278" class="line" lang="java"><span class="cm"> * state, you risk having contention undermine the parallelism you are seeking</span></span>
<span id="LC279" class="line" lang="java"><span class="cm"> * to benefit from.  The best approach is to avoid stateful behavioral</span></span>
<span id="LC280" class="line" lang="java"><span class="cm"> * parameters to stream operations entirely; there is usually a way to</span></span>
<span id="LC281" class="line" lang="java"><span class="cm"> * restructure the stream pipeline to avoid statefulness.</span></span>
<span id="LC282" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC283" class="line" lang="java"><span class="cm"> * &lt;h3&gt;Side-effects&lt;/h3&gt;</span></span>
<span id="LC284" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC285" class="line" lang="java"><span class="cm"> * Side-effects in behavioral parameters to stream operations are, in general,</span></span>
<span id="LC286" class="line" lang="java"><span class="cm"> * discouraged, as they can often lead to unwitting violations of the</span></span>
<span id="LC287" class="line" lang="java"><span class="cm"> * statelessness requirement, as well as other thread-safety hazards.</span></span>
<span id="LC288" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC289" class="line" lang="java"><span class="cm"> * &lt;p&gt;If the behavioral parameters do have side-effects, unless explicitly</span></span>
<span id="LC290" class="line" lang="java"><span class="cm"> * stated, there are no guarantees as to the</span></span>
<span id="LC291" class="line" lang="java"><span class="cm"> * &lt;a href="../concurrent/package-summary.html#MemoryVisibility"&gt;&lt;i&gt;visibility&lt;/i&gt;&lt;/a&gt;</span></span>
<span id="LC292" class="line" lang="java"><span class="cm"> * of those side-effects to other threads, nor are there any guarantees that</span></span>
<span id="LC293" class="line" lang="java"><span class="cm"> * different operations on the "same" element within the same stream pipeline</span></span>
<span id="LC294" class="line" lang="java"><span class="cm"> * are executed in the same thread.  Further, the ordering of those effects</span></span>
<span id="LC295" class="line" lang="java"><span class="cm"> * may be surprising.  Even when a pipeline is constrained to produce a</span></span>
<span id="LC296" class="line" lang="java"><span class="cm"> * &lt;em&gt;result&lt;/em&gt; that is consistent with the encounter order of the stream</span></span>
<span id="LC297" class="line" lang="java"><span class="cm"> * source (for example, {@code IntStream.range(0,5).parallel().map(x -&gt; x*2).toArray()}</span></span>
<span id="LC298" class="line" lang="java"><span class="cm"> * must produce {@code [0, 2, 4, 6, 8]}), no guarantees are made as to the order</span></span>
<span id="LC299" class="line" lang="java"><span class="cm"> * in which the mapper function is applied to individual elements, or in what</span></span>
<span id="LC300" class="line" lang="java"><span class="cm"> * thread any behavioral parameter is executed for a given element.</span></span>
<span id="LC301" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC302" class="line" lang="java"><span class="cm"> * &lt;p&gt;Many computations where one might be tempted to use side effects can be more</span></span>
<span id="LC303" class="line" lang="java"><span class="cm"> * safely and efficiently expressed without side-effects, such as using</span></span>
<span id="LC304" class="line" lang="java"><span class="cm"> * &lt;a href="package-summary.html#Reduction"&gt;reduction&lt;/a&gt; instead of mutable</span></span>
<span id="LC305" class="line" lang="java"><span class="cm"> * accumulators. However, side-effects such as using {@code println()} for debugging</span></span>
<span id="LC306" class="line" lang="java"><span class="cm"> * purposes are usually harmless.  A small number of stream operations, such as</span></span>
<span id="LC307" class="line" lang="java"><span class="cm"> * {@code forEach()} and {@code peek()}, can operate only via side-effects;</span></span>
<span id="LC308" class="line" lang="java"><span class="cm"> * these should be used with care.</span></span>
<span id="LC309" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC310" class="line" lang="java"><span class="cm"> * &lt;p&gt;As an example of how to transform a stream pipeline that inappropriately</span></span>
<span id="LC311" class="line" lang="java"><span class="cm"> * uses side-effects to one that does not, the following code searches a stream</span></span>
<span id="LC312" class="line" lang="java"><span class="cm"> * of strings for those matching a given regular expression, and puts the</span></span>
<span id="LC313" class="line" lang="java"><span class="cm"> * matches in a list.</span></span>
<span id="LC314" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC315" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC316" class="line" lang="java"><span class="cm"> *     ArrayList&lt;String&gt; results = new ArrayList&lt;&gt;();</span></span>
<span id="LC317" class="line" lang="java"><span class="cm"> *     stream.filter(s -&gt; pattern.matcher(s).matches())</span></span>
<span id="LC318" class="line" lang="java"><span class="cm"> *           .forEach(s -&gt; results.add(s));  // Unnecessary use of side-effects!</span></span>
<span id="LC319" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC320" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC321" class="line" lang="java"><span class="cm"> * This code unnecessarily uses side-effects.  If executed in parallel, the</span></span>
<span id="LC322" class="line" lang="java"><span class="cm"> * non-thread-safety of {@code ArrayList} would cause incorrect results, and</span></span>
<span id="LC323" class="line" lang="java"><span class="cm"> * adding needed synchronization would cause contention, undermining the</span></span>
<span id="LC324" class="line" lang="java"><span class="cm"> * benefit of parallelism.  Furthermore, using side-effects here is completely</span></span>
<span id="LC325" class="line" lang="java"><span class="cm"> * unnecessary; the {@code forEach()} can simply be replaced with a reduction</span></span>
<span id="LC326" class="line" lang="java"><span class="cm"> * operation that is safer, more efficient, and more amenable to</span></span>
<span id="LC327" class="line" lang="java"><span class="cm"> * parallelization:</span></span>
<span id="LC328" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC329" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC330" class="line" lang="java"><span class="cm"> *     List&lt;String&gt;results =</span></span>
<span id="LC331" class="line" lang="java"><span class="cm"> *         stream.filter(s -&gt; pattern.matcher(s).matches())</span></span>
<span id="LC332" class="line" lang="java"><span class="cm"> *               .collect(Collectors.toList());  // No side-effects!</span></span>
<span id="LC333" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC334" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC335" class="line" lang="java"><span class="cm"> * &lt;h3&gt;&lt;a name="Ordering"&gt;Ordering&lt;/a&gt;&lt;/h3&gt;</span></span>
<span id="LC336" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC337" class="line" lang="java"><span class="cm"> * &lt;p&gt;Streams may or may not have a defined &lt;em&gt;encounter order&lt;/em&gt;.  Whether</span></span>
<span id="LC338" class="line" lang="java"><span class="cm"> * or not a stream has an encounter order depends on the source and the</span></span>
<span id="LC339" class="line" lang="java"><span class="cm"> * intermediate operations.  Certain stream sources (such as {@code List} or</span></span>
<span id="LC340" class="line" lang="java"><span class="cm"> * arrays) are intrinsically ordered, whereas others (such as {@code HashSet})</span></span>
<span id="LC341" class="line" lang="java"><span class="cm"> * are not.  Some intermediate operations, such as {@code sorted()}, may impose</span></span>
<span id="LC342" class="line" lang="java"><span class="cm"> * an encounter order on an otherwise unordered stream, and others may render an</span></span>
<span id="LC343" class="line" lang="java"><span class="cm"> * ordered stream unordered, such as {@link java.util.stream.BaseStream#unordered()}.</span></span>
<span id="LC344" class="line" lang="java"><span class="cm"> * Further, some terminal operations may ignore encounter order, such as</span></span>
<span id="LC345" class="line" lang="java"><span class="cm"> * {@code forEach()}.</span></span>
<span id="LC346" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC347" class="line" lang="java"><span class="cm"> * &lt;p&gt;If a stream is ordered, most operations are constrained to operate on the</span></span>
<span id="LC348" class="line" lang="java"><span class="cm"> * elements in their encounter order; if the source of a stream is a {@code List}</span></span>
<span id="LC349" class="line" lang="java"><span class="cm"> * containing {@code [1, 2, 3]}, then the result of executing {@code map(x -&gt; x*2)}</span></span>
<span id="LC350" class="line" lang="java"><span class="cm"> * must be {@code [2, 4, 6]}.  However, if the source has no defined encounter</span></span>
<span id="LC351" class="line" lang="java"><span class="cm"> * order, then any permutation of the values {@code [2, 4, 6]} would be a valid</span></span>
<span id="LC352" class="line" lang="java"><span class="cm"> * result.</span></span>
<span id="LC353" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC354" class="line" lang="java"><span class="cm"> * &lt;p&gt;For sequential streams, the presence or absence of an encounter order does</span></span>
<span id="LC355" class="line" lang="java"><span class="cm"> * not affect performance, only determinism.  If a stream is ordered, repeated</span></span>
<span id="LC356" class="line" lang="java"><span class="cm"> * execution of identical stream pipelines on an identical source will produce</span></span>
<span id="LC357" class="line" lang="java"><span class="cm"> * an identical result; if it is not ordered, repeated execution might produce</span></span>
<span id="LC358" class="line" lang="java"><span class="cm"> * different results.</span></span>
<span id="LC359" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC360" class="line" lang="java"><span class="cm"> * &lt;p&gt;For parallel streams, relaxing the ordering constraint can sometimes enable</span></span>
<span id="LC361" class="line" lang="java"><span class="cm"> * more efficient execution.  Certain aggregate operations,</span></span>
<span id="LC362" class="line" lang="java"><span class="cm"> * such as filtering duplicates ({@code distinct()}) or grouped reductions</span></span>
<span id="LC363" class="line" lang="java"><span class="cm"> * ({@code Collectors.groupingBy()}) can be implemented more efficiently if ordering of elements</span></span>
<span id="LC364" class="line" lang="java"><span class="cm"> * is not relevant.  Similarly, operations that are intrinsically tied to encounter order,</span></span>
<span id="LC365" class="line" lang="java"><span class="cm"> * such as {@code limit()}, may require</span></span>
<span id="LC366" class="line" lang="java"><span class="cm"> * buffering to ensure proper ordering, undermining the benefit of parallelism.</span></span>
<span id="LC367" class="line" lang="java"><span class="cm"> * In cases where the stream has an encounter order, but the user does not</span></span>
<span id="LC368" class="line" lang="java"><span class="cm"> * particularly &lt;em&gt;care&lt;/em&gt; about that encounter order, explicitly de-ordering</span></span>
<span id="LC369" class="line" lang="java"><span class="cm"> * the stream with {@link java.util.stream.BaseStream#unordered() unordered()} may</span></span>
<span id="LC370" class="line" lang="java"><span class="cm"> * improve parallel performance for some stateful or terminal operations.</span></span>
<span id="LC371" class="line" lang="java"><span class="cm"> * However, most stream pipelines, such as the "sum of weight of blocks" example</span></span>
<span id="LC372" class="line" lang="java"><span class="cm"> * above, still parallelize efficiently even under ordering constraints.</span></span>
<span id="LC373" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC374" class="line" lang="java"><span class="cm"> * &lt;h2&gt;&lt;a name="Reduction"&gt;Reduction operations&lt;/a&gt;&lt;/h2&gt;</span></span>
<span id="LC375" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC376" class="line" lang="java"><span class="cm"> * A &lt;em&gt;reduction&lt;/em&gt; operation (also called a &lt;em&gt;fold&lt;/em&gt;) takes a sequence</span></span>
<span id="LC377" class="line" lang="java"><span class="cm"> * of input elements and combines them into a single summary result by repeated</span></span>
<span id="LC378" class="line" lang="java"><span class="cm"> * application of a combining operation, such as finding the sum or maximum of</span></span>
<span id="LC379" class="line" lang="java"><span class="cm"> * a set of numbers, or accumulating elements into a list.  The streams classes have</span></span>
<span id="LC380" class="line" lang="java"><span class="cm"> * multiple forms of general reduction operations, called</span></span>
<span id="LC381" class="line" lang="java"><span class="cm"> * {@link java.util.stream.Stream#reduce(java.util.function.BinaryOperator) reduce()}</span></span>
<span id="LC382" class="line" lang="java"><span class="cm"> * and {@link java.util.stream.Stream#collect(java.util.stream.Collector) collect()},</span></span>
<span id="LC383" class="line" lang="java"><span class="cm"> * as well as multiple specialized reduction forms such as</span></span>
<span id="LC384" class="line" lang="java"><span class="cm"> * {@link java.util.stream.IntStream#sum() sum()}, {@link java.util.stream.IntStream#max() max()},</span></span>
<span id="LC385" class="line" lang="java"><span class="cm"> * or {@link java.util.stream.IntStream#count() count()}.</span></span>
<span id="LC386" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC387" class="line" lang="java"><span class="cm"> * &lt;p&gt;Of course, such operations can be readily implemented as simple sequential</span></span>
<span id="LC388" class="line" lang="java"><span class="cm"> * loops, as in:</span></span>
<span id="LC389" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC390" class="line" lang="java"><span class="cm"> *    int sum = 0;</span></span>
<span id="LC391" class="line" lang="java"><span class="cm"> *    for (int x : numbers) {</span></span>
<span id="LC392" class="line" lang="java"><span class="cm"> *       sum += x;</span></span>
<span id="LC393" class="line" lang="java"><span class="cm"> *    }</span></span>
<span id="LC394" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC395" class="line" lang="java"><span class="cm"> * However, there are good reasons to prefer a reduce operation</span></span>
<span id="LC396" class="line" lang="java"><span class="cm"> * over a mutative accumulation such as the above.  Not only is a reduction</span></span>
<span id="LC397" class="line" lang="java"><span class="cm"> * "more abstract" -- it operates on the stream as a whole rather than individual</span></span>
<span id="LC398" class="line" lang="java"><span class="cm"> * elements -- but a properly constructed reduce operation is inherently</span></span>
<span id="LC399" class="line" lang="java"><span class="cm"> * parallelizable, so long as the function(s) used to process the elements</span></span>
<span id="LC400" class="line" lang="java"><span class="cm"> * are &lt;a href="package-summary.html#Associativity"&gt;associative&lt;/a&gt; and</span></span>
<span id="LC401" class="line" lang="java"><span class="cm"> * &lt;a href="package-summary.html#NonInterfering"&gt;stateless&lt;/a&gt;.</span></span>
<span id="LC402" class="line" lang="java"><span class="cm"> * For example, given a stream of numbers for which we want to find the sum, we</span></span>
<span id="LC403" class="line" lang="java"><span class="cm"> * can write:</span></span>
<span id="LC404" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC405" class="line" lang="java"><span class="cm"> *    int sum = numbers.stream().reduce(0, (x,y) -&gt; x+y);</span></span>
<span id="LC406" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC407" class="line" lang="java"><span class="cm"> * or:</span></span>
<span id="LC408" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC409" class="line" lang="java"><span class="cm"> *    int sum = numbers.stream().reduce(0, Integer::sum);</span></span>
<span id="LC410" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC411" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC412" class="line" lang="java"><span class="cm"> * &lt;p&gt;These reduction operations can run safely in parallel with almost no</span></span>
<span id="LC413" class="line" lang="java"><span class="cm"> * modification:</span></span>
<span id="LC414" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC415" class="line" lang="java"><span class="cm"> *    int sum = numbers.parallelStream().reduce(0, Integer::sum);</span></span>
<span id="LC416" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC417" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC418" class="line" lang="java"><span class="cm"> * &lt;p&gt;Reduction parallellizes well because the implementation</span></span>
<span id="LC419" class="line" lang="java"><span class="cm"> * can operate on subsets of the data in parallel, and then combine the</span></span>
<span id="LC420" class="line" lang="java"><span class="cm"> * intermediate results to get the final correct answer.  (Even if the language</span></span>
<span id="LC421" class="line" lang="java"><span class="cm"> * had a "parallel for-each" construct, the mutative accumulation approach would</span></span>
<span id="LC422" class="line" lang="java"><span class="cm"> * still required the developer to provide</span></span>
<span id="LC423" class="line" lang="java"><span class="cm"> * thread-safe updates to the shared accumulating variable {@code sum}, and</span></span>
<span id="LC424" class="line" lang="java"><span class="cm"> * the required synchronization would then likely eliminate any performance gain from</span></span>
<span id="LC425" class="line" lang="java"><span class="cm"> * parallelism.)  Using {@code reduce()} instead removes all of the</span></span>
<span id="LC426" class="line" lang="java"><span class="cm"> * burden of parallelizing the reduction operation, and the library can provide</span></span>
<span id="LC427" class="line" lang="java"><span class="cm"> * an efficient parallel implementation with no additional synchronization</span></span>
<span id="LC428" class="line" lang="java"><span class="cm"> * required.</span></span>
<span id="LC429" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC430" class="line" lang="java"><span class="cm"> * &lt;p&gt;The "widgets" examples shown earlier shows how reduction combines with</span></span>
<span id="LC431" class="line" lang="java"><span class="cm"> * other operations to replace for loops with bulk operations.  If {@code widgets}</span></span>
<span id="LC432" class="line" lang="java"><span class="cm"> * is a collection of {@code Widget} objects, which have a {@code getWeight} method,</span></span>
<span id="LC433" class="line" lang="java"><span class="cm"> * we can find the heaviest widget with:</span></span>
<span id="LC434" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC435" class="line" lang="java"><span class="cm"> *     OptionalInt heaviest = widgets.parallelStream()</span></span>
<span id="LC436" class="line" lang="java"><span class="cm"> *                                   .mapToInt(Widget::getWeight)</span></span>
<span id="LC437" class="line" lang="java"><span class="cm"> *                                   .max();</span></span>
<span id="LC438" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC439" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC440" class="line" lang="java"><span class="cm"> * &lt;p&gt;In its more general form, a {@code reduce} operation on elements of type</span></span>
<span id="LC441" class="line" lang="java"><span class="cm"> * {@code &lt;T&gt;} yielding a result of type {@code &lt;U&gt;} requires three parameters:</span></span>
<span id="LC442" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC443" class="line" lang="java"><span class="cm"> * &lt;U&gt; U reduce(U identity,</span></span>
<span id="LC444" class="line" lang="java"><span class="cm"> *              BiFunction&lt;U, ? super T, U&gt; accumulator,</span></span>
<span id="LC445" class="line" lang="java"><span class="cm"> *              BinaryOperator&lt;U&gt; combiner);</span></span>
<span id="LC446" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC447" class="line" lang="java"><span class="cm"> * Here, the &lt;em&gt;identity&lt;/em&gt; element is both an initial seed value for the reduction</span></span>
<span id="LC448" class="line" lang="java"><span class="cm"> * and a default result if there are no input elements. The &lt;em&gt;accumulator&lt;/em&gt;</span></span>
<span id="LC449" class="line" lang="java"><span class="cm"> * function takes a partial result and the next element, and produces a new</span></span>
<span id="LC450" class="line" lang="java"><span class="cm"> * partial result. The &lt;em&gt;combiner&lt;/em&gt; function combines two partial results</span></span>
<span id="LC451" class="line" lang="java"><span class="cm"> * to produce a new partial result.  (The combiner is necessary in parallel</span></span>
<span id="LC452" class="line" lang="java"><span class="cm"> * reductions, where the input is partitioned, a partial accumulation computed</span></span>
<span id="LC453" class="line" lang="java"><span class="cm"> * for each partition, and then the partial results are combined to produce a</span></span>
<span id="LC454" class="line" lang="java"><span class="cm"> * final result.)</span></span>
<span id="LC455" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC456" class="line" lang="java"><span class="cm"> * &lt;p&gt;More formally, the {@code identity} value must be an &lt;em&gt;identity&lt;/em&gt; for</span></span>
<span id="LC457" class="line" lang="java"><span class="cm"> * the combiner function. This means that for all {@code u},</span></span>
<span id="LC458" class="line" lang="java"><span class="cm"> * {@code combiner.apply(identity, u)} is equal to {@code u}. Additionally, the</span></span>
<span id="LC459" class="line" lang="java"><span class="cm"> * {@code combiner} function must be &lt;a href="package-summary.html#Associativity"&gt;associative&lt;/a&gt; and</span></span>
<span id="LC460" class="line" lang="java"><span class="cm"> * must be compatible with the {@code accumulator} function: for all {@code u}</span></span>
<span id="LC461" class="line" lang="java"><span class="cm"> * and {@code t}, {@code combiner.apply(u, accumulator.apply(identity, t))} must</span></span>
<span id="LC462" class="line" lang="java"><span class="cm"> * be {@code equals()} to {@code accumulator.apply(u, t)}.</span></span>
<span id="LC463" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC464" class="line" lang="java"><span class="cm"> * &lt;p&gt;The three-argument form is a generalization of the two-argument form,</span></span>
<span id="LC465" class="line" lang="java"><span class="cm"> * incorporating a mapping step into the accumulation step.  We could</span></span>
<span id="LC466" class="line" lang="java"><span class="cm"> * re-cast the simple sum-of-weights example using the more general form as</span></span>
<span id="LC467" class="line" lang="java"><span class="cm"> * follows:</span></span>
<span id="LC468" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC469" class="line" lang="java"><span class="cm"> *     int sumOfWeights = widgets.stream()</span></span>
<span id="LC470" class="line" lang="java"><span class="cm"> *                               .reduce(0,</span></span>
<span id="LC471" class="line" lang="java"><span class="cm"> *                                       (sum, b) -&gt; sum + b.getWeight())</span></span>
<span id="LC472" class="line" lang="java"><span class="cm"> *                                       Integer::sum);</span></span>
<span id="LC473" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC474" class="line" lang="java"><span class="cm"> * though the explicit map-reduce form is more readable and therefore should</span></span>
<span id="LC475" class="line" lang="java"><span class="cm"> * usually be preferred. The generalized form is provided for cases where</span></span>
<span id="LC476" class="line" lang="java"><span class="cm"> * significant work can be optimized away by combining mapping and reducing</span></span>
<span id="LC477" class="line" lang="java"><span class="cm"> * into a single function.</span></span>
<span id="LC478" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC479" class="line" lang="java"><span class="cm"> * &lt;h3&gt;&lt;a name="MutableReduction"&gt;Mutable reduction&lt;/a&gt;&lt;/h3&gt;</span></span>
<span id="LC480" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC481" class="line" lang="java"><span class="cm"> * A &lt;em&gt;mutable reduction operation&lt;/em&gt; accumulates input elements into a</span></span>
<span id="LC482" class="line" lang="java"><span class="cm"> * mutable result container, such as a {@code Collection} or {@code StringBuilder},</span></span>
<span id="LC483" class="line" lang="java"><span class="cm"> * as it processes the elements in the stream.</span></span>
<span id="LC484" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC485" class="line" lang="java"><span class="cm"> * &lt;p&gt;If we wanted to take a stream of strings and concatenate them into a</span></span>
<span id="LC486" class="line" lang="java"><span class="cm"> * single long string, we &lt;em&gt;could&lt;/em&gt; achieve this with ordinary reduction:</span></span>
<span id="LC487" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC488" class="line" lang="java"><span class="cm"> *     String concatenated = strings.reduce("", String::concat)</span></span>
<span id="LC489" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC490" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC491" class="line" lang="java"><span class="cm"> * &lt;p&gt;We would get the desired result, and it would even work in parallel.  However,</span></span>
<span id="LC492" class="line" lang="java"><span class="cm"> * we might not be happy about the performance!  Such an implementation would do</span></span>
<span id="LC493" class="line" lang="java"><span class="cm"> * a great deal of string copying, and the run time would be &lt;em&gt;O(n^2)&lt;/em&gt; in</span></span>
<span id="LC494" class="line" lang="java"><span class="cm"> * the number of characters.  A more performant approach would be to accumulate</span></span>
<span id="LC495" class="line" lang="java"><span class="cm"> * the results into a {@link java.lang.StringBuilder}, which is a mutable</span></span>
<span id="LC496" class="line" lang="java"><span class="cm"> * container for accumulating strings.  We can use the same technique to</span></span>
<span id="LC497" class="line" lang="java"><span class="cm"> * parallelize mutable reduction as we do with ordinary reduction.</span></span>
<span id="LC498" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC499" class="line" lang="java"><span class="cm"> * &lt;p&gt;The mutable reduction operation is called</span></span>
<span id="LC500" class="line" lang="java"><span class="cm"> * {@link java.util.stream.Stream#collect(Collector) collect()},</span></span>
<span id="LC501" class="line" lang="java"><span class="cm"> * as it collects together the desired results into a result container such</span></span>
<span id="LC502" class="line" lang="java"><span class="cm"> * as a {@code Collection}.</span></span>
<span id="LC503" class="line" lang="java"><span class="cm"> * A {@code collect} operation requires three functions:</span></span>
<span id="LC504" class="line" lang="java"><span class="cm"> * a supplier function to construct new instances of the result container, an</span></span>
<span id="LC505" class="line" lang="java"><span class="cm"> * accumulator function to incorporate an input element into a result</span></span>
<span id="LC506" class="line" lang="java"><span class="cm"> * container, and a combining function to merge the contents of one result</span></span>
<span id="LC507" class="line" lang="java"><span class="cm"> * container into another.  The form of this is very similar to the general</span></span>
<span id="LC508" class="line" lang="java"><span class="cm"> * form of ordinary reduction:</span></span>
<span id="LC509" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC510" class="line" lang="java"><span class="cm"> * &lt;R&gt; R collect(Supplier&lt;R&gt; supplier,</span></span>
<span id="LC511" class="line" lang="java"><span class="cm"> *               BiConsumer&lt;R, ? super T&gt; accumulator,</span></span>
<span id="LC512" class="line" lang="java"><span class="cm"> *               BiConsumer&lt;R, R&gt; combiner);</span></span>
<span id="LC513" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC514" class="line" lang="java"><span class="cm"> * &lt;p&gt;As with {@code reduce()}, a benefit of expressing {@code collect} in this</span></span>
<span id="LC515" class="line" lang="java"><span class="cm"> * abstract way is that it is directly amenable to parallelization: we can</span></span>
<span id="LC516" class="line" lang="java"><span class="cm"> * accumulate partial results in parallel and then combine them, so long as the</span></span>
<span id="LC517" class="line" lang="java"><span class="cm"> * accumulation and combining functions satisfy the appropriate requirements.</span></span>
<span id="LC518" class="line" lang="java"><span class="cm"> * For example, to collect the String representations of the elements in a</span></span>
<span id="LC519" class="line" lang="java"><span class="cm"> * stream into an {@code ArrayList}, we could write the obvious sequential</span></span>
<span id="LC520" class="line" lang="java"><span class="cm"> * for-each form:</span></span>
<span id="LC521" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC522" class="line" lang="java"><span class="cm"> *     ArrayList&lt;String&gt; strings = new ArrayList&lt;&gt;();</span></span>
<span id="LC523" class="line" lang="java"><span class="cm"> *     for (T element : stream) {</span></span>
<span id="LC524" class="line" lang="java"><span class="cm"> *         strings.add(element.toString());</span></span>
<span id="LC525" class="line" lang="java"><span class="cm"> *     }</span></span>
<span id="LC526" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC527" class="line" lang="java"><span class="cm"> * Or we could use a parallelizable collect form:</span></span>
<span id="LC528" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC529" class="line" lang="java"><span class="cm"> *     ArrayList&lt;String&gt; strings = stream.collect(() -&gt; new ArrayList&lt;&gt;(),</span></span>
<span id="LC530" class="line" lang="java"><span class="cm"> *                                                (c, e) -&gt; c.add(e.toString()),</span></span>
<span id="LC531" class="line" lang="java"><span class="cm"> *                                                (c1, c2) -&gt; c1.addAll(c2));</span></span>
<span id="LC532" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC533" class="line" lang="java"><span class="cm"> * or, pulling the mapping operation out of the accumulator function, we could</span></span>
<span id="LC534" class="line" lang="java"><span class="cm"> * express it more succinctly as:</span></span>
<span id="LC535" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC536" class="line" lang="java"><span class="cm"> *     List&lt;String&gt; strings = stream.map(Object::toString)</span></span>
<span id="LC537" class="line" lang="java"><span class="cm"> *                                  .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);</span></span>
<span id="LC538" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC539" class="line" lang="java"><span class="cm"> * Here, our supplier is just the {@link java.util.ArrayList#ArrayList()</span></span>
<span id="LC540" class="line" lang="java"><span class="cm"> * ArrayList constructor}, the accumulator adds the stringified element to an</span></span>
<span id="LC541" class="line" lang="java"><span class="cm"> * {@code ArrayList}, and the combiner simply uses {@link java.util.ArrayList#addAll addAll}</span></span>
<span id="LC542" class="line" lang="java"><span class="cm"> * to copy the strings from one container into the other.</span></span>
<span id="LC543" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC544" class="line" lang="java"><span class="cm"> * &lt;p&gt;The three aspects of {@code collect} -- supplier, accumulator, and</span></span>
<span id="LC545" class="line" lang="java"><span class="cm"> * combiner -- are tightly coupled.  We can use the abstraction of a</span></span>
<span id="LC546" class="line" lang="java"><span class="cm"> * {@link java.util.stream.Collector} to capture all three aspects.  The</span></span>
<span id="LC547" class="line" lang="java"><span class="cm"> * above example for collecting strings into a {@code List} can be rewritten</span></span>
<span id="LC548" class="line" lang="java"><span class="cm"> * using a standard {@code Collector} as:</span></span>
<span id="LC549" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC550" class="line" lang="java"><span class="cm"> *     List&lt;String&gt; strings = stream.map(Object::toString)</span></span>
<span id="LC551" class="line" lang="java"><span class="cm"> *                                  .collect(Collectors.toList());</span></span>
<span id="LC552" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC553" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC554" class="line" lang="java"><span class="cm"> * &lt;p&gt;Packaging mutable reductions into a Collector has another advantage:</span></span>
<span id="LC555" class="line" lang="java"><span class="cm"> * composability.  The class {@link java.util.stream.Collectors} contains a</span></span>
<span id="LC556" class="line" lang="java"><span class="cm"> * number of predefined factories for collectors, including combinators</span></span>
<span id="LC557" class="line" lang="java"><span class="cm"> * that transform one collector into another.  For example, suppose we have a</span></span>
<span id="LC558" class="line" lang="java"><span class="cm"> * collector that computes the sum of the salaries of a stream of</span></span>
<span id="LC559" class="line" lang="java"><span class="cm"> * employees, as follows:</span></span>
<span id="LC560" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC561" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC562" class="line" lang="java"><span class="cm"> *     Collector&lt;Employee, ?, Integer&gt; summingSalaries</span></span>
<span id="LC563" class="line" lang="java"><span class="cm"> *         = Collectors.summingInt(Employee::getSalary);</span></span>
<span id="LC564" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC565" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC566" class="line" lang="java"><span class="cm"> * (The {@code ?} for the second type parameter merely indicates that we don't</span></span>
<span id="LC567" class="line" lang="java"><span class="cm"> * care about the intermediate representation used by this collector.)</span></span>
<span id="LC568" class="line" lang="java"><span class="cm"> * If we wanted to create a collector to tabulate the sum of salaries by</span></span>
<span id="LC569" class="line" lang="java"><span class="cm"> * department, we could reuse {@code summingSalaries} using</span></span>
<span id="LC570" class="line" lang="java"><span class="cm"> * {@link java.util.stream.Collectors#groupingBy(java.util.function.Function, java.util.stream.Collector) groupingBy}:</span></span>
<span id="LC571" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC572" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC573" class="line" lang="java"><span class="cm"> *     Map&lt;Department, Integer&gt; salariesByDept</span></span>
<span id="LC574" class="line" lang="java"><span class="cm"> *         = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,</span></span>
<span id="LC575" class="line" lang="java"><span class="cm"> *                                                            summingSalaries));</span></span>
<span id="LC576" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC577" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC578" class="line" lang="java"><span class="cm"> * &lt;p&gt;As with the regular reduction operation, {@code collect()} operations can</span></span>
<span id="LC579" class="line" lang="java"><span class="cm"> * only be parallelized if appropriate conditions are met.  For any partially</span></span>
<span id="LC580" class="line" lang="java"><span class="cm"> * accumulated result, combining it with an empty result container must</span></span>
<span id="LC581" class="line" lang="java"><span class="cm"> * produce an equivalent result.  That is, for a partially accumulated result</span></span>
<span id="LC582" class="line" lang="java"><span class="cm"> * {@code p} that is the result of any series of accumulator and combiner</span></span>
<span id="LC583" class="line" lang="java"><span class="cm"> * invocations, {@code p} must be equivalent to</span></span>
<span id="LC584" class="line" lang="java"><span class="cm"> * {@code combiner.apply(p, supplier.get())}.</span></span>
<span id="LC585" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC586" class="line" lang="java"><span class="cm"> * &lt;p&gt;Further, however the computation is split, it must produce an equivalent</span></span>
<span id="LC587" class="line" lang="java"><span class="cm"> * result.  For any input elements {@code t1} and {@code t2}, the results</span></span>
<span id="LC588" class="line" lang="java"><span class="cm"> * {@code r1} and {@code r2} in the computation below must be equivalent:</span></span>
<span id="LC589" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC590" class="line" lang="java"><span class="cm"> *     A a1 = supplier.get();</span></span>
<span id="LC591" class="line" lang="java"><span class="cm"> *     accumulator.accept(a1, t1);</span></span>
<span id="LC592" class="line" lang="java"><span class="cm"> *     accumulator.accept(a1, t2);</span></span>
<span id="LC593" class="line" lang="java"><span class="cm"> *     R r1 = finisher.apply(a1);  // result without splitting</span></span>
<span id="LC594" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC595" class="line" lang="java"><span class="cm"> *     A a2 = supplier.get();</span></span>
<span id="LC596" class="line" lang="java"><span class="cm"> *     accumulator.accept(a2, t1);</span></span>
<span id="LC597" class="line" lang="java"><span class="cm"> *     A a3 = supplier.get();</span></span>
<span id="LC598" class="line" lang="java"><span class="cm"> *     accumulator.accept(a3, t2);</span></span>
<span id="LC599" class="line" lang="java"><span class="cm"> *     R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting</span></span>
<span id="LC600" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC601" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC602" class="line" lang="java"><span class="cm"> * &lt;p&gt;Here, equivalence generally means according to {@link java.lang.Object#equals(Object)}.</span></span>
<span id="LC603" class="line" lang="java"><span class="cm"> * but in some cases equivalence may be relaxed to account for differences in</span></span>
<span id="LC604" class="line" lang="java"><span class="cm"> * order.</span></span>
<span id="LC605" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC606" class="line" lang="java"><span class="cm"> * &lt;h3&gt;&lt;a name="ConcurrentReduction"&gt;Reduction, concurrency, and ordering&lt;/a&gt;&lt;/h3&gt;</span></span>
<span id="LC607" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC608" class="line" lang="java"><span class="cm"> * With some complex reduction operations, for example a {@code collect()} that</span></span>
<span id="LC609" class="line" lang="java"><span class="cm"> * produces a {@code Map}, such as:</span></span>
<span id="LC610" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC611" class="line" lang="java"><span class="cm"> *     Map&lt;Buyer, List&lt;Transaction&gt;&gt; salesByBuyer</span></span>
<span id="LC612" class="line" lang="java"><span class="cm"> *         = txns.parallelStream()</span></span>
<span id="LC613" class="line" lang="java"><span class="cm"> *               .collect(Collectors.groupingBy(Transaction::getBuyer));</span></span>
<span id="LC614" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC615" class="line" lang="java"><span class="cm"> * it may actually be counterproductive to perform the operation in parallel.</span></span>
<span id="LC616" class="line" lang="java"><span class="cm"> * This is because the combining step (merging one {@code Map} into another by</span></span>
<span id="LC617" class="line" lang="java"><span class="cm"> * key) can be expensive for some {@code Map} implementations.</span></span>
<span id="LC618" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC619" class="line" lang="java"><span class="cm"> * &lt;p&gt;Suppose, however, that the result container used in this reduction</span></span>
<span id="LC620" class="line" lang="java"><span class="cm"> * was a concurrently modifiable collection -- such as a</span></span>
<span id="LC621" class="line" lang="java"><span class="cm"> * {@link java.util.concurrent.ConcurrentHashMap}. In that case, the parallel</span></span>
<span id="LC622" class="line" lang="java"><span class="cm"> * invocations of the accumulator could actually deposit their results</span></span>
<span id="LC623" class="line" lang="java"><span class="cm"> * concurrently into the same shared result container, eliminating the need for</span></span>
<span id="LC624" class="line" lang="java"><span class="cm"> * the combiner to merge distinct result containers. This potentially provides</span></span>
<span id="LC625" class="line" lang="java"><span class="cm"> * a boost to the parallel execution performance. We call this a</span></span>
<span id="LC626" class="line" lang="java"><span class="cm"> * &lt;em&gt;concurrent&lt;/em&gt; reduction.</span></span>
<span id="LC627" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC628" class="line" lang="java"><span class="cm"> * &lt;p&gt;A {@link java.util.stream.Collector} that supports concurrent reduction is</span></span>
<span id="LC629" class="line" lang="java"><span class="cm"> * marked with the {@link java.util.stream.Collector.Characteristics#CONCURRENT}</span></span>
<span id="LC630" class="line" lang="java"><span class="cm"> * characteristic.  However, a concurrent collection also has a downside.  If</span></span>
<span id="LC631" class="line" lang="java"><span class="cm"> * multiple threads are depositing results concurrently into a shared container,</span></span>
<span id="LC632" class="line" lang="java"><span class="cm"> * the order in which results are deposited is non-deterministic. Consequently,</span></span>
<span id="LC633" class="line" lang="java"><span class="cm"> * a concurrent reduction is only possible if ordering is not important for the</span></span>
<span id="LC634" class="line" lang="java"><span class="cm"> * stream being processed. The {@link java.util.stream.Stream#collect(Collector)}</span></span>
<span id="LC635" class="line" lang="java"><span class="cm"> * implementation will only perform a concurrent reduction if</span></span>
<span id="LC636" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC637" class="line" lang="java"><span class="cm"> * &lt;li&gt;The stream is parallel;&lt;/li&gt;</span></span>
<span id="LC638" class="line" lang="java"><span class="cm"> * &lt;li&gt;The collector has the</span></span>
<span id="LC639" class="line" lang="java"><span class="cm"> * {@link java.util.stream.Collector.Characteristics#CONCURRENT} characteristic,</span></span>
<span id="LC640" class="line" lang="java"><span class="cm"> * and;&lt;/li&gt;</span></span>
<span id="LC641" class="line" lang="java"><span class="cm"> * &lt;li&gt;Either the stream is unordered, or the collector has the</span></span>
<span id="LC642" class="line" lang="java"><span class="cm"> * {@link java.util.stream.Collector.Characteristics#UNORDERED} characteristic.</span></span>
<span id="LC643" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC644" class="line" lang="java"><span class="cm"> * You can ensure the stream is unordered by using the</span></span>
<span id="LC645" class="line" lang="java"><span class="cm"> * {@link java.util.stream.BaseStream#unordered()} method.  For example:</span></span>
<span id="LC646" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC647" class="line" lang="java"><span class="cm"> *     Map&lt;Buyer, List&lt;Transaction&gt;&gt; salesByBuyer</span></span>
<span id="LC648" class="line" lang="java"><span class="cm"> *         = txns.parallelStream()</span></span>
<span id="LC649" class="line" lang="java"><span class="cm"> *               .unordered()</span></span>
<span id="LC650" class="line" lang="java"><span class="cm"> *               .collect(groupingByConcurrent(Transaction::getBuyer));</span></span>
<span id="LC651" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC652" class="line" lang="java"><span class="cm"> * (where {@link java.util.stream.Collectors#groupingByConcurrent} is the</span></span>
<span id="LC653" class="line" lang="java"><span class="cm"> * concurrent equivalent of {@code groupingBy}).</span></span>
<span id="LC654" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC655" class="line" lang="java"><span class="cm"> * &lt;p&gt;Note that if it is important that the elements for a given key appear in</span></span>
<span id="LC656" class="line" lang="java"><span class="cm"> * the order they appear in the source, then we cannot use a concurrent</span></span>
<span id="LC657" class="line" lang="java"><span class="cm"> * reduction, as ordering is one of the casualties of concurrent insertion.</span></span>
<span id="LC658" class="line" lang="java"><span class="cm"> * We would then be constrained to implement either a sequential reduction or</span></span>
<span id="LC659" class="line" lang="java"><span class="cm"> * a merge-based parallel reduction.</span></span>
<span id="LC660" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC661" class="line" lang="java"><span class="cm"> * &lt;h3&gt;&lt;a name="Associativity"&gt;Associativity&lt;/a&gt;&lt;/h3&gt;</span></span>
<span id="LC662" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC663" class="line" lang="java"><span class="cm"> * An operator or function {@code op} is &lt;em&gt;associative&lt;/em&gt; if the following</span></span>
<span id="LC664" class="line" lang="java"><span class="cm"> * holds:</span></span>
<span id="LC665" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC666" class="line" lang="java"><span class="cm"> *     (a op b) op c == a op (b op c)</span></span>
<span id="LC667" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC668" class="line" lang="java"><span class="cm"> * The importance of this to parallel evaluation can be seen if we expand this</span></span>
<span id="LC669" class="line" lang="java"><span class="cm"> * to four terms:</span></span>
<span id="LC670" class="line" lang="java"><span class="cm"> * &lt;pre&gt;{@code</span></span>
<span id="LC671" class="line" lang="java"><span class="cm"> *     a op b op c op d == (a op b) op (c op d)</span></span>
<span id="LC672" class="line" lang="java"><span class="cm"> * }&lt;/pre&gt;</span></span>
<span id="LC673" class="line" lang="java"><span class="cm"> * So we can evaluate {@code (a op b)} in parallel with {@code (c op d)}, and</span></span>
<span id="LC674" class="line" lang="java"><span class="cm"> * then invoke {@code op} on the results.</span></span>
<span id="LC675" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC676" class="line" lang="java"><span class="cm"> * &lt;p&gt;Examples of associative operations include numeric addition, min, and</span></span>
<span id="LC677" class="line" lang="java"><span class="cm"> * max, and string concatenation.</span></span>
<span id="LC678" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC679" class="line" lang="java"><span class="cm"> * &lt;h2&gt;&lt;a name="StreamSources"&gt;Low-level stream construction&lt;/a&gt;&lt;/h2&gt;</span></span>
<span id="LC680" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC681" class="line" lang="java"><span class="cm"> * So far, all the stream examples have used methods like</span></span>
<span id="LC682" class="line" lang="java"><span class="cm"> * {@link java.util.Collection#stream()} or {@link java.util.Arrays#stream(Object[])}</span></span>
<span id="LC683" class="line" lang="java"><span class="cm"> * to obtain a stream.  How are those stream-bearing methods implemented?</span></span>
<span id="LC684" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC685" class="line" lang="java"><span class="cm"> * &lt;p&gt;The class {@link java.util.stream.StreamSupport} has a number of</span></span>
<span id="LC686" class="line" lang="java"><span class="cm"> * low-level methods for creating a stream, all using some form of a</span></span>
<span id="LC687" class="line" lang="java"><span class="cm"> * {@link java.util.Spliterator}. A spliterator is the parallel analogue of an</span></span>
<span id="LC688" class="line" lang="java"><span class="cm"> * {@link java.util.Iterator}; it describes a (possibly infinite) collection of</span></span>
<span id="LC689" class="line" lang="java"><span class="cm"> * elements, with support for sequentially advancing, bulk traversal, and</span></span>
<span id="LC690" class="line" lang="java"><span class="cm"> * splitting off some portion of the input into another spliterator which can</span></span>
<span id="LC691" class="line" lang="java"><span class="cm"> * be processed in parallel.  At the lowest level, all streams are driven by a</span></span>
<span id="LC692" class="line" lang="java"><span class="cm"> * spliterator.</span></span>
<span id="LC693" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC694" class="line" lang="java"><span class="cm"> * &lt;p&gt;There are a number of implementation choices in implementing a</span></span>
<span id="LC695" class="line" lang="java"><span class="cm"> * spliterator, nearly all of which are tradeoffs between simplicity of</span></span>
<span id="LC696" class="line" lang="java"><span class="cm"> * implementation and runtime performance of streams using that spliterator.</span></span>
<span id="LC697" class="line" lang="java"><span class="cm"> * The simplest, but least performant, way to create a spliterator is to</span></span>
<span id="LC698" class="line" lang="java"><span class="cm"> * create one from an iterator using</span></span>
<span id="LC699" class="line" lang="java"><span class="cm"> * {@link java.util.Spliterators#spliteratorUnknownSize(java.util.Iterator, int)}.</span></span>
<span id="LC700" class="line" lang="java"><span class="cm"> * While such a spliterator will work, it will likely offer poor parallel</span></span>
<span id="LC701" class="line" lang="java"><span class="cm"> * performance, since we have lost sizing information (how big is the</span></span>
<span id="LC702" class="line" lang="java"><span class="cm"> * underlying data set), as well as being constrained to a simplistic</span></span>
<span id="LC703" class="line" lang="java"><span class="cm"> * splitting algorithm.</span></span>
<span id="LC704" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC705" class="line" lang="java"><span class="cm"> * &lt;p&gt;A higher-quality spliterator will provide balanced and known-size</span></span>
<span id="LC706" class="line" lang="java"><span class="cm"> * splits, accurate sizing information, and a number of other</span></span>
<span id="LC707" class="line" lang="java"><span class="cm"> * {@link java.util.Spliterator#characteristics() characteristics} of the</span></span>
<span id="LC708" class="line" lang="java"><span class="cm"> * spliterator or data that can be used by implementations to optimize</span></span>
<span id="LC709" class="line" lang="java"><span class="cm"> * execution.</span></span>
<span id="LC710" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC711" class="line" lang="java"><span class="cm"> * &lt;p&gt;Spliterators for mutable data sources have an additional challenge;</span></span>
<span id="LC712" class="line" lang="java"><span class="cm"> * timing of binding to the data, since the data could change between the time</span></span>
<span id="LC713" class="line" lang="java"><span class="cm"> * the spliterator is created and the time the stream pipeline is executed.</span></span>
<span id="LC714" class="line" lang="java"><span class="cm"> * Ideally, a spliterator for a stream would report a characteristic of</span></span>
<span id="LC715" class="line" lang="java"></span>
<span id="LC716" class="line" lang="java"><span class="cm"> * {@code IMMUTABLE} or {@code CONCURRENT}; if not it should be</span></span>
<span id="LC717" class="line" lang="java"><span class="cm"> * &lt;a href="../Spliterator.html#binding"&gt;&lt;em&gt;late-binding&lt;/em&gt;&lt;/a&gt;. If a source</span></span>
<span id="LC718" class="line" lang="java"><span class="cm"> * cannot directly supply a recommended spliterator, it may indirectly supply</span></span>
<span id="LC719" class="line" lang="java"><span class="cm"> * a spliterator using a {@code Supplier}, and construct a stream via the</span></span>
<span id="LC720" class="line" lang="java"><span class="cm"> * {@code Supplier}-accepting versions of</span></span>
<span id="LC721" class="line" lang="java"><span class="cm"> * {@link java.util.stream.StreamSupport#stream(Supplier, int, boolean) stream()}.</span></span>
<span id="LC722" class="line" lang="java"><span class="cm"> * The spliterator is obtained from the supplier only after the terminal</span></span>
<span id="LC723" class="line" lang="java"><span class="cm"> * operation of the stream pipeline commences.</span></span>
<span id="LC724" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC725" class="line" lang="java"><span class="cm"> * &lt;p&gt;These requirements significantly reduce the scope of potential</span></span>
<span id="LC726" class="line" lang="java"><span class="cm"> * interference between mutations of the stream source and execution of stream</span></span>
<span id="LC727" class="line" lang="java"><span class="cm"> * pipelines. Streams based on spliterators with the desired characteristics,</span></span>
<span id="LC728" class="line" lang="java"><span class="cm"> * or those using the Supplier-based factory forms, are immune to</span></span>
<span id="LC729" class="line" lang="java"><span class="cm"> * modifications of the data source prior to commencement of the terminal</span></span>
<span id="LC730" class="line" lang="java"><span class="cm"> * operation (provided the behavioral parameters to the stream operations meet</span></span>
<span id="LC731" class="line" lang="java"><span class="cm"> * the required criteria for non-interference and statelessness).  See</span></span>
<span id="LC732" class="line" lang="java"><span class="cm"> * &lt;a href="package-summary.html#NonInterference"&gt;Non-Interference&lt;/a&gt;</span></span>
<span id="LC733" class="line" lang="java"><span class="cm"> * for more details.</span></span>
<span id="LC734" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC735" class="line" lang="java"><span class="cm"> * @since 1.8</span></span>
<span id="LC736" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC737" class="line" lang="java"><span class="kn">package</span> <span class="nn">java.util.stream</span><span class="o">;</span></span>
<span id="LC738" class="line" lang="java"></span>
<span id="LC739" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.function.BinaryOperator</span><span class="o">;</span></span>
<span id="LC740" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.function.UnaryOperator</span><span class="o">;</span></span>
